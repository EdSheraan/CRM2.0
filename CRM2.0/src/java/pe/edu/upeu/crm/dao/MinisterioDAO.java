package pe.edu.upeu.crm.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.crm.bean.Ministerio;

@Repository
public class MinisterioDAO extends CrudDAO<Ministerio>{

    @Override
    public int delete(Ministerio bean) {
        bean.setMinEstado("0");
        return update(bean);
    }

    @Override
    public List<Ministerio> list(Object... param) {
        return executeHQLQuery("From Ministerio", (Object[]) null);
    }

    @Override
    public List<Ministerio> listEnabled(Object... param) {
        Object[] estado = {"estado","1"};
        return executeHQLQuery("From Ministerio m where m.minEstado = :estado", estado);
    }

    @Override
    public List<Ministerio> listDisabled(Object... param) {
        Object[] estado = {"estado","0"};
        return executeHQLQuery("From Ministerio m where m.minEstado = :estado", estado);
    }

    @Override
    public List<Ministerio> search(Object... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Ministerio get(Object... id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
