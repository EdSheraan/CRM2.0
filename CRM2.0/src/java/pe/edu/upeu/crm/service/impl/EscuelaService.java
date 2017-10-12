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
import pe.edu.upeu.crm.bean.Escuela;
import pe.edu.upeu.crm.dao.impl.EscuelaDAO;
import pe.edu.upeu.crm.service.CRUDService;

/**
 *
 * @author Leandro Burgos
 */
@Service
public class EscuelaService implements CRUDService<Escuela>{

    @Autowired
    private EscuelaDAO escuelaDAO;
    
    @Override
    public Object add(Escuela bean) {
        Logger.info("Registrando Escuela");
        return escuelaDAO.add(bean);
    }

    @Override
    public int update(Escuela bean) {
        Logger.info("Actualizando Escuela");
        return escuelaDAO.update(bean);
    }

    @Override
    public int delete(Escuela bean) {
        Logger.info("Eliminando Escuela");
        return escuelaDAO.update(bean);
    }

    @Override
    public List<Escuela> list(Object... param) {
        Logger.info("Listando todos las escuelas");
        return escuelaDAO.list();
    }

    @Override
    public List<Escuela> listEnabled(Object... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Escuela> listDisabled(Object... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Escuela> search(Object... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Escuela get(Object... id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
