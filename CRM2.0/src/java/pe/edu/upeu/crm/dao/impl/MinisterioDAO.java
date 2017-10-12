package pe.edu.upeu.crm.dao.impl;

import java.util.List;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.crm.bean.Ministerio;
import pe.edu.upeu.crm.dao.CrudDAO;
import pe.edu.upeu.crm.dao.HibernateParam;

@Repository
public class MinisterioDAO extends CrudDAO<Ministerio>{

    @Override
    public int delete(Ministerio bean) {
        bean.setMinEstado("0");
        return update(bean);
    }

    @Override
    public List<Ministerio> list(HibernateParam... param) {
        return executeHQLQuery("From Ministerio");
    }

    @Override
    public List<Ministerio> listEnabled(HibernateParam... param) {
        
        return executeHQLQuery("From Ministerio m where m.minEstado = '1'");
    }

    @Override
    public List<Ministerio> listDisabled(HibernateParam... param) {
        
        return executeHQLQuery("From Ministerio m where m.minEstado = '1'");
    }

    @Override
    public List<Ministerio> search(HibernateParam... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Ministerio get(HibernateParam... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
