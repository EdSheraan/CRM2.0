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
import pe.edu.upeu.crm.bean.Personaevento;
import pe.edu.upeu.crm.service.impl.PersonaeventoService;

/**
 *
 * @author Leandro Burgos
 */
@Controller
@Scope("request")
@RequestMapping("personaevento")
public class PersonaeventoController {

    @Autowired
    private PersonaeventoService personaeventoService;
    private ModelAndView modelAndView;

    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public ModelAndView showJspPersonaevento(ModelMap model) {
        modelAndView = new ModelAndView("personaevento/jspPersonaeventoMain", model);
        return modelAndView;
    }

    @RequestMapping(value = "/addABC", produces = "application/json; charset=UTF-8", method = RequestMethod.POST)
    public @ResponseBody
    Integer addPersonaevento(@RequestBody Personaevento personaevento) {
        return (Integer) personaeventoService.add(personaevento);
    }

    @RequestMapping(value = "/add", produces = "application/json; charset=UTF-8", method = RequestMethod.POST)
    public @ResponseBody
    Integer addPersonaevento(@RequestBody List<Personaevento> personaevento) {
        return (Integer) personaeventoService.addAsis(personaevento);
    }

    @RequestMapping(value = "/update", produces = "application/json; charset=UTF-8", method = RequestMethod.POST)
    public @ResponseBody
    Integer updatePersonaevento(@RequestBody Personaevento personaevento) {
        return personaeventoService.update(personaevento);
    }

    @RequestMapping(value = "/delete", produces = "application/json; charset=UTF-8", method = RequestMethod.POST)
    public @ResponseBody
    Integer deletePersonaevento(@RequestBody Personaevento personaevento) {
        return personaeventoService.delete(personaevento);
    }

    @RequestMapping(value = "/list", produces = "application/json; charset=UTF-8", method = RequestMethod.POST)
    public @ResponseBody
    List<Personaevento> listPersonaevento() {
        return personaeventoService.list((Object[]) null);
    }

}
