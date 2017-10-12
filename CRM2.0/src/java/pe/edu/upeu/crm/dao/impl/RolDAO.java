package pe.edu.upeu.crm.dao.impl;

import java.util.List;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.crm.bean.Rol;
import pe.edu.upeu.crm.dao.CrudDAO;
import pe.edu.upeu.crm.dao.HibernateParam;

@Repository
public class RolDAO extends CrudDAO<Rol>{

    @Override
    public int delete(Rol bean) {
        bean.setRolEstado("0");
        return update(bean);
    }

    @Override
    public List<Rol> list(HibernateParam... param) {    
        return executeHQLQuery("From Rol");
    }

    @Override
    public List<Rol> listEnabled(HibernateParam... param) {
        
        return executeHQLQuery("From Rol r where r.rolEstado = '1'");
    }

    @Override
    public List<Rol> listDisabled(HibernateParam... param) {
        
        return executeHQLQuery("From Rol r where r.rolEstado = '1'");
    }

    @Override
    public List<Rol> search(HibernateParam... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Rol get(HibernateParam... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
