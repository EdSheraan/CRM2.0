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
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upeu.crm.bean.Personaevento;
import pe.edu.upeu.crm.dao.impl.PersonaeventoDAO;
import pe.edu.upeu.crm.service.CRUDService;

/**
 *
 * @author Andres
 */
@Service
public class PersonaeventoService implements CRUDService<Personaevento> {

    @Autowired
    private PersonaeventoDAO personaeventoDAO;

    @Override
    @Transactional
    public Object add(Personaevento bean) {
        Logger.info("Registrando Personaevento");
        return personaeventoDAO.add(bean);
    }

    @Override
    public int update(Personaevento bean) {
        Logger.info("Actualizando Personaevento");
        return personaeventoDAO.update(bean);
    }

    @Override
    public int delete(Personaevento bean) {
        Logger.info("Eliminando Personaevento");
        return personaeventoDAO.delete(bean);
    }

    @Override
    public List<Personaevento> list(Object... param) {
        Logger.info("Listando todos los Personaevento");
        return personaeventoDAO.list();
    }

    @Override
    public List<Personaevento> listEnabled(Object... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Personaevento> listDisabled(Object... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Personaevento> search(Object... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Personaevento get(Object... id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Personaevento getByParent(Object... parentID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Transactional
    public Object addAsis(List<Personaevento> asmiembros) {
        int n = 0;
        Logger.info("Registrando asistencia de miembros");
        for (int i = 0; i < asmiembros.size(); i++) {
            n = n + 1;
            add(asmiembros.get(i));
        }
        return n;
    }

}
