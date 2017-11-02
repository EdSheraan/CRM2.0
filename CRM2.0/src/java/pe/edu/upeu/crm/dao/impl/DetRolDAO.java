/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.crm.dao.impl;

import java.util.List;
import org.hibernate.annotations.Parent;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upeu.crm.bean.Detrol;
import pe.edu.upeu.crm.dao.CrudDAO;
import pe.edu.upeu.crm.dao.HibernateParam;

/**
 *
 * @author Andres
 */

@Repository
public class DetRolDAO extends CrudDAO<Detrol>{

    @Override
    public int delete(Detrol bean) {
        bean.setDrlEstado(ESTADO_INACTIVO);
        return update(bean);
    }
    
    //Listado por usuario
    @Override
    public List<Detrol> list(HibernateParam... param) {
        return executeHQLQuery("From Detrol dr join fetch dr.usuario as usuario join fetch dr.rol as rol"
                + " where dr.usuario.idUsuario = :idUsuario", param);
    }

    @Override
    public List<Detrol> listEnabled(HibernateParam... param) {
        return executeHQLQuery("From Detrol dr join fetch dr.usuario as usuario join fetch dr.rol as rol"
                + " where dr.usuario.idUsuario = :idUsuario and dr.drlEstado ='1'", param);
    }

    @Override
    public List<Detrol> listDisabled(HibernateParam... param) {
        return executeHQLQuery("From Detrol dr join fetch dr.usuario as usuario join fetch dr.rol as rol"
                + " where dr.usuario.idUsuario = :idUsuario and dr.drlEstado ='0'", param);
    }

    @Override
    public List<Detrol> search(HibernateParam... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Detrol get(HibernateParam... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Detrol getByParent(HibernateParam... parentID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
