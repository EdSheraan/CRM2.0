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
import pe.edu.upeu.crm.bean.Escuela;
import pe.edu.upeu.crm.service.impl.EscuelaService;

/**
 *
 * @author Leandro Burgos
 */
@Controller
@Scope("request")
@RequestMapping("escuela")
public class EscuelaController {
    
    @Autowired
    private EscuelaService escuelaService;
    private ModelAndView modelAndView;
    
    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public ModelAndView showJspEscuela(ModelMap model) {
        modelAndView = new ModelAndView("escuela/jspEscuelaMain", model);
        return modelAndView;
    }
    
    @RequestMapping(value = "/add", produces = "application/json; charset=UTF-8", method = RequestMethod.POST)
    public @ResponseBody
    Integer addEscuela(@RequestBody Escuela escuela) {
        return (Integer) escuelaService.add(escuela);
    }

    @RequestMapping(value = "/update", produces = "application/json; charset=UTF-8", method = RequestMethod.POST)
    public @ResponseBody
    Integer updateEscuela(@RequestBody Escuela escuela) {
        return escuelaService.update(escuela);
    }

    @RequestMapping(value = "/delete", produces = "application/json; charset=UTF-8", method = RequestMethod.POST)
    public @ResponseBody
    Integer deleteEscuela(@RequestBody Escuela escuela) {
        return escuelaService.delete(escuela);
    }

    @RequestMapping(value = "/list", produces = "application/json; charset=UTF-8", method = RequestMethod.POST)
    public @ResponseBody
    List<Escuela> listEscuela() {
        return escuelaService.list((Object[]) null);
    }
    
}
