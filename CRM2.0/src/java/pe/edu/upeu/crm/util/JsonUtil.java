/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.crm.util;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 *
 * @author Andres
 */
public class JsonUtil {
    public static String map(Object o){
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.writeValueAsString(o);
        } catch (Exception e) {
        }
        return "";
    }
    
}
