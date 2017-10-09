package pe.edu.upeu.crm.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.crm.bean.Campo;

@Repository
public class CampoDAO extends CrudDAO<Campo>{

    @Override
    public int delete(Campo bean) {
        bean.setCmpEstado("0");
        return update(bean);
    }

    @Override
    public List<Campo> list(Object... param) {
        return executeHQLQuery("From Campo", (Object[]) null);
    }

    @Override
    public List<Campo> listEnabled(Object... param) {
        Object[] estado = {"estado","1"};
        return executeHQLQuery("From Campo c where c.cmpEstado = :estado", estado);
    }

    @Override
    public List<Campo> listDisabled(Object... param) {
        Object[] estado = {"estado","0"};
        return executeHQLQuery("From Campo c where c.cmpEstado = :estado", estado);
    }

    @Override
    public List<Campo> search(Object... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Campo get(Object... id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
