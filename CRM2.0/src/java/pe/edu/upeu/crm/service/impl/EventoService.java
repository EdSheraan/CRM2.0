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
import pe.edu.upeu.crm.bean.Evento;
import pe.edu.upeu.crm.dao.impl.EventoDAO;
import pe.edu.upeu.crm.service.CRUDService;

/**
 *
 * @author Leandro Burgos
 */
@Service
public class EventoService implements CRUDService<Evento>{

    @Autowired
    private EventoDAO eventoDAO;
    
    @Override
    public Object add(Evento bean) {
        Logger.info("Registrando Evento");
        return eventoDAO.add(bean);
    }

    @Override
    public int update(Evento bean) {
        Logger.info("Actualizando Evento");
        return eventoDAO.update(bean);
    }

    @Override
    public int delete(Evento bean) {
        Logger.info("Eliminando Evento");
        return eventoDAO.update(bean);
    }

    @Override
    public List<Evento> list(Object... param) {
        Logger.info("Listando todas los eventos");
        return eventoDAO.list(param);
    }

    @Override
    public List<Evento> listEnabled(Object... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Evento> listDisabled(Object... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Evento> search(Object... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Evento get(Object... id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
