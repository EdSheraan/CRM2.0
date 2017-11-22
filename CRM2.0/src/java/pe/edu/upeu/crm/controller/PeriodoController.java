/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.crm.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import pe.edu.upeu.crm.bean.Periodo;
import pe.edu.upeu.crm.service.impl.PeriodoService;

/**
 *
 * @author Andres
 */
@Controller
@Scope("request")
@RequestMapping("periodo")
public class PeriodoController {

    @Autowired
    private PeriodoService periodoService;

    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public ModelAndView showJspDistrito(ModelMap model) {
        return new ModelAndView("periodo/jspPeriodoMain", model);
    }

    @RequestMapping(value = "/add", produces = "application/json; charset=UTF-8", method = RequestMethod.POST)
    public @ResponseBody
    Integer addPeriodo(@RequestBody Periodo periodo) {
        return (Integer) periodoService.add(periodo);
    }

    @RequestMapping(value = "/update", produces = "application/json; charset=UTF-8", method = RequestMethod.POST)
    public @ResponseBody
    Integer updatePeriodo(@RequestBody Periodo periodo) {
        return periodoService.update(periodo);
    }

    @RequestMapping(value = "/delete", produces = "application/json; charset=UTF-8", method = RequestMethod.POST)
    public @ResponseBody
    Integer deletePeriodo(@RequestBody Periodo periodo) {
        return periodoService.delete(periodo);
    }

    @RequestMapping(value = "/list", produces = "application/json; charset=UTF-8", method = RequestMethod.POST)
    public @ResponseBody
    List<Periodo> listPeriodo(@RequestBody Periodo periodo) {
        return periodoService.listEnabled(periodo.getPrdDistrito(), periodo.getPrdIglesia());
    }

    @RequestMapping(value = "/get", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
    public @ResponseBody
    Periodo getPeriodo(@RequestBody Periodo periodo) {
        return periodoService.get(periodo.getIdPeriodo());
    }
}
