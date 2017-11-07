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
import pe.edu.upeu.crm.bean.Asmiemgp;
import pe.edu.upeu.crm.dao.impl.AsmiemgpDAO;
import pe.edu.upeu.crm.service.CRUDService;

/**
 *
 * @author Andres
 */
@Service
public class AsmiemgpService implements CRUDService<Asmiemgp> {

    @Autowired
    private AsmiemgpDAO asmiemgpDAO;

    @Override
    @Transactional
    public Object add(Asmiemgp bean) {
        Logger.info("Registrando Asmiemgp");
        return asmiemgpDAO.add(bean);
    }

    @Override
    public int update(Asmiemgp bean) {
        Logger.info("Actualizando Asmiemgp");
        return asmiemgpDAO.update(bean);
    }

    @Override
    public int delete(Asmiemgp bean) {
        Logger.info("Eliminando Asmiemgp");
        return asmiemgpDAO.delete(bean);
    }

    @Override
    public List<Asmiemgp> list(Object... param) {
        Logger.info("Listando todos los Asmiemgp");
        return asmiemgpDAO.list();
    }

    @Override
    public List<Asmiemgp> listEnabled(Object... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Asmiemgp> listDisabled(Object... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Asmiemgp> search(Object... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Asmiemgp get(Object... id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Asmiemgp getByParent(Object... parentID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Transactional
    public Object addAsis(List<Asmiemgp> asmiembros) {
        int n = 0;
        Logger.info("Registrando asistencia de miembros");
        for (int i = 0; i < asmiembros.size(); i++) {
            n = n + 1;
            add(asmiembros.get(i));
        }
        return n;
    }

}
