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
import pe.edu.upeu.crm.bean.Asistenciaevt;
import pe.edu.upeu.crm.dao.impl.AsistenciaevtDAO;
import pe.edu.upeu.crm.service.CRUDService;

/**
 *
 * @author Andres
 */
@Service
public class AsistenciaevtService implements CRUDService<Asistenciaevt>{
    
    @Autowired
    private AsistenciaevtDAO asistenciaevtDAO;
    
    @Override
    public Object add(Asistenciaevt bean) {
        Logger.info("Registrando Asistenciaevt");
        return asistenciaevtDAO.add(bean);
    }

    @Override
    public int update(Asistenciaevt bean) {
        Logger.info("Actualizando Asistenciaevt");
        return asistenciaevtDAO.update(bean);
    }

    @Override
    public int delete(Asistenciaevt bean) {
        Logger.info("Eliminando Asistenciaevt");
        return asistenciaevtDAO.delete(bean);
    }

    @Override
    public List<Asistenciaevt> list(Object... param) {
        Logger.info("Listando todos los Asistenciaevt");
        return asistenciaevtDAO.list();
    }

    @Override
    public List<Asistenciaevt> listEnabled(Object... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Asistenciaevt> listDisabled(Object... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Asistenciaevt> search(Object... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Asistenciaevt get(Object... id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
