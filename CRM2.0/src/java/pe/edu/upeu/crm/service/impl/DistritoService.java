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
import pe.edu.upeu.crm.bean.Distrito;
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
    public Object add(Distrito bean) {
        Logger.info("Registrando Distrito");
        return distritoDAO.add(bean);
    }

    @Override
    public int update(Distrito bean) {
        Logger.info("Actualizando Distrito");
        return distritoDAO.update(bean);
    }

    @Override
    public int delete(Distrito bean) {
        Logger.info("Eliminando Distrito");
        return distritoDAO.update(bean);
    }

    @Override
    public List<Distrito> list(Object... param) {
        Logger.info("Listando todos los distritos");
        return distritoDAO.list();
    }

    @Override
    public List<Distrito> listEnabled(Object... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Distrito> listDisabled(Object... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Distrito> search(Object... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Distrito get(Object... id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
