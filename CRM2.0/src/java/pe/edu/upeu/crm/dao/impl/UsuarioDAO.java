package pe.edu.upeu.crm.dao.impl;

import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.crm.bean.Usuario;
import pe.edu.upeu.crm.dao.CrudDAO;
import pe.edu.upeu.crm.dao.HibernateParam;
import pe.edu.upeu.crm.dao.HibernateParam;

@Repository
public class UsuarioDAO extends CrudDAO<Usuario> {

    @Override
    public int delete(Usuario bean) {
        bean.setUsuEstado("0");
        return update(bean);
    }

    @Override
    public List<Usuario> list(HibernateParam... param) {
        return executeHQLQuery("From Usuario");
    }

    @Override
    public List<Usuario> listEnabled(HibernateParam... param) {
        return executeHQLQuery("From Usuario u where u.usuEstado = '1'");
    }

    @Override
    public List<Usuario> listDisabled(HibernateParam... param) {
        return executeHQLQuery("From Usuario u where u.usuEstado = '0'");
    }

    @Override
    public List<Usuario> search(HibernateParam... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Usuario get(HibernateParam... ids) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Usuario getByName(HibernateParam param) {
        return listUnique("FROM Usuario u where u.usuUsuario=:usuario",param);
    }
}
