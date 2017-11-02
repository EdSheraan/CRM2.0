package pe.edu.upeu.crm.dao.impl;

import java.util.List;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.crm.bean.Escuela;
import pe.edu.upeu.crm.dao.CrudDAO;
import pe.edu.upeu.crm.dao.HibernateParam;

@Repository
public class EscuelaDAO extends CrudDAO<Escuela> {

    @Override
    public int delete(Escuela bean) {
        HibernateParam param = new HibernateParam("idEscuela", bean.getIdEscuela());
        return executeHQLUpdate("Update Escuela e set e.escEstado = '0' where e.idEscuela = :idEscuela", param);
    }

    @Override
    public List<Escuela> list(HibernateParam... param) {
        return executeHQLQuery("From Escuela");
    }

    @Override
    public List<Escuela> listEnabled(HibernateParam... param) {
        return executeHQLQuery("From Escuela e where e.iglesia.idIglesia=:idIglesia and e.escEstado = '1' order by e.escNombre asc", param);
    }

    @Override
    public List<Escuela> listDisabled(HibernateParam... param) {
        return executeHQLQuery("From Escuela e where e.iglesia.idIglesia=:idIglesia and e.escEstado = '0' order by e.escNombre asc", param);
    }

    @Override
    public List<Escuela> search(HibernateParam... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Escuela get(HibernateParam... param) {
        return listUnique("From Escuela e where e.idEscuela=:idEscuela", param);
    }
    @Override
    public Escuela getByParent(HibernateParam... parentID) {
        return listUnique("From Escuela e where e.iglesia.idIglesia=:idIglesia", parentID);
    }
}
