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
import pe.edu.upeu.crm.bean.Miembrogp;
import pe.edu.upeu.crm.dao.impl.MiembrogpDAO;
import pe.edu.upeu.crm.service.CRUDService;

/**
 *
 * @author Leandro Burgos
 */
@Service
public class MiembrogpService implements CRUDService<Miembrogp>{
    
    @Autowired
    private MiembrogpDAO miembrogpDAO;

    @Override
    public Object add(Miembrogp bean) {
        Logger.info("Registrando persona");
        return miembrogpDAO.add(bean);
    }

    @Override
    public int update(Miembrogp bean) {
        Logger.info("Actualizando persona");
        return miembrogpDAO.update(bean);
    }

    @Override
    public int delete(Miembrogp bean) {
        Logger.info("Eliminando persona");
        return miembrogpDAO.update(bean);
    }

    @Override
    public List<Miembrogp> list(Object... param) {
        Logger.info("Listando todas las personas");
        return miembrogpDAO.list();
    }

    @Override
    public List<Miembrogp> listEnabled(Object... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Miembrogp> listDisabled(Object... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Miembrogp> search(Object... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Miembrogp get(Object... id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
