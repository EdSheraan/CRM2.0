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
import pe.edu.upeu.crm.bean.Campo;
import pe.edu.upeu.crm.dao.impl.CampoDAO;
import pe.edu.upeu.crm.service.CRUDService;

/**
 *
 * @author Andres
 */
@Service
public class CampoService implements CRUDService<Campo> {

    @Autowired
    private CampoDAO campoDAO;

    @Override
    public Object add(Campo bean) {
        Logger.info("Agregando Campo");
        return campoDAO.add(bean);
    }

    @Override
    public int update(Campo bean) {
        Logger.info("Actualizando Campo");
        return campoDAO.update(bean);
    }

    @Override
    public int delete(Campo bean) {
        Logger.info("Eliminando Campo");
        return campoDAO.delete(bean);
    }

    @Override
    public List<Campo> list(Object... param) {
        Logger.info("Listando todos los campos");
        return campoDAO.list();
    }

    @Override
    public List<Campo> listEnabled(Object... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Campo> listDisabled(Object... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Campo> search(Object... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Campo get(Object... id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
