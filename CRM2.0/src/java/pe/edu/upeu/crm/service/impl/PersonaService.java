/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.crm.service.impl;

import java.util.Date;
import java.util.List;
import org.pmw.tinylog.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upeu.crm.bean.Persona;
import pe.edu.upeu.crm.dao.impl.PersonaDAO;
import pe.edu.upeu.crm.service.CRUDService;

/**
 *
 * @author Leandro Burgos
 */
@Service
public class PersonaService implements CRUDService<Persona>{
    
    @Autowired
    private PersonaDAO personaDAO;

    @Override
    @Transactional
    public Object add(Persona bean) {
        bean.setPerEstado("1");
        bean.setPerUsuAdd(1);
        bean.setPerFechaAdd(new Date());
        bean.setPerBautizado("1");
        Logger.info("Registrando persona");
        return personaDAO.add(bean);
    }

    @Override
    public int update(Persona bean) {
        Logger.info("Actualizando persona");
        return personaDAO.update(bean);
    }

    @Override
    public int delete(Persona bean) {
        Logger.info("Eliminando persona");
        return personaDAO.update(bean);
    }

    @Override
    public List<Persona> list(Object... param) {
        Logger.info("Listando todas las personas");
        return personaDAO.list();
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
