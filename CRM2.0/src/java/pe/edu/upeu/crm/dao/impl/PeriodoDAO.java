package pe.edu.upeu.crm.dao.impl;

import java.util.List;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.crm.bean.Periodo;
import pe.edu.upeu.crm.dao.CrudDAO;
import pe.edu.upeu.crm.dao.HibernateParam;

@Repository
public class PeriodoDAO extends CrudDAO<Periodo>{

    @Override
    public int delete(Periodo bean) {
        bean.setPrdEstado("0");
        return update(bean);
    }

    @Override
    public List<Periodo> list(HibernateParam... param) {
        return executeHQLQuery("From Periodo");
    }

    @Override
    public List<Periodo> listEnabled(HibernateParam... param) {
        Object[] estado = {"estado", "1"};
        return executeHQLQuery("From Periodo p where p.prdEstado = '1'");
    }

    @Override
    public List<Periodo> listDisabled(HibernateParam... param) {
        Object[] estado = {"estado", "0"};
        return executeHQLQuery("From Periodo p where p.prdEstado = '1'");
    }

    @Override
    public List<Periodo> search(HibernateParam... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Periodo get(HibernateParam... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Periodo getByParent(HibernateParam... parentID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
