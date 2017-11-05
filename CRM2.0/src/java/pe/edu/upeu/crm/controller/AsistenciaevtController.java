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
import pe.edu.upeu.crm.bean.Asistenciaevt;
import pe.edu.upeu.crm.bean.Evento;
import pe.edu.upeu.crm.service.impl.AsistenciaevtService;

/**
 *
 * @author Leandro Burgos
 */
@Controller
@Scope("request")
@RequestMapping("asistenciaevt")
public class AsistenciaevtController {

    @Autowired
    private AsistenciaevtService asistenciaevtService;
    private ModelAndView modelAndView;

    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public ModelAndView showJspAsistenciaevt(ModelMap model) {
        modelAndView = new ModelAndView("asistenciaevt/jspAsistenciaevtMain", model);
        return modelAndView;
    }

    @RequestMapping(value = "/add", produces = "application/json; charset=UTF-8", method = RequestMethod.POST)
    public @ResponseBody
    Integer addAsistenciaevt(@RequestBody Asistenciaevt asistenciaevt) {
        return (Integer) asistenciaevtService.add(asistenciaevt);
    }

    @RequestMapping(value = "/update", produces = "application/json; charset=UTF-8", method = RequestMethod.POST)
    public @ResponseBody
    Integer updateAsistenciaevt(@RequestBody Asistenciaevt asistenciaevt) {
        return asistenciaevtService.update(asistenciaevt);
    }

    @RequestMapping(value = "/delete", produces = "application/json; charset=UTF-8", method = RequestMethod.POST)
    public @ResponseBody
    Integer deleteAsistenciaevt(@RequestBody Asistenciaevt asistenciaevt) {
        return asistenciaevtService.delete(asistenciaevt);
    }

    @RequestMapping(value = "/list", produces = "application/json; charset=UTF-8", method = RequestMethod.POST)
    public @ResponseBody
    List<Asistenciaevt> listAsistenciaevt(@RequestBody Evento evento) {
        return asistenciaevtService.listEnabled(evento.getIdEvento());
    }

}
