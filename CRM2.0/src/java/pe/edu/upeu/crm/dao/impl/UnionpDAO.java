package pe.edu.upeu.crm.dao.impl;

import java.util.List;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.crm.bean.Unionp;
import pe.edu.upeu.crm.dao.CrudDAO;
import pe.edu.upeu.crm.dao.HibernateParam;

@Repository
public class UnionpDAO extends CrudDAO<Unionp>{

    @Override
    public int delete(Unionp bean) {
        bean.setUniEstado("0");
        return update(bean);
    }

    @Override
    public List<Unionp> list(HibernateParam... param) {
        return executeHQLQuery("From Unionp");
    }

    @Override
    public List<Unionp> listEnabled(HibernateParam... param) {
        
        return executeHQLQuery("From Unionp u where u.uniEstado = '1'");
    }

    @Override
    public List<Unionp> listDisabled(HibernateParam... param) {
        
        return executeHQLQuery("From Unionp u where u.uniEstado = '0'");
    }

    @Override
    public List<Unionp> search(HibernateParam... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Unionp get(HibernateParam... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
