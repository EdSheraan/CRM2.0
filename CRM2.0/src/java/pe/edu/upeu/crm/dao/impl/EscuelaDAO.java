package pe.edu.upeu.crm.dao.impl;

import java.util.List;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.crm.bean.Escuela;
import pe.edu.upeu.crm.dao.CrudDAO;

@Repository
public class EscuelaDAO extends CrudDAO<Escuela> {

    @Override
    public int delete(Escuela bean) {
        bean.setEscEstado("0");
        return update(bean);
    }

    @Override
    public List<Escuela> list(Object... param) {
        return executeHQLQuery("From Escuela", (Object[]) null);
    }

    @Override
    public List<Escuela> listEnabled(Object... param) {
        Object[] estado = {"estado", "1"};
        return executeHQLQuery("From Escuela e where e.escEstado = :estado", estado);
    }

    @Override
    public List<Escuela> listDisabled(Object... param) {
        Object[] estado = {"estado", "0"};
        return executeHQLQuery("From Escuela e where e.escEstado = :estado", estado);
    }

    @Override
    public List<Escuela> search(Object... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Escuela get(Object... id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
