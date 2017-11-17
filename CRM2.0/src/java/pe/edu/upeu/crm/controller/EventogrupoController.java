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
import pe.edu.upeu.crm.bean.Eventogrupo;
import pe.edu.upeu.crm.bean.Evento;
import pe.edu.upeu.crm.bean.Grupo;
import pe.edu.upeu.crm.service.impl.EventogrupoService;
import pe.edu.upeu.crm.service.impl.EventoService;

/**
 *
 * @author Leandro Burgos
 */
@Controller
@Scope("request")
@RequestMapping("eventogrupo")
public class EventogrupoController {

    @Autowired
    private EventogrupoService eventogrupoService;
    private ModelAndView modelAndView;

    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public ModelAndView showJspEventogrupo(ModelMap model) {
        modelAndView = new ModelAndView("eventogrupo/jspEventogrupoMain", model);
        return modelAndView;
    }

    @RequestMapping(value = "/add", produces = "application/json; charset=UTF-8", method = RequestMethod.POST)
    public @ResponseBody
    Object addEventogrupo(@RequestBody Eventogrupo eventogrupo) {
        return eventogrupoService.add(eventogrupo);
    }

    @RequestMapping(value = "/update", produces = "application/json; charset=UTF-8", method = RequestMethod.POST)
    public @ResponseBody
    Integer updateEventogrupo(@RequestBody Eventogrupo eventogrupo) {
        return eventogrupoService.update(eventogrupo);
    }

    @RequestMapping(value = "/delete", produces = "application/json; charset=UTF-8", method = RequestMethod.POST)
    public @ResponseBody
    Integer deleteEventogrupo(@RequestBody Eventogrupo eventogrupo) {
        return eventogrupoService.delete(eventogrupo);
    }

    @RequestMapping(value = "/list", produces = "application/json; charset=UTF-8", method = RequestMethod.POST)
    public @ResponseBody
    List<Eventogrupo> listEventogrupo(@RequestBody Grupo grupo) {
        return eventogrupoService.listEnabled(grupo.getIdGrupo());
    }

    @RequestMapping(value = "/getinfo", produces = "application/json; charset=UTF-8", method = RequestMethod.POST)
    public @ResponseBody
    List<Eventogrupo> getInfoEventogrupo(@RequestBody Eventogrupo eventogrupo) {
        int a = eventogrupo.getId().getIdEvento();
        int b = eventogrupo.getId().getIdGrupo();
        return eventogrupoService.getInfoEvento(a, b);
    }

}
