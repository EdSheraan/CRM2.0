package pe.edu.upeu.crm.dao.impl;

import java.util.List;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.crm.bean.Periodo;
import pe.edu.upeu.crm.dao.CrudDAO;
import pe.edu.upeu.crm.dao.HibernateParam;

@Repository
public class PeriodoDAO extends CrudDAO<Periodo>{

    @Override
    public int delete(Periodo bean) {
        return executeHQLUpdate("Update Periodo p set p.prdEstado ='0' where p.idPeriodo= :idPeriodo",
                new HibernateParam("idPeriodo", bean.getIdPeriodo()));
    }

    @Override
    public List<Periodo> list(HibernateParam... param) {
        return executeHQLQuery("From Periodo");
    }

    @Override
    public List<Periodo> listEnabled(HibernateParam... param) {
        String distrito =param[0].getValue().toString();
        String iglesia =param[1].getValue().toString();
        if(iglesia.equals("0")){
            if(distrito.equals("0")){
                return executeHQLQuery("From Periodo p where p.prdEstado = '1'");
            }else{
                return executeHQLQuery("From Periodo p where p.prdEstado = '1' "
                        + "and p.prdDistrito = : prdDistrito", param[0]);
            }
        }else{
            if(distrito.equals("0")){
                return executeHQLQuery("From Periodo p where p.prdEstado = '1' "
                        + "and p.prdIglesia = : prdIglesia", param[0]);
            }else{
                return executeHQLQuery("From Periodo p where p.prdEstado = '1' "
                        + "and p.prdDistrito = :prdDistrito and p.prdIglesia = :prdIglesia", param);
            }
        }        
    }

    @Override
    public List<Periodo> listDisabled(HibernateParam... param) {
        return executeHQLQuery("From Periodo p where p.prdEstado = '0'");
    }

    @Override
    public List<Periodo> search(HibernateParam... param) {
        return executeHQLQuery("From Periodo p where p.prdEstado = '1' and p.prdNombre = :prdNombre", param[0]);
    }

    @Override
    public Periodo get(HibernateParam... param) {
        return listUnique("From Periodo p where p.idPeriodo= :idPeriodo", param[0]);
    }

    @Override
    public Periodo getByParent(HibernateParam... parentID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
