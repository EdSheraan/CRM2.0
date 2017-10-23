package pe.edu.upeu.crm.dao.impl;

import java.util.List;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.crm.bean.Miembrogp;
import pe.edu.upeu.crm.dao.CrudDAO;
import pe.edu.upeu.crm.dao.HibernateParam;

@Repository
public class MiembrogpDAO extends CrudDAO<Miembrogp> {

    @Override
    public int delete(Miembrogp bean) {
        bean.setMgpEstado("0");
        return update(bean);
    }

    @Override
    public List<Miembrogp> list(HibernateParam... param) {
        return executeHQLQuery("From Miembrogp m join fetch m.persona as persona where m.grupo.idGrupo=:idGrupo", param);
    }

    @Override
    public List<Miembrogp> listEnabled(HibernateParam... param) {

        return executeHQLQuery("From Miembrogp m where m.mgpEstado = '1'");
    }

    @Override
    public List<Miembrogp> listDisabled(HibernateParam... param) {

        return executeHQLQuery("From Miembrogp m where m.mgpEstado = '1'");
    }

    @Override
    public List<Miembrogp> search(HibernateParam... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Miembrogp get(HibernateParam... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
