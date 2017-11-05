/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.crm.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import pe.edu.upeu.crm.bean.Privilegio;
import pe.edu.upeu.crm.util.SessionUtil;

/**
 *
 * @author Andres
 */
@Controller
@Scope("request")
@RequestMapping("privilegio")
public class PrivilegioController {

    private ModelAndView modelAndView;

    @RequestMapping(value = "/main", method = RequestMethod.POST)
    public ModelAndView privilegioRol(ModelMap model, HttpServletRequest request, HttpSession session) {
        int opc = Integer.parseInt(request.getParameter("opc"));
        String vista = "";
        try {
            if (opc == 8) {
                vista = "redirect:/usuario/main";
            } else {
                vista = "privilegios";
            }
            session.setAttribute(SessionUtil.MOD_ACT, opc);
        } catch (Exception e) {
            System.out.println("error en privilegioController : " + e);
        }
        modelAndView = new ModelAndView(vista, model);
        return modelAndView;
    }
}
