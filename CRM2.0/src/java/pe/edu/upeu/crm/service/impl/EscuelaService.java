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
import pe.edu.upeu.crm.bean.Escuela;
import pe.edu.upeu.crm.dao.HibernateParam;
import pe.edu.upeu.crm.dao.impl.EscuelaDAO;
import pe.edu.upeu.crm.service.CRUDService;

/**
 *
 * @author Leandro Burgos
 */
@Service
public class EscuelaService implements CRUDService<Escuela>{

    @Autowired
    private EscuelaDAO escuelaDAO;
    
    @Override
    @Transactional
    public Object add(Escuela bean) {
        bean.setEscFechaCreacion(new Date());
        bean.setEscFechaAdd(new Date());
        bean.setEscUsuAdd(1);
        bean.setEscEstado("1");
        Logger.info("Registrando Escuela");
        return escuelaDAO.add(bean);
    }

    @Override
    @Transactional
    public int update(Escuela bean) {
        bean.setEscFechaUpd(new Date());
        bean.setEscUsuUpd(1);
        Logger.info("Actualizando Escuela");
        return escuelaDAO.update(bean);
    }

    @Override
    @Transactional
    public int delete(Escuela bean) {
        Logger.info("Eliminando Escuela");
        return escuelaDAO.delete(bean);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Escuela> list(Object... param) {
        Logger.info("Listando todos las escuelas");
        return escuelaDAO.list();
    }

    @Override
    @Transactional(readOnly = true)
    public List<Escuela> listEnabled(Object... param) {
        Logger.info("Listando todos las escuelas activas");
        return escuelaDAO.listEnabled(new HibernateParam("idIglesia", param[0]));
    }

    @Override
    @Transactional(readOnly = true)
    public List<Escuela> listDisabled(Object... param) {
        return escuelaDAO.listDisabled(new HibernateParam("idIglesia", param[0]));
    }

    @Override
    @Transactional(readOnly = true)
    public List<Escuela> search(Object... param) {
        return escuelaDAO.search(new HibernateParam("escNombre", param[0]));
    }

    @Override
    @Transactional(readOnly = true)
    public Escuela get(Object... id) {
        return escuelaDAO.get(new HibernateParam("idEscuela", id[0]));
    }

    @Override
    @Transactional(readOnly = true)
    public Escuela getByParent(Object... parentID) {
        return escuelaDAO.getByParent(new HibernateParam("idIglesia", parentID[0]));
    }
    
}
