/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.crm.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import pe.edu.upeu.crm.bean.Campo;
import pe.edu.upeu.crm.service.impl.CampoService;

/**
 *
 * @author Leandro Burgos
 */
@Controller
@Scope("request")
@RequestMapping("campo")
public class CampoController {
    
    @Autowired
    private CampoService campoService;
    private ModelAndView modelAndView;
    
    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public ModelAndView showJspCampo(ModelMap model) {
        modelAndView = new ModelAndView("campo/jspCampoMain", model);
        return modelAndView;
    }
    
    @RequestMapping(value = "/add", produces = "application/json; charset=UTF-8", method = RequestMethod.POST)
    public @ResponseBody
    Integer addCampo(@RequestBody Campo campo) {
        return (Integer) campoService.add(campo);
    }

    @RequestMapping(value = "/update", produces = "application/json; charset=UTF-8", method = RequestMethod.POST)
    public @ResponseBody
    Integer updateCampo(@RequestBody Campo campo) {
        return campoService.update(campo);
    }

    @RequestMapping(value = "/delete", produces = "application/json; charset=UTF-8", method = RequestMethod.POST)
    public @ResponseBody
    Integer deleteCampo(@RequestBody Campo campo) {
        return campoService.delete(campo);
    }

    @RequestMapping(value = "/list", produces = "application/json; charset=UTF-8", method = RequestMethod.POST)
    public @ResponseBody
    List<Campo> listCampo() {
        return campoService.list((Object[]) null);
    }
    
}
