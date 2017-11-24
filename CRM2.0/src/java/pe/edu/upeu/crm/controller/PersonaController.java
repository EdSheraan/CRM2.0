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
import pe.edu.upeu.crm.bean.Persona;
import pe.edu.upeu.crm.service.impl.PersonaService;

/**
 *
 * @author Andres
 */
@Controller
@Scope("request")
@RequestMapping("persona")
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    //Aqui van los métodos que muestran las vistas
    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public ModelAndView showJspPersona(ModelMap model) {
        return new ModelAndView("persona/jspPersonaMain", model);
    }

    //Aqui van los métodos del CRUD.
    @RequestMapping(value = "/add", produces = "application/json; charset=UTF-8", method = RequestMethod.POST)
    public @ResponseBody
    Integer addPersona(@RequestBody Persona persona) {
        return (Integer) personaService.add(persona);
    }

    @RequestMapping(value = "/update", produces = "application/json; charset=UTF-8", method = RequestMethod.POST)
    public @ResponseBody
    Integer updatePersona(@RequestBody Persona persona) {
        return personaService.update(persona);
    }

    @RequestMapping(value = "/delete", produces = "application/json; charset=UTF-8", method = RequestMethod.POST)
    public @ResponseBody
    Integer deletePersona(@RequestBody Persona persona) {
        return personaService.delete(persona);
    }

    @RequestMapping(value = "/list", produces = "application/json; charset=UTF-8", method = RequestMethod.POST)
    public @ResponseBody
    List<Persona> listPersona() {
        return personaService.list((Object[]) null);
    }
}
