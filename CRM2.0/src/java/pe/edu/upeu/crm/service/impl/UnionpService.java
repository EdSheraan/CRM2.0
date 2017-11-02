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
import pe.edu.upeu.crm.bean.Unionp;
import pe.edu.upeu.crm.dao.HibernateParam;
import pe.edu.upeu.crm.dao.impl.UnionpDAO;
import pe.edu.upeu.crm.service.CRUDService;

/**
 *
 * @author Leandro Burgos
 */
@Service
public class UnionpService implements CRUDService<Unionp>{

    @Autowired
    private UnionpDAO unionpDAO;
    
    @Override
    @Transactional
    public Object add(Unionp bean) {
        bean.setUniFechaCreacion(new Date());
        bean.setUniEstado("1");
        Logger.info("Registrando Unionp");
        return unionpDAO.add(bean);
    }

    @Override
    @Transactional
    public int update(Unionp bean) {
        Logger.info("Actualizando Unionp");
        return unionpDAO.update(bean);
    }

    @Override
    @Transactional
    public int delete(Unionp bean) {
        Logger.info("Eliminando Unionp");
        return unionpDAO.delete(bean);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Unionp> list(Object... param) {
        Logger.info("Listando todos los unionps");
        return unionpDAO.list();
    }

    @Override
    @Transactional(readOnly = true)
    public List<Unionp> listEnabled(Object... param) {
        return unionpDAO.listEnabled();
    }

    @Override
    @Transactional(readOnly = true)
    public List<Unionp> listDisabled(Object... param) {
        return unionpDAO.listDisabled();
    }

    @Override
    @Transactional(readOnly = true)
    public List<Unionp> search(Object... param) {
        return unionpDAO.search(new HibernateParam("uniNombre", param[0]));
    }

    @Override
    @Transactional(readOnly = true)
    public Unionp get(Object... id) {
        return unionpDAO.get(new HibernateParam("idUnion", id[0]));
    }

    @Override
    @Transactional(readOnly = true)
    public Unionp getByParent(Object... parentID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
