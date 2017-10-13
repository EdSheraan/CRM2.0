/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.crm.security;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.pmw.tinylog.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upeu.crm.bean.CustomUserDetails;
import pe.edu.upeu.crm.bean.Detrol;
import pe.edu.upeu.crm.bean.Rol;
import pe.edu.upeu.crm.bean.Usuario;
import pe.edu.upeu.crm.dao.HibernateParam;
import pe.edu.upeu.crm.service.impl.DetRolService;
import pe.edu.upeu.crm.service.impl.RolService;
import pe.edu.upeu.crm.service.impl.UsuarioService;

/**
 *
 * @author Andres
 */
@Service("loginService")
public class LoginService implements UserDetailsService {

    private UsuarioService usuarioService;

    @Autowired
    public void setUsuarioService(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    private DetRolService detRolService;

    @Autowired
    public void setDetRolService(DetRolService detRolService) {
        this.detRolService = detRolService;
    }

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String string) throws UsernameNotFoundException {
        Usuario usuario = usuarioService.get(string);
        List<SimpleGrantedAuthority> simpleGrantedAuthorities = buildSimpleGrantedAuthorities(usuario);
        CustomUserDetails userDetails = new CustomUserDetails(simpleGrantedAuthorities,
                usuario.getUsuUsuario(), usuario.getUsuClave(), usuario.getPersona().getPerNombres(),
                usuario.getPersona().getPerApellidos(), usuario.getIdUsuario(), true, true, true,
                (usuario.getUsuEstado().equals("1")));
        Logger.info("Iniciando sesion, usuario=" + string);
        return userDetails;
    }

    private List<SimpleGrantedAuthority> buildSimpleGrantedAuthorities(Usuario usuario) {
        List<SimpleGrantedAuthority> simpleGrantedAuthorities = new ArrayList<>();
        List<Detrol> detrols = detRolService.listEnabled(usuario.getIdUsuario());
        for (int i = 0; i < detrols.size(); i++) {
            System.out.println(detrols.get(i).getClass().getName());
            Detrol detrol = detrols.get(i);
            simpleGrantedAuthorities.add(new SimpleGrantedAuthority(detrol.getRol().getRolCodigo()));
        }
        return simpleGrantedAuthorities;
    }

    public static CustomUserDetails getPrincipal() {
        return (CustomUserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }

}
