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
import pe.edu.upeu.crm.bean.Evento;
import pe.edu.upeu.crm.dao.HibernateParam;
import pe.edu.upeu.crm.dao.impl.EventoDAO;
import pe.edu.upeu.crm.service.CRUDService;

/**
 *
 * @author Leandro Burgos
 */
@Service
public class EventoService implements CRUDService<Evento> {

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
        return eventoDAO.list();
    }

    @Override
    @Transactional(readOnly = true)
    public List<Evento> listEnabled(Object... param) {
        Logger.info("Listando los eventos activos");
        return eventoDAO.listEnabled(new HibernateParam("idPeriodo", param[0]));
    }

    @Transactional(readOnly = true)
    public List<Evento> listActive(Object... param) {
        Logger.info("Listando los eventos activos - grupo,distrito,iglesia");
        HibernateParam p1 = new HibernateParam("idPeriodo", param[0]);
        HibernateParam p2 = new HibernateParam("idDistrito", param[1]);
        return eventoDAO.listActive(p1, p2);
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

    @Override
    public Evento getByParent(Object... parentID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
