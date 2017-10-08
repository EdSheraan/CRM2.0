package pe.edu.upeu.crm.controller;

import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
/*@RequestMapping("/")
public class HomeController {

    @GetMapping("/login")
    public ModelAndView hello(HttpServletRequest request, HttpServletResponse response, @RequestParam(value = "error", required = false) String error,
            @RequestParam(value = "logout", required = false) String logout) {
        ModelAndView model = new ModelAndView();
        if (error != null) {
            model.addObject("error", "Usuario y/o contraseña incorrecta!");
        }

        if (logout != null) {
            model.addObject("msg", "Has cerrado sesión.");
        }
        model.setViewName("login");

        return model;
    }

    @GetMapping(value = {"menu", "/"})
    public String menu(HttpServletRequest request, HttpServletResponse response) {
        String opc = request.getParameter("opc");
        String pagina = "menu";
        return pagina;
    }

    @GetMapping("/logout")
    public void logout(HttpServletRequest request, HttpServletResponse response) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null) {
            new SecurityContextLogoutHandler().logout(request, response, auth);
            System.out.println("Logged Out Successfully!");
        }
        try {
            response.sendRedirect("login?logout");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}*/
public class HomeController {
    @RequestMapping("/login")
    public String login() {
        return "login";
    }
    
    @RequestMapping("/index")
    public String index() {
        return "index";
    }
}
