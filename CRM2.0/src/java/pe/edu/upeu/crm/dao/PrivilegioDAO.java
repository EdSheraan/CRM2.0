package pe.edu.upeu.crm.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.crm.bean.Privilegio;

@Repository
public class PrivilegioDAO extends CrudDAO<Privilegio> {

    @Override
    public int delete(Privilegio bean) {
        bean.setPrvEstado("0");
        return update(bean);
    }

    @Override
    public List<Privilegio> list(Object... param) {
        return executeHQLQuery("From Privilegio", (Object[]) null);
    }

    @Override
    public List<Privilegio> listEnabled(Object... param) {
        Object[] estado = {"estado", "1"};
        return executeHQLQuery("From Privilegio p where p.prvEstado = :estado", estado);
    }

    @Override
    public List<Privilegio> listDisabled(Object... param) {
        Object[] estado = {"estado", "0"};
        return executeHQLQuery("From Privilegio p where p.prvEstado = :estado", estado);
    }

    @Override
    public List<Privilegio> search(Object... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Privilegio get(Object... id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
