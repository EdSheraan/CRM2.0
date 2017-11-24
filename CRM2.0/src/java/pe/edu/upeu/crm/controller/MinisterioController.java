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
import pe.edu.upeu.crm.bean.Ministerio;
import pe.edu.upeu.crm.service.impl.MinisterioService;

/**
 *
 * @author Leandro Burgos
 */
@Controller
@Scope("request")
@RequestMapping("ministerio")
public class MinisterioController {
    
    @Autowired
    private MinisterioService ministerioService;
    
    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public ModelAndView showJspMinisterio(ModelMap model) {
        return new ModelAndView("ministerio/jspMinisterioMain", model);
    }
    
    @RequestMapping(value = "/add", produces = "application/json; charset=UTF-8", method = RequestMethod.POST)
    public @ResponseBody
    Integer addMinisterio(@RequestBody Ministerio ministerio) {
        return (Integer) ministerioService.add(ministerio);
    }

    @RequestMapping(value = "/update", produces = "application/json; charset=UTF-8", method = RequestMethod.POST)
    public @ResponseBody
    Integer updateMinisterio(@RequestBody Ministerio ministerio) {
        return ministerioService.update(ministerio);
    }

    @RequestMapping(value = "/delete", produces = "application/json; charset=UTF-8", method = RequestMethod.POST)
    public @ResponseBody
    Integer deleteMinisterio(@RequestBody Ministerio ministerio) {
        return ministerioService.delete(ministerio);
    }

    @RequestMapping(value = "/list", produces = "application/json; charset=UTF-8", method = RequestMethod.POST)
    public @ResponseBody
    List<Ministerio> listMinisterio() {
        return ministerioService.list((Object[]) null);
    }
    
}
