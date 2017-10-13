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
import pe.edu.upeu.crm.bean.Periodo;
import pe.edu.upeu.crm.dao.impl.PeriodoDAO;
import pe.edu.upeu.crm.service.CRUDService;

/**
 *
 * @author Leandro Burgos
 */
@Service
public class PeriodoService implements CRUDService<Periodo>{
    
    @Autowired
    private PeriodoDAO periodoDAO;

    @Override
    public Object add(Periodo bean) {
        Logger.info("Registrando periodo");
        return periodoDAO.add(bean);
    }

    @Override
    public int update(Periodo bean) {
        Logger.info("Actualizando periodo");
        return periodoDAO.update(bean);
    }

    @Override
    public int delete(Periodo bean) {
        Logger.info("Eliminando periodo");
        return periodoDAO.update(bean);
    }

    @Override
    public List<Periodo> list(Object... param) {
        Logger.info("Listando todas las periodos");
        return periodoDAO.list();
    }

    @Override
    public List<Periodo> listEnabled(Object... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Periodo> listDisabled(Object... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Periodo> search(Object... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Periodo get(Object... id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
