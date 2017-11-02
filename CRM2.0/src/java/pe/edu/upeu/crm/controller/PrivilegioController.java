/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.crm.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import pe.edu.upeu.crm.bean.Privilegio;

/**
 *
 * @author Andres
 */
@Controller
@Scope("request")
@RequestMapping("privilegio")
public class PrivilegioController {

    private ModelAndView modelAndView;

    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public ModelAndView privilegioRol(ModelMap model) {
        //System.out.println(privilegio.getPrvLink());
        modelAndView = new ModelAndView("privilegios", model);
        return modelAndView;
    }
}
