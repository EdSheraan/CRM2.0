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
import pe.edu.upeu.crm.bean.Campo;
import pe.edu.upeu.crm.dao.HibernateParam;
import pe.edu.upeu.crm.dao.impl.CampoDAO;
import pe.edu.upeu.crm.service.CRUDService;

/**
 *
 * @author Andres
 */
@Service
public class CampoService implements CRUDService<Campo> {

    @Autowired
    private CampoDAO campoDAO;

    @Override
    @Transactional
    public Object add(Campo bean) {
        Logger.info("Agregando Campo");
        return campoDAO.add(bean);
    }

    @Override
    @Transactional
    public int update(Campo bean) {
        Logger.info("Actualizando Campo");
        return campoDAO.update(bean);
    }

    @Override
    @Transactional
    public int delete(Campo bean) {
        Logger.info("Eliminando Campo");
        return campoDAO.delete(bean);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Campo> list(Object... param) {
        Logger.info("Listando todos los campos");
        return campoDAO.list();
    }

    @Override
    @Transactional(readOnly = true)
    public List<Campo> listEnabled(Object... param) {
        return campoDAO.listEnabled(new HibernateParam("idUnion", param[0]));
    }

    @Override
    @Transactional(readOnly = true)
    public List<Campo> listDisabled(Object... param) {
        return campoDAO.listDisabled(new HibernateParam("idUnion", param[0]));
    }

    @Override
    @Transactional(readOnly = true)
    public List<Campo> search(Object... param) {
        return campoDAO.search(new HibernateParam("cmpNombre", param[0]));
    }

    @Override
    @Transactional(readOnly = true)
    public Campo get(Object... id) {
        return campoDAO.get(new HibernateParam("idCampo", id[0]));
    }

    @Override
    @Transactional(readOnly = true)
    public Campo getByParent(Object... parentID) {
        return campoDAO.getByParent(new HibernateParam("idUnion", parentID[0]));
    }

}
