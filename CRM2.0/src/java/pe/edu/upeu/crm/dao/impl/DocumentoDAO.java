package pe.edu.upeu.crm.dao.impl;

import java.util.List;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.crm.bean.Documento;
import pe.edu.upeu.crm.dao.CrudDAO;

@Repository
public class DocumentoDAO extends CrudDAO<Documento> {

    @Override
    public int delete(Documento bean) {
        bean.setDocEstado("0");
        return update(bean);
    }

    @Override
    public List<Documento> list(Object... param) {
        return executeHQLQuery("From Documento", (Object[]) null);
    }

    @Override
    public List<Documento> listEnabled(Object... param) {
        Object[] estado = {"estado","1"};
        return executeHQLQuery("From Documento d where d.docEstado = :estado", estado);
    }

    @Override
    public List<Documento> listDisabled(Object... param) {
        Object[] estado = {"estado","0"};
        return executeHQLQuery("From Documento d where d.docEstado = :estado", estado);
    }

    @Override
    public List<Documento> search(Object... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Documento get(Object... id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
