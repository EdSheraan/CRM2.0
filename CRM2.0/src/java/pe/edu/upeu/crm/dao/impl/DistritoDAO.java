package pe.edu.upeu.crm.dao.impl;

import java.util.List;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.crm.bean.Distrito;
import pe.edu.upeu.crm.dao.CrudDAO;
import pe.edu.upeu.crm.dao.HibernateParam;

@Repository
public class DistritoDAO extends CrudDAO<Distrito> {

    @Override
    public int delete(Distrito bean) {
        return executeHQLUpdate("Update Distrito d set disEstado='0' where d.idDistrito =:idDistrito", 
                new HibernateParam("idDistrito", bean.getIdDistrito()));
    }

    @Override
    public List<Distrito> list(HibernateParam... param) {
        return executeHQLQuery("From Distrito d where d.campo.idCampo=:idCampo order by d.disNombre asc", param);
    }

    @Override
    public List<Distrito> listEnabled(HibernateParam... param) {
        return executeHQLQuery("From Distrito d where d.campo.idCampo=:idCampo and d.disEstado ='1' order by d.disNombre asc", param);
    }

    @Override
    public List<Distrito> listDisabled(HibernateParam... param) {
        return executeHQLQuery("From Distrito d where d.campo.idCampo=:idCampo and d.disEstado ='0' order by d.disNombre asc", param);
    }

    @Override
    public List<Distrito> search(HibernateParam... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Distrito get(HibernateParam... param) {
        return listUnique("From Distrito d where d.idDistrito=:idDistrito", param);
    }

    @Override
    public Distrito getByParent(HibernateParam... parentID) {
        return listUnique("From Distrito d where d.campo.idCampo=:idCampo", parentID);
    }

}
