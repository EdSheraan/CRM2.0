package pe.edu.upeu.crm.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.crm.bean.Iglesia;

@Repository
public class IglesiaDAO extends CrudDAO<Iglesia>{

    @Override
    public int delete(Iglesia bean) {
        bean.setIglEstado("0");
        return update(bean);
    }

    @Override
    public List<Iglesia> list(Object... param) {
        return executeHQLQuery("From Iglesia", (Object[]) null);
    }

    @Override
    public List<Iglesia> listEnabled(Object... param) {
        Object[] estado = {"estado","1"};
        return executeHQLQuery("From Iglesia i where i.iglEstado = :estado", estado);
    }

    @Override
    public List<Iglesia> listDisabled(Object... param) {
        Object[] estado = {"estado","0"};
        return executeHQLQuery("From Iglesia i where i.iglEstado = :estado", estado);
    }

    @Override
    public List<Iglesia> search(Object... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Iglesia get(Object... id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
