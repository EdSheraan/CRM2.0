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
import pe.edu.upeu.crm.bean.Miembromin;
import pe.edu.upeu.crm.dao.impl.MiembrominDAO;
import pe.edu.upeu.crm.service.CRUDService;

/**
 *
 * @author Leandro Burgos
 */
@Service
public class MiembrominService implements CRUDService<Miembromin>{
    
    @Autowired
    private MiembrominDAO miembrominDAO;

    @Override
    public Object add(Miembromin bean) {
        Logger.info("Registrando miembromin");
        return miembrominDAO.add(bean);
    }

    @Override
    public int update(Miembromin bean) {
        Logger.info("Actualizando miembromin");
        return miembrominDAO.update(bean);
    }

    @Override
    public int delete(Miembromin bean) {
        Logger.info("Eliminando miembromin");
        return miembrominDAO.update(bean);
    }

    @Override
    public List<Miembromin> list(Object... param) {
        Logger.info("Listando todas las miembromins");
        return miembrominDAO.list();
    }

    @Override
    public List<Miembromin> listEnabled(Object... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Miembromin> listDisabled(Object... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Miembromin> search(Object... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Miembromin get(Object... id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Miembromin getByParent(Object... parentID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
