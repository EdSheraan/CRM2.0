package pe.edu.upeu.crm.dao.impl;

import java.util.List;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.crm.bean.Iglesia;
import pe.edu.upeu.crm.dao.CrudDAO;
import pe.edu.upeu.crm.dao.HibernateParam;

@Repository
public class IglesiaDAO extends CrudDAO<Iglesia>{

    @Override
    public int delete(Iglesia bean) {
        bean.setIglEstado("0");
        return update(bean);
    }

    @Override
    public List<Iglesia> list(HibernateParam... param) {
        return executeHQLQuery("From Iglesia");
    }

    @Override
    public List<Iglesia> listEnabled(HibernateParam... param) {
        
        return executeHQLQuery("From Iglesia i where i.iglEstado = '1'");
    }

    @Override
    public List<Iglesia> listDisabled(HibernateParam... param) {
        
        return executeHQLQuery("From Iglesia i where i.iglEstado = '1'");
    }

    @Override
    public List<Iglesia> search(HibernateParam... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Iglesia get(HibernateParam... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
