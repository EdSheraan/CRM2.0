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
import pe.edu.upeu.crm.bean.Ministerio;
import pe.edu.upeu.crm.dao.HibernateParam;
import pe.edu.upeu.crm.dao.impl.MinisterioDAO;
import pe.edu.upeu.crm.service.CRUDService;

/**
 *
 * @author Leandro Burgos
 */
@Service
public class MinisterioService implements CRUDService<Ministerio>{
    
    @Autowired
    private MinisterioDAO ministerioDAO;

    @Override
    @Transactional
    public Object add(Ministerio bean) {
        Logger.info("Registrando ministerio");
        return ministerioDAO.add(bean);
    }

    @Override
    @Transactional
    public int update(Ministerio bean) {
        Logger.info("Actualizando ministerio");
        return ministerioDAO.update(bean);
    }

    @Override
    @Transactional
    public int delete(Ministerio bean) {
        Logger.info("Eliminando ministerio");
        return ministerioDAO.delete(bean);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Ministerio> list(Object... param) {
        Logger.info("Listando todas las ministerios");
        return ministerioDAO.list();
    }

    @Override
    @Transactional(readOnly = true)
    public List<Ministerio> listEnabled(Object... param) {
        return ministerioDAO.listEnabled(new HibernateParam("idIglesia", param[0]));
    }

    @Override
    @Transactional(readOnly = true)
    public List<Ministerio> listDisabled(Object... param) {
        return ministerioDAO.listDisabled(new HibernateParam("idIglesia", param[0]));
    }

    @Override
    @Transactional(readOnly = true)
    public List<Ministerio> search(Object... param) {
        return ministerioDAO.search(new HibernateParam("minNombre", param[0]));
    }

    @Override
    @Transactional(readOnly = true)
    public Ministerio get(Object... id) {
        return ministerioDAO.get(new HibernateParam("idMinisterio", id[0]));
    }

    @Override
    @Transactional(readOnly = true)
    public Ministerio getByParent(Object... parentID) {
        return ministerioDAO.getByParent(new HibernateParam("idIglesia", parentID[0]));
    }
    
}
