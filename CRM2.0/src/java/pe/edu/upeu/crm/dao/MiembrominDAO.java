package pe.edu.upeu.crm.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.crm.bean.Miembromin;

@Repository
public class MiembrominDAO extends CrudDAO<Miembromin>{

    @Override
    public int delete(Miembromin bean) {
        bean.setMmiEstado("0");
        return update(bean);
    }

    @Override
    public List<Miembromin> list(Object... param) {
        return executeHQLQuery("From Miembromin", (Object[]) null);
    }

    @Override
    public List<Miembromin> listEnabled(Object... param) {
        Object[] estado = {"estado","1"};
        return executeHQLQuery("From Miembromin m where m.mmiEstado = :estado", estado);
    }

    @Override
    public List<Miembromin> listDisabled(Object... param) {
        Object[] estado = {"estado","0"};
        return executeHQLQuery("From Miembromin m where m.mmiEstado = :estado", estado);
    }

    @Override
    public List<Miembromin> search(Object... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Miembromin get(Object... id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
