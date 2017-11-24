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
import pe.edu.upeu.crm.bean.Eventoministerio;
import pe.edu.upeu.crm.service.impl.EventoministerioService;

/**
 *
 * @author Leandro Burgos
 */
@Controller
@Scope("request")
@RequestMapping("eventoministerio")
public class EventoministerioController {
    
    @Autowired
    private EventoministerioService eventoministerioService;
    
    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public ModelAndView showJspEventoministerio(ModelMap model) {
        return new ModelAndView("eventoministerio/jspEventoministerioMain", model);
    }
    
    @RequestMapping(value = "/add", produces = "application/json; charset=UTF-8", method = RequestMethod.POST)
    public @ResponseBody
    Integer addEventoministerio(@RequestBody Eventoministerio eventoministerio) {
        return (Integer) eventoministerioService.add(eventoministerio);
    }

    @RequestMapping(value = "/update", produces = "application/json; charset=UTF-8", method = RequestMethod.POST)
    public @ResponseBody
    Integer updateEventoministerio(@RequestBody Eventoministerio eventoministerio) {
        return eventoministerioService.update(eventoministerio);
    }

    @RequestMapping(value = "/delete", produces = "application/json; charset=UTF-8", method = RequestMethod.POST)
    public @ResponseBody
    Integer deleteEventoministerio(@RequestBody Eventoministerio eventoministerio) {
        return eventoministerioService.delete(eventoministerio);
    }

    @RequestMapping(value = "/list", produces = "application/json; charset=UTF-8", method = RequestMethod.POST)
    public @ResponseBody
    List<Eventoministerio> listEventoministerio() {
        return eventoministerioService.list((Object[]) null);
    }
    
}
