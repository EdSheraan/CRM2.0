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
        HibernateParam param = new HibernateParam("idGrupo", bean.getIdGrupo());
        return executeHQLUpdate("Update Grupo g set g.gpoEstado = '0' where g.idGrupo = :idGrupo",param);
    }

    @Override
    public List<Grupo> list(HibernateParam... param) {
        return executeHQLQuery("From Grupo g where g.escuela.idEscuela=:idEscuela order by g.gpoNombre asc", param);
    }

    @Override
    public List<Grupo> listEnabled(HibernateParam... param) {
            return executeHQLQuery("From Grupo g where g.escuela.idEscuela=:idEscuela and g.gpoEstado ='1' order by g.gpoNombre asc", param);
    }

    @Override
    public List<Grupo> listDisabled(HibernateParam... param) {
        return executeHQLQuery("From Grupo g where g.escuela.idEscuela=:idEscuela and g.gpoEstado ='0'",param);
    }

    @Override
    public List<Grupo> search(HibernateParam... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Grupo get(HibernateParam... param) {
        return listUnique("From Grupo g where g.idGrupo=:idGrupo", param);
    }

    @Override
    public Grupo getByParent(HibernateParam... parentID) {
        return listUnique("From Grupo g where g.escuela.idEscuela=:idEscuela", parentID);
    }
    
}
