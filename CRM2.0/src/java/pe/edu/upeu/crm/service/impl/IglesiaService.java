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
import pe.edu.upeu.crm.bean.Iglesia;
import pe.edu.upeu.crm.dao.HibernateParam;
import pe.edu.upeu.crm.dao.impl.IglesiaDAO;
import pe.edu.upeu.crm.service.CRUDService;

/**
 *
 * @author Leandro Burgos
 */
@Service
public class IglesiaService implements CRUDService<Iglesia> {

    @Autowired
    private IglesiaDAO iglesiaDAO;

    @Override
    @Transactional
    public Object add(Iglesia bean) {
        bean.setIglFechaAdd(new Date());
        bean.setIglFechaCreacion(new Date());
        bean.setIglUsuAdd(1);
        bean.setIglEstado("1");
        Logger.info("Registrando Iglesia");
        return iglesiaDAO.add(bean);
    }

    @Override
    @Transactional
    public int update(Iglesia bean) {
        bean.setIglFechaUpd(new Date());
        bean.setIglUsuUpd(1);
        Logger.info("Actualizando Iglesia");
        return iglesiaDAO.update(bean);
    }

    @Override
    public int delete(Iglesia bean) {
        Logger.info("Eliminando Iglesia");
        return iglesiaDAO.update(bean);
    }

    @Override
    public List<Iglesia> list(Object... param) {
        Logger.info("Listando todos las iglesias");
        return iglesiaDAO.list();
    }

    @Override
    @Transactional(readOnly = true)
    public List<Iglesia> listEnabled(Object... param) {
        return iglesiaDAO.listEnabled(new HibernateParam("idDistrito", param[0]));
    }

    @Override
    public List<Iglesia> listDisabled(Object... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Iglesia> search(Object... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Iglesia get(Object... id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Transactional
    public Iglesia getIglesia(int id) {
        return iglesiaDAO.getIglesia(new HibernateParam("idIglesia", id));
    }
}
