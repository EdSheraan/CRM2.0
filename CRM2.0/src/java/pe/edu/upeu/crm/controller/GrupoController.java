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
import pe.edu.upeu.crm.bean.Escuela;
import pe.edu.upeu.crm.bean.Grupo;
import pe.edu.upeu.crm.service.impl.GrupoService;

/**
 *
 * @author Leandro Burgos
 */
@Controller
@Scope("request")
@RequestMapping("grupo")
public class GrupoController {

    @Autowired
    private GrupoService grupoService;
    
    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public ModelAndView showJspGrupo(ModelMap model) {
        model.addAttribute("mensaje", "Hola mundo");
        return new ModelAndView("grupo/jspGrupoMain", model);
    }

    @RequestMapping(value = "/add", produces = "application/json; charset=UTF-8", method = RequestMethod.POST)
    public @ResponseBody
    Integer addGrupo(@RequestBody Grupo grupo) {
        return (Integer) grupoService.add(grupo);
    }

    @RequestMapping(value = "/update", produces = "application/json; charset=UTF-8", method = RequestMethod.POST)
    public @ResponseBody
    Integer updateGrupo(@RequestBody Grupo grupo) {
        return grupoService.update(grupo);
    }

    @RequestMapping(value = "/delete", produces = "application/json; charset=UTF-8", method = RequestMethod.POST)
    public @ResponseBody
    Integer deleteGrupo(@RequestBody Grupo grupo) {
        return grupoService.delete(grupo);
    }

    @RequestMapping(value = "/list", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
    public @ResponseBody
    List<Grupo> listGrupo(@RequestBody Escuela escuela) {
        return grupoService.listEnabled(escuela.getIdEscuela());
    }

    @RequestMapping(value = "/get", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
    public @ResponseBody
    Grupo listGrupo(@RequestBody Grupo grupo) {
        return grupoService.get(grupo.getIdGrupo());
    }
    
    }
