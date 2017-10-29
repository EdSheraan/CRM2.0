/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.crm.service.impl;

import java.util.Date;
import java.util.List;
import org.pmw.tinylog.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upeu.crm.bean.Grupo;
import pe.edu.upeu.crm.dao.HibernateParam;
import pe.edu.upeu.crm.dao.impl.GrupoDAO;
import pe.edu.upeu.crm.service.CRUDService;

/**
 *
 * @author Leandro Burgos
 */
@Service
public class GrupoService implements CRUDService<Grupo> {

    @Autowired
    private GrupoDAO grupoDAO;

    @Override
    @Transactional
    public Object add(Grupo bean) {
        bean.setGpoFechaCreacion(new Date());
        bean.setGpoFechaAdd(new Date());
        bean.setGpoUsuAdd(1);
        bean.setGpoEstado("1");
        Logger.info("Registrando Grupo");
        return grupoDAO.add(bean);
    }

    @Override
    @Transactional
    public int update(Grupo bean) {
        Logger.info("Actualizando Grupo");
        return grupoDAO.update(bean);
    }

    @Override
    @Transactional
    public int delete(Grupo bean) {
        Logger.info("Eliminando Grupo");
        return grupoDAO.delete(bean);
    }

    @Override
    @Transactional(readOnly = true) // Usar readonly= true para todas las consultas SELECT
    public List<Grupo> list(Object... param) {
        Logger.info("Listando todos los grupos");
        return grupoDAO.list(new HibernateParam("idEscuela", param[0]));
    }

    @Override
    @Transactional(readOnly = true)
    public List<Grupo> listEnabled(Object... param) {
        Logger.info("Listando todos los grupos habilitados");
        return grupoDAO.listEnabled(new HibernateParam("idEscuela", param[0]));
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
    @Transactional(readOnly = true)
    public Grupo get(Object... id) {
        Logger.info("Listando datos de un grupo");
        return grupoDAO.get(new HibernateParam("idGrupo", id[0]));
    }

    @Transactional
    public Grupo getGrupo(int id) {
        return grupoDAO.getGrupo(new HibernateParam("idGrupo", id));
    }

}
