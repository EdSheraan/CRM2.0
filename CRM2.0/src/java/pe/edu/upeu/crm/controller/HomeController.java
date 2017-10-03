package pe.edu.upeu.crm.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller

public class HomeController {

    @RequestMapping("/login")
    public String index() {
        return "login";
    }
}
