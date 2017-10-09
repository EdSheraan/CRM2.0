/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.crm.service;

import java.util.List;
import org.pmw.tinylog.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upeu.crm.bean.Grupo;
import pe.edu.upeu.crm.dao.GrupoDAO;

/**
 *
 * @author Leandro Burgos
 */
@Service
public class GrupoService implements CRUDService<Grupo>{

    @Autowired
    private GrupoDAO grupoDAO;
    
    @Override
    public Object add(Grupo bean) {
        Logger.info("Registrando Grupo");
        return grupoDAO.add(bean);
    }

    @Override
    public int update(Grupo bean) {
        Logger.info("Actualizando Grupo");
        return grupoDAO.update(bean);
    }

    @Override
    public int delete(Grupo bean) {
        Logger.info("Eliminando Grupo");
        return grupoDAO.update(bean);
    }

    @Override
    public List<Grupo> list(Object... param) {
        Logger.info("Listando todos los grupos");
        return grupoDAO.list(param);
    }

    @Override
    public List<Grupo> listEnabled(Object... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Grupo> listDisabled(Object... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Grupo> search(Object... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Grupo get(Object... id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
