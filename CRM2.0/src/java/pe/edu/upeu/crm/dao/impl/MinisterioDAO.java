package pe.edu.upeu.crm.dao.impl;

import java.util.List;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.crm.bean.Ministerio;
import pe.edu.upeu.crm.dao.CrudDAO;
import pe.edu.upeu.crm.dao.HibernateParam;

@Repository
public class MinisterioDAO extends CrudDAO<Ministerio>{

    @Override
    public int delete(Ministerio bean) {
        return executeHQLUpdate("Update Ministerio m set m.minEstado='0' where m.idMinisterio =:idMinisterio" ,
                new HibernateParam("idMinisterio", bean.getIdMinisterio()));
    }

    @Override
    public List<Ministerio> list(HibernateParam... param) {
        return executeHQLQuery("From Ministerio");
    }

    @Override
    public List<Ministerio> listEnabled(HibernateParam... param) {
        return executeHQLQuery("From Ministerio m where m.iglesia.idIglesia=:idIglesia "
                + "and m.minEstado = '1' order by m.minNombre", param);
    }

    @Override
    public List<Ministerio> listDisabled(HibernateParam... param) {
        return executeHQLQuery("From Ministerio m where m.iglesia.idIglesia=:idIglesia "
                + "and m.minEstado = '0' order by m.minNombre", param);
    }

    @Override
    public List<Ministerio> search(HibernateParam... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Ministerio get(HibernateParam... param) {
        return listUnique("From Ministerio m where m.idMinisterio =:idMinisterio", param);
    }

    @Override
    public Ministerio getByParent(HibernateParam... parentID) {
        return listUnique("From Ministerio m where m.iglesia.idIglesia =:idIglesia", parentID);
    }
    
}
