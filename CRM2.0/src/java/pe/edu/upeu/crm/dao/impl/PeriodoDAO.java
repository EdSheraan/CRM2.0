package pe.edu.upeu.crm.dao.impl;

import java.util.List;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.crm.bean.Periodo;
import pe.edu.upeu.crm.dao.CrudDAO;

@Repository
public class PeriodoDAO extends CrudDAO<Periodo>{

    @Override
    public int delete(Periodo bean) {
        bean.setPrdEstado("0");
        return update(bean);
    }

    @Override
    public List<Periodo> list(Object... param) {
        return executeHQLQuery("From Periodo", (Object[]) null);
    }

    @Override
    public List<Periodo> listEnabled(Object... param) {
        Object[] estado = {"estado", "1"};
        return executeHQLQuery("From Periodo p where p.prdEstado = :estado", estado);
    }

    @Override
    public List<Periodo> listDisabled(Object... param) {
        Object[] estado = {"estado", "0"};
        return executeHQLQuery("From Periodo p where p.prdEstado = :estado", estado);
    }

    @Override
    public List<Periodo> search(Object... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Periodo get(Object... id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
