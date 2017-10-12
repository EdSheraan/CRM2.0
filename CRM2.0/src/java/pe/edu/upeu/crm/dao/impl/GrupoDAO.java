package pe.edu.upeu.crm.dao.impl;

import java.util.List;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.crm.bean.Grupo;
import pe.edu.upeu.crm.dao.CrudDAO;

@Repository
public class GrupoDAO extends CrudDAO<Grupo>{

    @Override
    public int delete(Grupo bean) {
        bean.setGpoEstado("0");
        return update(bean);
    }

    @Override
    public List<Grupo> list(Object... param) {
        return executeHQLQuery("From Grupo", (Object[]) null);
    }

    @Override
    public List<Grupo> listEnabled(Object... param) {
        Object[] estado = {"estado","1"};
        return executeHQLQuery("From Grupo g where g.gpoEstado = :estado", estado);
    }

    @Override
    public List<Grupo> listDisabled(Object... param) {
        Object[] estado = {"estado","0"};
        return executeHQLQuery("From Grupo g where g.gpoEstado = :estado", estado);
    }

    @Override
    public List<Grupo> search(Object... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Grupo get(Object... id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
