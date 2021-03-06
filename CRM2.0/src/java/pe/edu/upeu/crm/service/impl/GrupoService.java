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
import pe.edu.upeu.crm.security.LoginService;
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
        bean.setGpoUsuAdd(LoginService.getPrincipal().getIdPersona());
        bean.setGpoEstado("1");
        Logger.info("Registrando Grupo");
        return grupoDAO.add(bean);
    }

    @Override
    @Transactional
    public int update(Grupo bean) {
        bean.setGpoFechaUpd(new Date());
        bean.setGpoUsuUpd(LoginService.getPrincipal().getIdPersona());
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
    @Transactional(readOnly = true)
    public List<Grupo> listDisabled(Object... param) {
        return grupoDAO.listDisabled(new HibernateParam("idEscuela", param[0]));
    }

    @Override
    @Transactional(readOnly = true)
    public List<Grupo> search(Object... param) {
        return grupoDAO.search(new HibernateParam("gpoNombre", param[0]));
    }

    @Override
    @Transactional(readOnly = true)
    public Grupo get(Object... id) {
        Logger.info("Listando datos de un grupo");
        return grupoDAO.get(new HibernateParam("idGrupo", id[0]));
    }

    @Override
    @Transactional(readOnly = true)
    public Grupo getByParent(Object... parentID) {
        return grupoDAO.getByParent(new HibernateParam("idEscuela", parentID[0]));
    }
    
    }
