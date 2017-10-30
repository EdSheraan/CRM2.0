/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.crm.controller;

import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import pe.edu.upeu.crm.bean.Rol;
import pe.edu.upeu.crm.security.LoginService;
import pe.edu.upeu.crm.service.impl.RolService;
import pe.edu.upeu.crm.util.SessionUtil;

/**
 *
 * @author Andres
 */
@Controller
@Scope("request")
@RequestMapping("rol")
public class RolController {

    @Autowired
    private RolService rolService;

    private ModelAndView modelAndView;

    @RequestMapping("/select")
    public ModelAndView selectRols(HttpSession session) {
        List<Rol> rols = rolService.listEnabled(LoginService.getPrincipal().getIdPersona());
        if (rols.size() == 1) {
            session.setAttribute(SessionUtil.ROL_SELECTED, rols.get(0));
        }
        session.setAttribute(SessionUtil.ROL_LIST, rols);
        modelAndView = new ModelAndView("roles");
        return modelAndView;
    }
    
    @RequestMapping("/select/r")
    public ModelAndView selectRol(@ModelAttribute Rol rol,HttpSession session) {
        session.setAttribute(SessionUtil.ROL_SELECTED, rol);
        modelAndView = new ModelAndView("redirect:/menu");
        return modelAndView;
    }
    
    
}
