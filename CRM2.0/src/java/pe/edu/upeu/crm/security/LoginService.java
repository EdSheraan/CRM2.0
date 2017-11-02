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
import pe.edu.upeu.crm.bean.Campo;
import pe.edu.upeu.crm.bean.CustomUserDetails;
import pe.edu.upeu.crm.bean.Detrol;
import pe.edu.upeu.crm.bean.Distrito;
import pe.edu.upeu.crm.bean.Escuela;
import pe.edu.upeu.crm.bean.Grupo;
import pe.edu.upeu.crm.bean.Iglesia;
import pe.edu.upeu.crm.bean.Ministerio;
import pe.edu.upeu.crm.bean.Unionp;
import pe.edu.upeu.crm.bean.Usuario;
import pe.edu.upeu.crm.service.impl.CampoService;
import pe.edu.upeu.crm.service.impl.DetRolService;
import pe.edu.upeu.crm.service.impl.DistritoService;
import pe.edu.upeu.crm.service.impl.EscuelaService;
import pe.edu.upeu.crm.service.impl.GrupoService;
import pe.edu.upeu.crm.service.impl.IglesiaService;
import pe.edu.upeu.crm.service.impl.MinisterioService;
import pe.edu.upeu.crm.service.impl.UnionpService;
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

    private UnionpService unionpService;

    @Autowired
    public void setUnionpService(UnionpService unionpService) {
        this.unionpService = unionpService;
    }

    private CampoService campoService;

    @Autowired
    public void setCampoService(CampoService campoService) {
        this.campoService = campoService;
    }

    private DistritoService distritoService;

    @Autowired
    public void setDistritoService(DistritoService distritoService) {
        this.distritoService = distritoService;
    }

    private IglesiaService iglesiaService;

    @Autowired
    public void setIglesiaService(IglesiaService iglesiaService) {
        this.iglesiaService = iglesiaService;
    }

    private MinisterioService ministerioService;

    @Autowired
    public void setMinisterioService(MinisterioService ministerioService) {
        this.ministerioService = ministerioService;
    }

    private EscuelaService escuelaService;

    @Autowired
    public void setEscuelaService(EscuelaService escuelaService) {
        this.escuelaService = escuelaService;
    }

    private GrupoService grupoService;

    @Autowired
    public void setGrupoService(GrupoService grupoService) {
        this.grupoService = grupoService;
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
        
        userDetails.setUnionp((usuario.getUsuUnion() != null) ? 
                unionpService.get(usuario.getUsuUnion()) : new Unionp());
        userDetails.setCampo((usuario.getUsuCampo()!= null) ? 
                campoService.get(usuario.getUsuCampo()) : new Campo());
        userDetails.setDistrito((usuario.getUsuDistrito()!= null) ? 
                distritoService.get(usuario.getUsuDistrito()) : new Distrito());
        userDetails.setIglesia((usuario.getUsuIglesia()!= null) ? 
                iglesiaService.get(usuario.getUsuIglesia()) : new Iglesia());
        userDetails.setMinisterio((usuario.getUsuMinisterio()!= null) ? 
                ministerioService.get(usuario.getUsuMinisterio()) : new Ministerio());
        userDetails.setEscuela((usuario.getUsuEscuela()!= null) ? 
                escuelaService.get(usuario.getUsuEscuela()) : new Escuela());
        userDetails.setGrupo((usuario.getUsuGrupo()!= null) ? 
                grupoService.get(usuario.getUsuGrupo()) : new Grupo());
        
        Logger.info("Iniciando sesion, usuario=" + string);
        return userDetails;
    }

    private List<SimpleGrantedAuthority> buildSimpleGrantedAuthorities(Usuario usuario) {
        List<SimpleGrantedAuthority> simpleGrantedAuthorities = new ArrayList<>();
        List<Detrol> detrols = detRolService.listEnabled(usuario.getIdUsuario());
        for (int i = 0; i < detrols.size(); i++) {
            Detrol detrol = detrols.get(i);
            simpleGrantedAuthorities.add(new SimpleGrantedAuthority(detrol.getRol().getRolCodigo()));
        }
        return simpleGrantedAuthorities;
    }

    public static CustomUserDetails getPrincipal() {
        return (CustomUserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }

}
