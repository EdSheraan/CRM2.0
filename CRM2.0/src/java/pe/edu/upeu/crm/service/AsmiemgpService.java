/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.crm.service;

import java.util.List;
import org.pmw.tinylog.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upeu.crm.bean.Asmiemgp;
import pe.edu.upeu.crm.dao.AsmiemgpDAO;

/**
 *
 * @author Andres
 */
@Service
public class AsmiemgpService implements CRUDService<Asmiemgp>{
    
    @Autowired
    private AsmiemgpDAO asmiemgpDAO;
    
    @Override
    public Object add(Asmiemgp bean) {
        Logger.info("Registrando Asmiemgp");
        return asmiemgpDAO.add(bean);
    }

    @Override
    public int update(Asmiemgp bean) {
        Logger.info("Actualizando Asmiemgp");
        return asmiemgpDAO.update(bean);
    }

    @Override
    public int delete(Asmiemgp bean) {
        Logger.info("Eliminando Asmiemgp");
        return asmiemgpDAO.delete(bean);
    }

    @Override
    public List<Asmiemgp> list(Object... param) {
        Logger.info("Listando todos los Asmiemgp");
        return asmiemgpDAO.list(param);
    }

    @Override
    public List<Asmiemgp> listEnabled(Object... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Asmiemgp> listDisabled(Object... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Asmiemgp> search(Object... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Asmiemgp get(Object... id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
