package pe.edu.upeu.crm.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.crm.bean.Unionp;

@Repository
public class UnionpDAO extends CrudDAO<Unionp>{

    @Override
    public int delete(Unionp bean) {
        bean.setUniEstado("0");
        return update(bean);
    }

    @Override
    public List<Unionp> list(Object... param) {
        return executeHQLQuery("From Unionp", (Object[]) null);
    }

    @Override
    public List<Unionp> listEnabled(Object... param) {
        Object[] estado = {"estado","1"};
        return executeHQLQuery("From Unionp u where u.uniEstado = :estado", estado);
    }

    @Override
    public List<Unionp> listDisabled(Object... param) {
        Object[] estado = {"estado","0"};
        return executeHQLQuery("From Unionp u where u.uniEstado = :estado", estado);
    }

    @Override
    public List<Unionp> search(Object... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Unionp get(Object... id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
