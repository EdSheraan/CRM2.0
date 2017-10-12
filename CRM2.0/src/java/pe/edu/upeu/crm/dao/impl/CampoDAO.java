package pe.edu.upeu.crm.dao.impl;

import java.util.List;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.crm.bean.Campo;
import pe.edu.upeu.crm.dao.CrudDAO;
import pe.edu.upeu.crm.dao.HibernateParam;

@Repository
public class CampoDAO extends CrudDAO<Campo>{

    @Override
    public int delete(Campo bean) {
        bean.setCmpEstado(ESTADO_INACTIVO);
        return update(bean);
    }

    @Override
    public List<Campo> list(HibernateParam... param) {
        return executeHQLQuery("From Campo");
    }

    @Override
    public List<Campo> listEnabled(HibernateParam... param) {
        return executeHQLQuery("From Campo c where c.cmpEstado = '1'");
    }

    @Override
    public List<Campo> listDisabled(HibernateParam... param) {
        return executeHQLQuery("From Campo c where c.cmpEstado = '0'");
    }

    @Override
    public List<Campo> search(HibernateParam... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Campo get(HibernateParam... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
