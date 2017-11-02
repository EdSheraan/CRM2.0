package pe.edu.upeu.crm.dao.impl;

import java.util.List;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.crm.bean.Iglesia;
import pe.edu.upeu.crm.dao.CrudDAO;
import pe.edu.upeu.crm.dao.HibernateParam;

@Repository
public class IglesiaDAO extends CrudDAO<Iglesia> {

    @Override
    public int delete(Iglesia bean) {
        return executeHQLUpdate("Update Iglesia i set i.iglEstado='0' where i.idIglesia=:idIglesia",
                new HibernateParam("idIglesia", bean.getIdIglesia()));
    }

    @Override
    public List<Iglesia> list(HibernateParam... param) {
        return executeHQLQuery("From Iglesia");
    }

    @Override
    public List<Iglesia> listEnabled(HibernateParam... param) {
        return executeHQLQuery("From Iglesia i where i.distrito.idDistrito=:idDistrito and i.iglEstado ='1' order by i.iglNombre asc", param);
    }

    @Override
    public List<Iglesia> listDisabled(HibernateParam... param) {
        return executeHQLQuery("From Iglesia i where i.distrito.idDistrito=:idDistrito and i.iglEstado ='0' order by i.iglNombre asc", param);
    }

    @Override
    public List<Iglesia> search(HibernateParam... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Iglesia get(HibernateParam... param) {
        return listUnique("From Iglesia i where i.idIglesia=:idIglesia", param);
    }

    @Override
    public Iglesia getByParent(HibernateParam... parentID) {
        return listUnique("From Iglesia i where i.distrito.idDistrito=:idDistrito", parentID);
    }

}
