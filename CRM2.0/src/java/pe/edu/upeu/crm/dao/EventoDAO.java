package pe.edu.upeu.crm.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.crm.bean.Evento;

@Repository
public class EventoDAO extends CrudDAO<pe.edu.upeu.crm.bean.Evento>{

    @Override
    public int delete(Evento bean) {
        bean.setEvtEstado("0");
        return update(bean);
    }

    @Override
    public List<Evento> list(Object... param) {
        return executeHQLQuery("From Evento", (Object[]) null);
    }

    @Override
    public List<Evento> listEnabled(Object... param) {
        Object[] estado = {"estado", "1"};
        return executeHQLQuery("From Evento e where e.evtEstado = :estado", estado);
    }

    @Override
    public List<Evento> listDisabled(Object... param) {
        Object[] estado = {"estado", "0"};
        return executeHQLQuery("From Evento e where e.evtEstado = :estado", estado);
    }

    @Override
    public List<Evento> search(Object... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Evento get(Object... id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
