package pe.edu.upeu.crm.dao.impl;

import java.util.List;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.crm.bean.Escuela;
import pe.edu.upeu.crm.dao.CrudDAO;
import pe.edu.upeu.crm.dao.HibernateParam;

@Repository
public class EscuelaDAO extends CrudDAO<Escuela> {

    @Override
    public int delete(Escuela bean) {
        bean.setEscEstado("0");
        return update(bean);
    }

    @Override
    public List<Escuela> list(HibernateParam... param) {
        return executeHQLQuery("From Escuela");
    }

    @Override
    public List<Escuela> listEnabled(HibernateParam... param) {
        Object[] estado = {"estado", "1"};
        return executeHQLQuery("From Escuela e where e.escEstado = '1'");
    }

    @Override
    public List<Escuela> listDisabled(HibernateParam... param) {
        Object[] estado = {"estado", "0"};
        return executeHQLQuery("From Escuela e where e.escEstado = '1'");
    }

    @Override
    public List<Escuela> search(HibernateParam... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Escuela get(HibernateParam... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
