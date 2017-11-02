package pe.edu.upeu.crm.dao.impl;

import java.util.List;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.crm.bean.Documento;
import pe.edu.upeu.crm.dao.CrudDAO;
import pe.edu.upeu.crm.dao.HibernateParam;

@Repository
public class DocumentoDAO extends CrudDAO<Documento> {

    @Override
    public int delete(Documento bean) {
        bean.setDocEstado("0");
        return update(bean);
    }

    @Override
    public List<Documento> list(HibernateParam... param) {
        return executeHQLQuery("From Documento");
    }

    @Override
    public List<Documento> listEnabled(HibernateParam... param) {
        
        return executeHQLQuery("From Documento d where d.docEstado = '1'");
    }

    @Override
    public List<Documento> listDisabled(HibernateParam... param) {
        
        return executeHQLQuery("From Documento d where d.docEstado = '1'");
    }

    @Override
    public List<Documento> search(HibernateParam... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Documento get(HibernateParam... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Documento getByParent(HibernateParam... parentID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
