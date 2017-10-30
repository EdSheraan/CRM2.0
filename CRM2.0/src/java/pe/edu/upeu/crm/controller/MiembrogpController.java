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
import pe.edu.upeu.crm.bean.Grupo;
import pe.edu.upeu.crm.bean.Miembrogp;
import pe.edu.upeu.crm.service.impl.MiembrogpService;

/**
 *
 * @author Leandro Burgos
 */
@Controller
@Scope("request")
@RequestMapping("miembrogp")
public class MiembrogpController {
    
    @Autowired
    private MiembrogpService miembrogpService;
    private ModelAndView modelAndView;
    
    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public ModelAndView showJspMiembrogp(ModelMap model) {
        modelAndView = new ModelAndView("miembrogp/jspMiembrogpMain", model);
        return modelAndView;
    }
    
    @RequestMapping(value = "/add", produces = "application/json; charset=UTF-8", method = RequestMethod.POST)
    public @ResponseBody
    Integer addMiembrogp(@RequestBody Miembrogp miembrogp) {
        return (Integer) miembrogpService.add(miembrogp);
    }

    @RequestMapping(value = "/update", produces = "application/json; charset=UTF-8", method = RequestMethod.POST)
    public @ResponseBody
    Integer updateMiembrogp(@RequestBody Miembrogp miembrogp) {
        return miembrogpService.update(miembrogp);
    }

    @RequestMapping(value = "/delete", produces = "application/json; charset=UTF-8", method = RequestMethod.POST)
    public @ResponseBody
    Integer deleteMiembrogp(@RequestBody Miembrogp miembrogp) {
        return miembrogpService.delete(miembrogp);
    }

    @RequestMapping(value = "/list", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
    public @ResponseBody
    List<Miembrogp> listMiembrogp(@RequestBody Grupo grupo) {
        return miembrogpService.list(grupo.getIdGrupo());
    }
    
}
