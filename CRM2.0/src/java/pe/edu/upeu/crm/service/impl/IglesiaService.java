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
import pe.edu.upeu.crm.bean.Iglesia;
import pe.edu.upeu.crm.dao.impl.IglesiaDAO;
import pe.edu.upeu.crm.service.CRUDService;

/**
 *
 * @author Leandro Burgos
 */
@Service
public class IglesiaService implements CRUDService<Iglesia>{

    @Autowired
    private IglesiaDAO iglesiaDAO;
    
    @Override
    public Object add(Iglesia bean) {
        Logger.info("Registrando Iglesia");
        return iglesiaDAO.add(bean);
    }

    @Override
    public int update(Iglesia bean) {
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
        return iglesiaDAO.list(param);
    }

    @Override
    public List<Iglesia> listEnabled(Object... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    
}
