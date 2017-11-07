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
import pe.edu.upeu.crm.bean.Asmiemgp;
import pe.edu.upeu.crm.service.impl.AsmiemgpService;

/**
 *
 * @author Leandro Burgos
 */
@Controller
@Scope("request")
@RequestMapping("asmiemgp")
public class AsmiemgpController {

    @Autowired
    private AsmiemgpService asmiemgpService;
    private ModelAndView modelAndView;

    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public ModelAndView showJspAsmiemgp(ModelMap model) {
        modelAndView = new ModelAndView("asmiemgp/jspAsmiemgpMain", model);
        return modelAndView;
    }

    @RequestMapping(value = "/addABC", produces = "application/json; charset=UTF-8", method = RequestMethod.POST)
    public @ResponseBody
    Integer addAsmiemgp(@RequestBody Asmiemgp asmiemgp) {
        return (Integer) asmiemgpService.add(asmiemgp);
    }

    @RequestMapping(value = "/add", produces = "application/json; charset=UTF-8", method = RequestMethod.POST)
    public @ResponseBody
    Integer addAsmiemgp(@RequestBody List<Asmiemgp> asmiemgp) {
        return (Integer) asmiemgpService.addAsis(asmiemgp);
    }

    @RequestMapping(value = "/update", produces = "application/json; charset=UTF-8", method = RequestMethod.POST)
    public @ResponseBody
    Integer updateAsmiemgp(@RequestBody Asmiemgp asmiemgp) {
        return asmiemgpService.update(asmiemgp);
    }

    @RequestMapping(value = "/delete", produces = "application/json; charset=UTF-8", method = RequestMethod.POST)
    public @ResponseBody
    Integer deleteAsmiemgp(@RequestBody Asmiemgp asmiemgp) {
        return asmiemgpService.delete(asmiemgp);
    }

    @RequestMapping(value = "/list", produces = "application/json; charset=UTF-8", method = RequestMethod.POST)
    public @ResponseBody
    List<Asmiemgp> listAsmiemgp() {
        return asmiemgpService.list((Object[]) null);
    }

}
