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
import pe.edu.upeu.crm.bean.Evento;
import pe.edu.upeu.crm.bean.Periodo;
import pe.edu.upeu.crm.service.impl.EventoService;

/**
 *
 * @author Andres
 */
@Controller
@Scope("request")
@RequestMapping("evento")
public class EventoController {

    @Autowired
    private EventoService eventoService;

    

    //Aqui van los métodos que muestran las vistas
    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public ModelAndView showJspEvento(ModelMap model) {
        return new ModelAndView("evento/jspEventoMain", model);
    }

    //Aqui van los métodos del CRUD.
    @RequestMapping(value = "/add", produces = "application/json; charset=UTF-8", method = RequestMethod.POST)
    public @ResponseBody
    Integer addEvento(@RequestBody Evento evento) {
        return (Integer) eventoService.add(evento);
    }

    @RequestMapping(value = "/update", produces = "application/json; charset=UTF-8", method = RequestMethod.POST)
    public @ResponseBody
    Integer updateEvento(@RequestBody Evento evento) {
        return eventoService.update(evento);
    }

    @RequestMapping(value = "/delete", produces = "application/json; charset=UTF-8", method = RequestMethod.POST)
    public @ResponseBody
    Integer deleteEvento(@RequestBody Evento evento) {
        return eventoService.delete(evento);
    }

    @RequestMapping(value = "/list", produces = "application/json; charset=UTF-8", method = RequestMethod.POST)
    public @ResponseBody
    List<Evento> listEvento(@RequestBody Periodo periodo) {
        return eventoService.listEnabled(periodo.getIdPeriodo());
    }

    @RequestMapping(value = "/active", produces = "application/json; charset=UTF-8", method = RequestMethod.POST)
    public @ResponseBody
    List<Evento> listEventoActive(@RequestBody Evento evento) {
        int a = evento.getPeriodo().getIdPeriodo();
        int b = evento.getEvtDistrito();
        return eventoService.listActive(a, b);
    }

}
