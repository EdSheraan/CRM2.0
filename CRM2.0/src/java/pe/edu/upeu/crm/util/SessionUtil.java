/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.crm.util;

import javax.servlet.http.HttpSession;

/**
 *
 * @author Andres
 */
public class SessionUtil {

    public static final String ROL_LIST = "rolList";
    public static final String ROL_SELECTED = "rolSelected";
    public static final String PRV_ROL = "prvRol";
    
    public static String getString(HttpSession session, String key){
        try {
            return session.getAttribute(key).toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
    
    public static int getInteger(HttpSession session, String key){
        try {
            return Integer.parseInt(session.getAttribute(key).toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

}
