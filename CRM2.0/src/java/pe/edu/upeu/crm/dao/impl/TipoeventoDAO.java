package pe.edu.upeu.crm.dao.impl;

import java.util.List;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.crm.bean.Tipoevento;
import pe.edu.upeu.crm.dao.CrudDAO;
import pe.edu.upeu.crm.dao.HibernateParam;

@Repository
public class TipoeventoDAO extends CrudDAO<Tipoevento>{

    @Override
    public int delete(Tipoevento bean) {
        bean.setTipEstado("0");
        return update(bean);
    }

    @Override
    public List<Tipoevento> list(HibernateParam... param) {
        return executeHQLQuery("From Tipoevento");
    }

    @Override
    public List<Tipoevento> listEnabled(HibernateParam... param) {
        
        return executeHQLQuery("From Tipoevento t where t.tipEstado = '1'");
    }

    @Override
    public List<Tipoevento> listDisabled(HibernateParam... param) {
        
        return executeHQLQuery("From Tipoevento t where t.tipEstado = '1'");
    }

    @Override
    public List<Tipoevento> search(HibernateParam... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Tipoevento get(HibernateParam... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Tipoevento getByParent(HibernateParam... parentID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
