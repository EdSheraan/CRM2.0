package pe.edu.upeu.crm.controller;

import javax.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import pe.edu.upeu.crm.util.SessionUtil;

@Controller
public class HomeController {

    @RequestMapping("/main")
    public String main() {
        return "main";
    }

    @RequestMapping("/menu")
    public String menu(HttpSession session) {
        if(session.getAttribute(SessionUtil.ROL_SELECTED) == null){
            return "redirect:/rol/select";
        }else{
            return "menu";
        }
    }

    @RequestMapping("/privilegios")
    public String privilegios() {
        return "privilegios";
    }

}
