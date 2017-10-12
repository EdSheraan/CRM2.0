package pe.edu.upeu.crm.dao.impl;

import java.util.List;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.crm.bean.Privilegio;
import pe.edu.upeu.crm.dao.CrudDAO;
import pe.edu.upeu.crm.dao.HibernateParam;

@Repository
public class PrivilegioDAO extends CrudDAO<Privilegio> {

    @Override
    public int delete(Privilegio bean) {
        bean.setPrvEstado("0");
        return update(bean);
    }

    @Override
    public List<Privilegio> list(HibernateParam... param) {
        return executeHQLQuery("From Privilegio");
    }

    @Override
    public List<Privilegio> listEnabled(HibernateParam... param) {
        Object[] estado = {"estado", "1"};
        return executeHQLQuery("From Privilegio p where p.prvEstado = '1'");
    }

    @Override
    public List<Privilegio> listDisabled(HibernateParam... param) {
        Object[] estado = {"estado", "0"};
        return executeHQLQuery("From Privilegio p where p.prvEstado = '1'");
    }

    @Override
    public List<Privilegio> search(HibernateParam... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Privilegio get(HibernateParam... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
