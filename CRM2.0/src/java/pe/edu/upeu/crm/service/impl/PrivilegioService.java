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
import pe.edu.upeu.crm.bean.Privilegio;
import pe.edu.upeu.crm.bean.PrivilegioGroup;
import pe.edu.upeu.crm.dao.HibernateParam;
import pe.edu.upeu.crm.dao.impl.PrivilegioDAO;
import pe.edu.upeu.crm.service.CRUDService;

/**
 *
 * @author Leandro Burgos
 */
@Service
public class PrivilegioService implements CRUDService<Privilegio>{

    @Autowired
    private PrivilegioDAO privilegioDAO;
    
    @Override
    public Object add(Privilegio bean) {
        Logger.info("Registrando Privilegio");
        return privilegioDAO.add(bean);
    }

    @Override
    public int update(Privilegio bean) {
        Logger.info("Actualizando Privilegio");
        return privilegioDAO.update(bean);
    }

    @Override
    public int delete(Privilegio bean) {
        Logger.info("Eliminando Privilegio");
        return privilegioDAO.update(bean);
    }

    @Override
    public List<Privilegio> list(Object... param) {
        Logger.info("Listando todos los privilegios");
        return privilegioDAO.list();
    }

    @Override
    public List<Privilegio> listEnabled(Object... param) {
        Logger.info("Listando todos los privilegios del rol: "+param[0]);
        return privilegioDAO.listEnabled(new HibernateParam("idRol", param[0]));
    }

    @Override
    public List<Privilegio> listDisabled(Object... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Privilegio> search(Object... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Privilegio get(Object... id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public List<PrivilegioGroup> group(List<Privilegio> list){
        List<PrivilegioGroup> groups = new ArrayList<>();
        for(Privilegio p: list){
            if(p.getPrvIdPadre()==0){
                groups.add(addChilds(p, list));
            }
        }
        return groups;
    }
    
    private PrivilegioGroup addChilds(Privilegio p, List<Privilegio> list){
        PrivilegioGroup g = new PrivilegioGroup();
        for(Privilegio child:list){
            if(p.getPrvIdPadre() == p.getIdPrivilegio()){
                g.addChild(child);
            }
        }
        return g;
    }

}
