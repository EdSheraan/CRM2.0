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
import pe.edu.upeu.crm.bean.Asmiemmin;
import pe.edu.upeu.crm.dao.impl.AsmiemminDAO;
import pe.edu.upeu.crm.service.CRUDService;

/**
 *
 * @author Andres
 */
@Service
public class AsmienminService implements CRUDService<Asmiemmin>{
    
    @Autowired
    private AsmiemminDAO asmiemminDAO;
    
    @Override
    public Object add(Asmiemmin bean) {
        Logger.info("Agregando Asmiemmin");
        return asmiemminDAO.add(bean);
    }

    @Override
    public int update(Asmiemmin bean) {
        Logger.info("Actualizando Asmiemmin");
        return asmiemminDAO.update(bean);
    }

    @Override
    public int delete(Asmiemmin bean) {
        Logger.info("Eliminando Asmiemmin");
        return asmiemminDAO.delete(bean);
    }

    @Override
    public List<Asmiemmin> list(Object... param) {
        Logger.info("Listando todos los Asmiemmin");
        return asmiemminDAO.list();
    }

    @Override
    public List<Asmiemmin> listEnabled(Object... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Asmiemmin> listDisabled(Object... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Asmiemmin> search(Object... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Asmiemmin get(Object... id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
