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
import pe.edu.upeu.crm.bean.Unionp;
import pe.edu.upeu.crm.service.impl.UnionpService;

/**
 *
 * @author Leandro Burgos
 */
@Controller
@Scope("request")
@RequestMapping("unionp")
public class UnionpController {
    
    @Autowired
    private UnionpService unionpService;
    
    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public ModelAndView showJspUnionp(ModelMap model) {
        return new ModelAndView("unionp/jspUnionpMain", model);
    }
    
    @RequestMapping(value = "/add", produces = "application/json; charset=UTF-8", method = RequestMethod.POST)
    public @ResponseBody
    Integer addUnionp(@RequestBody Unionp unionp) {
        return (Integer) unionpService.add(unionp);
    }

    @RequestMapping(value = "/update", produces = "application/json; charset=UTF-8", method = RequestMethod.POST)
    public @ResponseBody
    Integer updateUnionp(@RequestBody Unionp unionp) {
        return unionpService.update(unionp);
    }

    @RequestMapping(value = "/delete", produces = "application/json; charset=UTF-8", method = RequestMethod.POST)
    public @ResponseBody
    Integer deleteUnionp(@RequestBody Unionp unionp) {
        return unionpService.delete(unionp);
    }

    @RequestMapping(value = "/list", produces = "application/json; charset=UTF-8", method = RequestMethod.POST)
    public @ResponseBody
    List<Unionp> listUnionp() {
        return unionpService.list((Object[]) null);
    }
    
}
