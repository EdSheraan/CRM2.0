/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.crm.service;

import java.util.List;
import org.pmw.tinylog.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import pe.edu.upeu.crm.bean.Persona;
import pe.edu.upeu.crm.dao.PersonaDAO;

/**
 *
 * @author Leandro Burgos
 */
public class PersonaService implements CRUDService<Persona>{
    
    @Autowired
    private PersonaDAO personaDAO;

    @Override
    public Object add(Persona bean) {
        Logger.info("Registrando persona");
        return personaDAO.add(bean);
    }

    @Override
    public int update(Persona bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(Persona bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Persona> list(Object... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Persona> listEnabled(Object... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Persona> listDisabled(Object... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Persona> search(Object... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Persona get(Object... id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
