/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.crm.config;

import java.util.Map;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("userDetailsService")
@Transactional(readOnly=true)
public class UserDetailsServiceImpl implements UserDetailsService {
	/*private UsuarioDAO ud=new UsuarioDAO(AppConfig.getDataSource());
	private RolDAO rd=new RolDAO(AppConfig.getDataSource());*/
	
    @Override
	public CustomUser loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		/*Map<String, Object> userinfo=ud.getByUserName(username);
		CustomUser user=new CustomUser(userinfo,rd.List_Modulos(userinfo.get("ID_ROL")),
				true,true,true,true);
		System.out.println("loadByUsername is running");*/
		//return user;
            return null;
	}

}