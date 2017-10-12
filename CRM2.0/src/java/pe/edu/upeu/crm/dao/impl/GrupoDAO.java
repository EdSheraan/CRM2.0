package pe.edu.upeu.crm.dao.impl;

import java.util.List;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.crm.bean.Grupo;
import pe.edu.upeu.crm.dao.CrudDAO;
import pe.edu.upeu.crm.dao.HibernateParam;

@Repository
public class GrupoDAO extends CrudDAO<Grupo>{

    @Override
    public int delete(Grupo bean) {
        bean.setGpoEstado("0");
        return update(bean);
    }

    @Override
    public List<Grupo> list(HibernateParam... param) {
        return executeHQLQuery("From Grupo");
    }

    @Override
    public List<Grupo> listEnabled(HibernateParam... param) {
        
        return executeHQLQuery("From Grupo g where g.gpoEstado = '1'");
    }

    @Override
    public List<Grupo> listDisabled(HibernateParam... param) {
        
        return executeHQLQuery("From Grupo g where g.gpoEstado = '1'");
    }

    @Override
    public List<Grupo> search(HibernateParam... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Grupo get(HibernateParam... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
