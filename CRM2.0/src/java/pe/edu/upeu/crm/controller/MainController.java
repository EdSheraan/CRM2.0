/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.crm.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;

/**
 *
 * @author Leandro Burgos
 */
@Controller
public class MainController {
    Authentication auth = SecurityContextHolder.getContext().getAuthentication();
    
    
}
