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
import pe.edu.upeu.crm.bean.Ministerio;
import pe.edu.upeu.crm.dao.impl.MinisterioDAO;
import pe.edu.upeu.crm.service.CRUDService;

/**
 *
 * @author Leandro Burgos
 */
@Service
public class MinisterioService implements CRUDService<Ministerio>{
    
    @Autowired
    private MinisterioDAO ministerioDAO;

    @Override
    public Object add(Ministerio bean) {
        Logger.info("Registrando ministerio");
        return ministerioDAO.add(bean);
    }

    @Override
    public int update(Ministerio bean) {
        Logger.info("Actualizando ministerio");
        return ministerioDAO.update(bean);
    }

    @Override
    public int delete(Ministerio bean) {
        Logger.info("Eliminando ministerio");
        return ministerioDAO.update(bean);
    }

    @Override
    public List<Ministerio> list(Object... param) {
        Logger.info("Listando todas las ministerios");
        return ministerioDAO.list();
    }

    @Override
    public List<Ministerio> listEnabled(Object... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Ministerio> listDisabled(Object... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Ministerio> search(Object... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Ministerio get(Object... id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
