package pe.edu.upeu.crm.dao.impl;

import java.util.List;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.crm.bean.Evento;
import pe.edu.upeu.crm.dao.CrudDAO;
import pe.edu.upeu.crm.dao.HibernateParam;

@Repository
public class EventoDAO extends CrudDAO<pe.edu.upeu.crm.bean.Evento> {

    @Override
    public int delete(Evento bean) {
        bean.setEvtEstado("0");
        return update(bean);
    }

    @Override
    public List<Evento> list(HibernateParam... param) {
        return executeHQLQuery("From Evento");
    }

    @Override
    public List<Evento> listEnabled(HibernateParam... param) {
        return executeHQLQuery("From Evento e where e.evtEstado = '1' and e.periodo.idPeriodo=:idPeriodo", param);
    }

    public List<Evento> listActive(HibernateParam... param) {
        String hql = "From Evento e where e.evtEstado = '1' and e.periodo.idPeriodo=:idPeriodo and e.evtDistrito=:idDistrito";
        return executeHQLQuery(hql, param);
    }

    @Override
    public List<Evento> listDisabled(HibernateParam... param) {
        return executeHQLQuery("From Evento e where e.evtEstado = '0'");
    }

    @Override
    public List<Evento> search(HibernateParam... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Evento get(HibernateParam... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Evento getByParent(HibernateParam... parentID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
