package pe.edu.upeu.crm.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * @param <T>
 */

public abstract class CrudDAO<T> {

    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    public Object add(T bean) {
        Session session = sessionFactory.openSession();
        Serializable r = null;
        try {
            session.beginTransaction();
            r = session.save(bean);
            session.getTransaction().commit();
        } catch (Exception e) {
            r = null;
            session.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return r;
    }

    @Transactional
    public int update(T bean) {
        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction();
            session.update(bean);
            session.getTransaction().commit();
            return 1;
        } catch (Exception e) {
            session.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return 0;
    }

    @Transactional
    public abstract int delete(T bean);

    public abstract List<T> list(Object... param);

    public abstract List<T> listEnabled(Object... param);

    public abstract List<T> listDisabled(Object... param);

    public abstract List<T> search(Object... param);

    public abstract T get(Object... id);
    
    public List<T> executeHQLQuery(String query, Object[]... params) {
        Session session = sessionFactory.openSession();
        List<T> list = new ArrayList<>();
        try {
            session.beginTransaction();
            Query q = session.createQuery(query);
            if (params != null) {
                for (Object[] p : params) {
                    if (p != null) {
                        q.setParameter(p[0].toString(), p[1]);
                    }
                }
            }
            list = q.list();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return list;
    }

    @Transactional
    public T listUnique(String query) {
        Session session = sessionFactory.openSession();
        T bean = null;
        try {
            session.beginTransaction();
            Query q = session.createQuery(query);
            q.setMaxResults(1);
            bean = (T) q.uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return bean;
    }
}
