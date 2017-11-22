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
import pe.edu.upeu.crm.bean.Campo;
import pe.edu.upeu.crm.bean.Distrito;
import pe.edu.upeu.crm.service.impl.DistritoService;

/**
 *
 * @author Leandro Burgos
 */
@Controller
@Scope("request")
@RequestMapping("distrito")
public class DistritoController {
    
    @Autowired
    private DistritoService distritoService;
    
    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public ModelAndView showJspDistrito(ModelMap model) {
        return new ModelAndView("distrito/jspDistritoMain", model);
    }
    
    @RequestMapping(value = "/add", produces = "application/json; charset=UTF-8", method = RequestMethod.POST)
    public @ResponseBody
    Integer addDistrito(@RequestBody Distrito distrito) {
        return (Integer) distritoService.add(distrito);
    }

    @RequestMapping(value = "/update", produces = "application/json; charset=UTF-8", method = RequestMethod.POST)
    public @ResponseBody
    Integer updateDistrito(@RequestBody Distrito distrito) {
        return distritoService.update(distrito);
    }

    @RequestMapping(value = "/delete", produces = "application/json; charset=UTF-8", method = RequestMethod.POST)
    public @ResponseBody
    Integer deleteDistrito(@RequestBody Distrito distrito) {
        return distritoService.delete(distrito);
    }

    @RequestMapping(value = "/list", produces = "application/json; charset=UTF-8", method = RequestMethod.POST)
    public @ResponseBody
    List<Distrito> listDistrito(@RequestBody Campo campo) {
        return distritoService.listEnabled(campo.getIdCampo());
    }

    @RequestMapping(value = "/get", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
    public @ResponseBody
    Distrito listDistrito(@RequestBody Distrito distrito) {
        return distritoService.get(distrito.getIdDistrito());
    }
    
}
