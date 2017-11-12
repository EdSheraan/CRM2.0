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
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upeu.crm.bean.Eventopersona;
import pe.edu.upeu.crm.dao.impl.EventopersonaDAO;
import pe.edu.upeu.crm.service.CRUDService;

/**
 *
 * @author Andres
 */
@Service
public class EventopersonaService implements CRUDService<Eventopersona> {

    @Autowired
    private EventopersonaDAO eventopersonaDAO;

    @Override
    @Transactional
    public Object add(Eventopersona bean) {
        Logger.info("Registrando Eventopersona");
        return eventopersonaDAO.add(bean);
    }

    @Override
    public int update(Eventopersona bean) {
        Logger.info("Actualizando Eventopersona");
        return eventopersonaDAO.update(bean);
    }

    @Override
    public int delete(Eventopersona bean) {
        Logger.info("Eliminando Eventopersona");
        return eventopersonaDAO.delete(bean);
    }

    @Override
    public List<Eventopersona> list(Object... param) {
        Logger.info("Listando todos los Eventopersona");
        return eventopersonaDAO.list();
    }

    @Override
    public List<Eventopersona> listEnabled(Object... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Eventopersona> listDisabled(Object... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Eventopersona> search(Object... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Eventopersona get(Object... id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Eventopersona getByParent(Object... parentID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Transactional
    public Object addAsis(List<Eventopersona> asmiembros) {
        int n = 0;
        Logger.info("Registrando asistencia de miembros");
        for (int i = 0; i < asmiembros.size(); i++) {
            n = n + 1;
            add(asmiembros.get(i));
        }
        return n;
    }

}
