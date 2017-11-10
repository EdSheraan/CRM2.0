/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.crm.service.impl;

import java.util.List;
import org.pmw.tinylog.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upeu.crm.bean.Eventoministerio;
import pe.edu.upeu.crm.dao.impl.EventoministerioDAO;
import pe.edu.upeu.crm.service.CRUDService;

/**
 *
 * @author Andres
 */
@Service
public class EventoministerioService implements CRUDService<Eventoministerio>{
    
    @Autowired
    private EventoministerioDAO eventoministerioDAO;
    
    @Override
    public Object add(Eventoministerio bean) {
        Logger.info("Agregando Eventoministerio");
        return eventoministerioDAO.add(bean);
    }

    @Override
    public int update(Eventoministerio bean) {
        Logger.info("Actualizando Eventoministerio");
        return eventoministerioDAO.update(bean);
    }

    @Override
    public int delete(Eventoministerio bean) {
        Logger.info("Eliminando Eventoministerio");
        return eventoministerioDAO.delete(bean);
    }

    @Override
    public List<Eventoministerio> list(Object... param) {
        Logger.info("Listando todos los Eventoministerio");
        return eventoministerioDAO.list();
    }

    @Override
    public List<Eventoministerio> listEnabled(Object... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Eventoministerio> listDisabled(Object... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Eventoministerio> search(Object... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Eventoministerio get(Object... id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Eventoministerio getByParent(Object... parentID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
