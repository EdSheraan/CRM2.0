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
import pe.edu.upeu.crm.bean.Periodo;
import pe.edu.upeu.crm.dao.HibernateParam;
import pe.edu.upeu.crm.dao.impl.PeriodoDAO;
import pe.edu.upeu.crm.service.CRUDService;

/**
 *
 * @author Leandro Burgos
 */
@Service
public class PeriodoService implements CRUDService<Periodo> {

    @Autowired
    private PeriodoDAO periodoDAO;

    @Override
    @Transactional
    public Object add(Periodo bean) {
        Logger.info("Registrando periodo");
        return periodoDAO.add(bean);
    }

    @Override
    @Transactional
    public int update(Periodo bean) {
        Logger.info("Actualizando periodo");
        return periodoDAO.update(bean);
    }

    @Override
    @Transactional
    public int delete(Periodo bean) {
        Logger.info("Eliminando periodo");
        return periodoDAO.delete(bean);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Periodo> list(Object... param) {
        Logger.info("Listando todos los periodos");
        return periodoDAO.list();
    }

    @Override
    @Transactional(readOnly = true)
    public List<Periodo> listEnabled(Object... param) {
        Logger.info("Listando todos los periodos habilitados");
        return periodoDAO.listEnabled(new HibernateParam("prdDistrito", param[0]),
                new HibernateParam("prdIglesia", param[1]));
    }

    @Override
    @Transactional(readOnly = true)
    public List<Periodo> listDisabled(Object... param) {
        Logger.info("Listando todos los periodos deshabilitados");
        return periodoDAO.listDisabled();
    }

    @Override
    @Transactional(readOnly = true)
    public List<Periodo> search(Object... param) {
        Logger.info("Buscando periodo por nombre");
        return periodoDAO.search(new HibernateParam("prdNombre", param[0]));
    }

    @Override
    @Transactional(readOnly = true)
    public Periodo get(Object... id) {
        Logger.info("Obteniendo periodo por id");
        return periodoDAO.get(new HibernateParam("idPeriodo", id[0]));
    }

    @Override
    @Transactional(readOnly = true)
    public Periodo getByParent(Object... parentID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
