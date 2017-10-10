package pe.edu.upeu.crm.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
public class HomeController {
    @RequestMapping("/main")
    public String main() {
        return "main";
    }
    
    @RequestMapping("/menu")
    public String menu() {
        return "menu";
    }
}
