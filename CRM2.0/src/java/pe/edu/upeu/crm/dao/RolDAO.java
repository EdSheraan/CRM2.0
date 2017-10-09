package pe.edu.upeu.crm.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.crm.bean.Rol;

@Repository
public class RolDAO extends CrudDAO<Rol>{

    @Override
    public int delete(Rol bean) {
        bean.setRolEstado("0");
        return update(bean);
    }

    @Override
    public List<Rol> list(Object... param) {    
        return executeHQLQuery("From Rol", (Object[]) null);
    }

    @Override
    public List<Rol> listEnabled(Object... param) {
        Object[] estado = {"estado","1"};
        return executeHQLQuery("From Rol r where r.rolEstado = :estado", estado);
    }

    @Override
    public List<Rol> listDisabled(Object... param) {
        Object[] estado = {"estado","0"};
        return executeHQLQuery("From Rol r where r.rolEstado = :estado", estado);
    }

    @Override
    public List<Rol> search(Object... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Rol get(Object... id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
