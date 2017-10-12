/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.crm.dao.impl;

import java.util.List;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.crm.bean.Persona;
import pe.edu.upeu.crm.dao.CrudDAO;

/**
 *
 * @author Leandro Burgos
 */
@Repository
public class PersonaDAO extends CrudDAO<Persona>{

    @Override
    public int delete(Persona bean) {
        bean.setPerEstado("0");
        return update(bean);
    }

    @Override
    public List<Persona> list(Object... param) {
        return executeHQLQuery("From Persona", (Object[]) null);
    }

    @Override
    public List<Persona> listEnabled(Object... param) {
        Object[] estado = {"estado","1"};
        return executeHQLQuery("From Persona p join fetch p.documento as doc where p.perEstado = :estado", estado);
    }

    @Override
    public List<Persona> listDisabled(Object... param) {
        Object[] estado = {"estado","0"};
        return executeHQLQuery("From Persona p join fetch p.documento as doc where p.perEstado = :estado", estado);
    }

    @Override
    public List<Persona> search(Object... param) {
        return executeHQLQuery("From Persona p join fetch p.documento as doc where "
                + "UPPER(p.perNombres) like UPPER('%'|| :nombres ||'%') "
                + "AND UPPER(p.perApellidos) like UPPER('%'|| :apellidos || '%') "
                + "AND UPPER(p.perDocumento) like UPPER('%'|| :documento ||'%')", param);
    }

    @Override
    public Persona get(Object... id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
