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
import pe.edu.upeu.crm.bean.Tipoevento;
import pe.edu.upeu.crm.dao.impl.TipoeventoDAO;
import pe.edu.upeu.crm.service.CRUDService;

/**
 *
 * @author Leandro Burgos
 */
@Service
public class TipoeventoService implements CRUDService<Tipoevento>{
    
    @Autowired
    private TipoeventoDAO tipoeventoDAO;

    @Override
    public Object add(Tipoevento bean) {
        Logger.info("Registrando tipoevento");
        return tipoeventoDAO.add(bean);
    }

    @Override
    public int update(Tipoevento bean) {
        Logger.info("Actualizando tipoevento");
        return tipoeventoDAO.update(bean);
    }

    @Override
    public int delete(Tipoevento bean) {
        Logger.info("Eliminando tipoevento");
        return tipoeventoDAO.update(bean);
    }

    @Override
    public List<Tipoevento> list(Object... param) {
        Logger.info("Listando todas las tipoeventos");
        return tipoeventoDAO.list();
    }

    @Override
    public List<Tipoevento> listEnabled(Object... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Tipoevento> listDisabled(Object... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Tipoevento> search(Object... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Tipoevento get(Object... id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
