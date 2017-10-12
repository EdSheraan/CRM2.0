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
import pe.edu.upeu.crm.bean.Unionp;
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
    public Object add(Unionp bean) {
        Logger.info("Registrando Unionp");
        return unionpDAO.add(bean);
    }

    @Override
    public int update(Unionp bean) {
        Logger.info("Actualizando Unionp");
        return unionpDAO.update(bean);
    }

    @Override
    public int delete(Unionp bean) {
        Logger.info("Eliminando Unionp");
        return unionpDAO.update(bean);
    }

    @Override
    public List<Unionp> list(Object... param) {
        Logger.info("Listando todos los unionps");
        return unionpDAO.list(param);
    }

    @Override
    public List<Unionp> listEnabled(Object... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Unionp> listDisabled(Object... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Unionp> search(Object... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Unionp get(Object... id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
