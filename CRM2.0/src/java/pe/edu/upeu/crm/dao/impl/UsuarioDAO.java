package pe.edu.upeu.crm.dao.impl;

import java.util.List;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.crm.bean.Usuario;
import pe.edu.upeu.crm.dao.CrudDAO;

@Repository
public class UsuarioDAO extends CrudDAO<Usuario> {

    @Override
    public int delete(Usuario bean) {
        bean.setUsuEstado("0");
        return update(bean);
    }

    @Override
    public List<Usuario> list(Object... param) {
        return executeHQLQuery("From Usuario", (Object[]) null);
    }

    @Override
    public List<Usuario> listEnabled(Object... param) {
        Object[] estado = {"estado","1"};
        return executeHQLQuery("From Usuario u where u.usuEstado = :estado", estado);
    }

    @Override
    public List<Usuario> listDisabled(Object... param) {
        Object[] estado = {"estado","0"};
        return executeHQLQuery("From Usuario u where u.usuEstado = :estado", estado);
    }

    @Override
    public List<Usuario> search(Object... param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Usuario get(Object... id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Usuario get(String name) {
        return listUnique("FROM Usuario u join fetch u.detrols as rols join fetch u.persona as per where u.usuUsuario='" + name + "'");
    }
}
