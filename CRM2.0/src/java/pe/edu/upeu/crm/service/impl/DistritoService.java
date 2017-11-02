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
import pe.edu.upeu.crm.bean.Distrito;
import pe.edu.upeu.crm.dao.HibernateParam;
import pe.edu.upeu.crm.dao.impl.DistritoDAO;
import pe.edu.upeu.crm.service.CRUDService;

/**
 *
 * @author Leandro Burgos
 */
@Service
public class DistritoService implements CRUDService<Distrito>{

    @Autowired
    private DistritoDAO distritoDAO;
    
    @Override
    @Transactional
    public Object add(Distrito bean) {
        bean.setDisFechaCreacion(new Date());
        bean.setDisEstado("1");
        Logger.info("Registrando Distrito");
        return distritoDAO.add(bean);
    }

    @Override
    @Transactional
    public int update(Distrito bean) {
        Logger.info("Actualizando Distrito");
        return distritoDAO.update(bean);
    }

    @Override
    @Transactional
    public int delete(Distrito bean) {
        Logger.info("Eliminando Distrito");
        return distritoDAO.delete(bean);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Distrito> list(Object... param) {
        Logger.info("Listando todos los distritos");
        return distritoDAO.list();
    }

    @Override
    @Transactional(readOnly = true)
    public List<Distrito> listEnabled(Object... param) {
        return distritoDAO.listEnabled(new HibernateParam("idCampo", param[0]));
    }

    @Override
    @Transactional(readOnly = true)
    public List<Distrito> listDisabled(Object... param) {
        return distritoDAO.listDisabled(new HibernateParam("idCampo", param[0]));
    }

    @Override
    @Transactional(readOnly = true)
    public List<Distrito> search(Object... param) {
        return distritoDAO.search(new HibernateParam("disNombre", param[0]));
    }

    @Override
    @Transactional(readOnly = true)
    public Distrito get(Object... id) {
        return distritoDAO.get(new HibernateParam("idDistrito", id[0]));
    }

    @Override
    @Transactional(readOnly = true)
    public Distrito getByParent(Object... parentID) {
        return distritoDAO.getByParent(new HibernateParam("idCampo", parentID[0]));
    }
}
