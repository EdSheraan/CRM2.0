package pe.edu.upeu.crm.dao.impl;

import java.util.List;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.crm.bean.Campo;
import pe.edu.upeu.crm.dao.CrudDAO;
import pe.edu.upeu.crm.dao.HibernateParam;

@Repository
public class CampoDAO extends CrudDAO<Campo>{

    @Override
    public int delete(Campo bean) {
        return executeHQLUpdate("Update Campo c set c.cmpEstado='0' where c.idCampo=:idCampo",
                new HibernateParam("idCampo", bean.getIdCampo()));
    }

    @Override
    public List<Campo> list(HibernateParam... param) {
        return executeHQLQuery("From Campo");
    }

    @Override
    public List<Campo> listEnabled(HibernateParam... param) {
        return executeHQLQuery("From Campo c where c.cmpEstado = '1'");
    }

    @Override
    public List<Campo> listDisabled(HibernateParam... param) {
        return executeHQLQuery("From Campo c where c.cmpEstado = '0'");
    }

    @Override
    public List<Campo> search(HibernateParam... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Campo get(HibernateParam... param) {
        return listUnique("From Campo c where c.idCampo =:idCampo", param);
    }

    @Override
    public Campo getByParent(HibernateParam... parentID) {
        return listUnique("From Campo c where c.unionp.idUnion =:idUnion", parentID);
    }
    
}
