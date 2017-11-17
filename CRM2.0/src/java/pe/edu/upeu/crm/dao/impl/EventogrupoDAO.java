package pe.edu.upeu.crm.dao.impl;

import java.util.List;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.crm.bean.Eventogrupo;
import pe.edu.upeu.crm.dao.CrudDAO;
import pe.edu.upeu.crm.dao.HibernateParam;

@Repository
public class EventogrupoDAO extends CrudDAO<Eventogrupo> {

    @Override
    public int delete(Eventogrupo bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Eventogrupo> list(HibernateParam... param) {
        return executeHQLQuery("From Eventogrupo e where e.id.idEvento=:idEvento and e.id.idGrupo=:idGrupo", param);
    }

    @Override
    public List<Eventogrupo> listEnabled(HibernateParam... param) {
        return executeHQLQuery("From Eventogrupo e where e.id.idEvento=:idEvento", param);
    }

    @Override
    public List<Eventogrupo> listDisabled(HibernateParam... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Eventogrupo> search(HibernateParam... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Eventogrupo get(HibernateParam... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Eventogrupo getByParent(HibernateParam... parentID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
