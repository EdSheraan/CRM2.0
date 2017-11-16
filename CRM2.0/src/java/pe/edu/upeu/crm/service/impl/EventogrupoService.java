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
import pe.edu.upeu.crm.bean.Eventogrupo;
import pe.edu.upeu.crm.dao.HibernateParam;
import pe.edu.upeu.crm.dao.impl.EventogrupoDAO;
import pe.edu.upeu.crm.service.CRUDService;

/**
 *
 * @author Andres
 */
@Service
public class EventogrupoService implements CRUDService<Eventogrupo> {

    @Autowired
    private EventogrupoDAO eventogrupoDAO;

    @Override
    @Transactional
    public Object add(Eventogrupo bean) {
        //bean.setAstFechaRegistro(new Date());
        Logger.info("Registrando Eventogrupo");
        return eventogrupoDAO.add(bean);
    }

    @Override
    public int update(Eventogrupo bean) {
        Logger.info("Actualizando Eventogrupo");
        return eventogrupoDAO.update(bean);
    }

    @Override
    public int delete(Eventogrupo bean) {
        Logger.info("Eliminando Eventogrupo");
        return eventogrupoDAO.delete(bean);
    }

    @Override
    public List<Eventogrupo> list(Object... param) {
        Logger.info("Listando todos los Eventogrupo");
        return eventogrupoDAO.list();
    }

    @Override
    @Transactional(readOnly = true)
    public List<Eventogrupo> listEnabled(Object... param) {
        Logger.info("buscando evento activo");
        //return eventogrupoDAO.listEnabled(new HibernateParam("idGrupo", param[0]));
        return eventogrupoDAO.list();
    }
    
    @Transactional(readOnly = true)
    public List<Eventogrupo> getInfoEvento(Object... param) {
        Logger.info("buscando evento activo");
        //return eventogrupoDAO.listEnabled(new HibernateParam("idGrupo", param[0]));
        return eventogrupoDAO.list();
    }

    @Override
    public List<Eventogrupo> listDisabled(Object... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Eventogrupo> search(Object... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Eventogrupo get(Object... id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Eventogrupo getByParent(Object... parentID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
