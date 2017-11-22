package pe.edu.upeu.crm.controller;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;
import pe.edu.upeu.crm.util.SessionUtil;

@Controller
public class HomeController {

    
    
    @RequestMapping("/main")
    public String main() {
        return "main";
    }

    @RequestMapping("/menu")
    public ModelAndView menu(ModelMap model,HttpSession session) {
        if(session.getAttribute(SessionUtil.ROL_SELECTED) == null){
            return new ModelAndView("redirect:/rol/select", model);
        }else{
            return new ModelAndView("menu", model);
        }
    }

}
