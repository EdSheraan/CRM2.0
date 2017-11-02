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
import pe.edu.upeu.crm.bean.Distrito;
import pe.edu.upeu.crm.bean.Iglesia;
import pe.edu.upeu.crm.service.impl.IglesiaService;

/**
 *
 * @author Leandro Burgos
 */
@Controller
@Scope("request")
@RequestMapping("iglesia")
public class IglesiaController {

    @Autowired
    private IglesiaService iglesiaService;
    private ModelAndView modelAndView;

    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public ModelAndView showJspIglesia(ModelMap model) {
        modelAndView = new ModelAndView("iglesia/jspIglesiaMain", model);
        return modelAndView;
    }

    @RequestMapping(value = "/add", produces = "application/json; charset=UTF-8", method = RequestMethod.POST)
    public @ResponseBody
    Integer addIglesia(@RequestBody Iglesia iglesia) {
        return (Integer) iglesiaService.add(iglesia);
    }

    @RequestMapping(value = "/update", produces = "application/json; charset=UTF-8", method = RequestMethod.POST)
    public @ResponseBody
    Integer updateIglesia(@RequestBody Iglesia iglesia) {
        return iglesiaService.update(iglesia);
    }

    @RequestMapping(value = "/delete", produces = "application/json; charset=UTF-8", method = RequestMethod.POST)
    public @ResponseBody
    Integer deleteIglesia(@RequestBody Iglesia iglesia) {
        return iglesiaService.delete(iglesia);
    }

    @RequestMapping(value = "/list", produces = "application/json; charset=UTF-8", method = RequestMethod.POST)
    public @ResponseBody
    List<Iglesia> listIglesia(@RequestBody Distrito distrito) {
        return iglesiaService.listEnabled(distrito.getIdDistrito());
    }

    @RequestMapping(value = "/get", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
    public @ResponseBody
    Iglesia listIglesia(@RequestBody Iglesia iglesia) {
        return iglesiaService.get(iglesia.getIdIglesia());
    }
    
}
