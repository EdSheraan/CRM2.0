package pe.edu.upeu.crm.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.crm.bean.Miembrogp;

@Repository
public class MiembrogpDAO extends CrudDAO<Miembrogp>{

    @Override
    public int delete(Miembrogp bean) {
        bean.setMgpEstado("0");
        return update(bean);
    }

    @Override
    public List<Miembrogp> list(Object... param) {
        return executeHQLQuery("From Miembrogp", (Object[]) null);
    }

    @Override
    public List<Miembrogp> listEnabled(Object... param) {
        Object[] estado = {"estado","1"};
        return executeHQLQuery("From Miembrogp m where m.mgpEstado = :estado", estado);
    }

    @Override
    public List<Miembrogp> listDisabled(Object... param) {
        Object[] estado = {"estado","0"};
        return executeHQLQuery("From Miembrogp m where m.mgpEstado = :estado", estado);
    }

    @Override
    public List<Miembrogp> search(Object... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Miembrogp get(Object... id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
