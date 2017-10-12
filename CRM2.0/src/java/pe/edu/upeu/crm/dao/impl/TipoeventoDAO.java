package pe.edu.upeu.crm.dao.impl;

import java.util.List;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.crm.bean.Tipoevento;
import pe.edu.upeu.crm.dao.CrudDAO;

@Repository
public class TipoeventoDAO extends CrudDAO<Tipoevento>{

    @Override
    public int delete(Tipoevento bean) {
        bean.setTipEstado("0");
        return update(bean);
    }

    @Override
    public List<Tipoevento> list(Object... param) {
        return executeHQLQuery("From Tipoevento", (Object[]) null);
    }

    @Override
    public List<Tipoevento> listEnabled(Object... param) {
        Object[] estado = {"estado","1"};
        return executeHQLQuery("From Tipoevento t where t.tipEstado = :estado", estado);
    }

    @Override
    public List<Tipoevento> listDisabled(Object... param) {
        Object[] estado = {"estado","0"};
        return executeHQLQuery("From Tipoevento t where t.tipEstado = :estado", estado);
    }

    @Override
    public List<Tipoevento> search(Object... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Tipoevento get(Object... id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
