/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.upeu.crm.test;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import pe.edu.upeu.crm.bean.Grupo;
import pe.edu.upeu.crm.dao.HibernateParam;
import pe.edu.upeu.crm.dao.impl.GrupoDAO;
import pe.edu.upeu.crm.service.impl.GrupoService;

/**
 *
 * @author Leandro Burgos
 */
public class SQLTest {

    /**
     * @param args the command line arguments
     */
    public static GrupoDAO aO = new GrupoDAO();

    public static void main(String[] args) {
        testGrupos(1);
    }

    public static void testGrupos(Object... param) {
        try {
            List<Grupo> grupos = aO.listEnabled(new HibernateParam("idEscuela", param[0]));
            System.out.println(grupos.size());
        } catch (Exception e) {
            System.out.println("E : " + e);
        }
    }

}
