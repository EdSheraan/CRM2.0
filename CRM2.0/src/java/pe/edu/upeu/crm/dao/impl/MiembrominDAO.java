package pe.edu.upeu.crm.dao.impl;

import java.util.List;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.crm.bean.Miembromin;
import pe.edu.upeu.crm.dao.CrudDAO;
import pe.edu.upeu.crm.dao.HibernateParam;

@Repository
public class MiembrominDAO extends CrudDAO<Miembromin>{

    @Override
    public int delete(Miembromin bean) {
        bean.setMmiEstado("0");
        return update(bean);
    }

    @Override
    public List<Miembromin> list(HibernateParam... param) {
        return executeHQLQuery("From Miembromin");
    }

    @Override
    public List<Miembromin> listEnabled(HibernateParam... param) {
        
        return executeHQLQuery("From Miembromin m where m.mmiEstado = '1'");
    }

    @Override
    public List<Miembromin> listDisabled(HibernateParam... param) {
        
        return executeHQLQuery("From Miembromin m where m.mmiEstado = '1'");
    }

    @Override
    public List<Miembromin> search(HibernateParam... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Miembromin get(HibernateParam... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Miembromin getByParent(HibernateParam... parentID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
