/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.crm.service.impl;

import java.util.ArrayList;
import java.util.List;
import org.pmw.tinylog.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upeu.crm.bean.Detrol;
import pe.edu.upeu.crm.bean.Rol;
import pe.edu.upeu.crm.dao.HibernateParam;
import pe.edu.upeu.crm.dao.impl.DetRolDAO;
import pe.edu.upeu.crm.dao.impl.RolDAO;
import pe.edu.upeu.crm.service.CRUDService;

/**
 *
 * @author Leandro Burgos
 */
@Service
public class RolService implements CRUDService<Rol>{

    @Autowired
    private RolDAO rolDAO;
    
    @Autowired
    private DetRolDAO detRolDAO;
    
    @Override
    public Object add(Rol bean) {
        Logger.info("Registrando Rol");
        return rolDAO.add(bean);
    }

    @Override
    public int update(Rol bean) {
        Logger.info("Actualizando Rol");
        return rolDAO.update(bean);
    }

    @Override
    public int delete(Rol bean) {
        Logger.info("Eliminando Rol");
        return rolDAO.update(bean);
    }

    @Override
    public List<Rol> list(Object... param) {
        Logger.info("Listando todos los roles");
        return rolDAO.list();
    }

    @Override
    public List<Rol> listEnabled(Object... param) {
        Logger.info("Lista de roles por usuario");
        List<Detrol> detrols = detRolDAO.listEnabled(new HibernateParam("idUsuario", param[0]));
        List<Rol> rols = new ArrayList<>();
        for(Detrol d:detrols){
            rols.add(d.getRol());
        }
        return rols;
    }

    @Override
    public List<Rol> listDisabled(Object... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Rol> search(Object... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Rol get(Object... id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Rol getByParent(Object... parentID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
