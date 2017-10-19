package pe.edu.upeu.crm.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @param <T>
 */
@Repository
public abstract class CrudDAO<T> {
    
    public static final String ESTADO_ACTIVO ="1";
    public static final String ESTADO_INACTIVO ="0";

    
    protected SessionFactory sessionFactory;
    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    

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

    public abstract int delete(T bean);

    public abstract List<T> list(HibernateParam... param);

    public abstract List<T> listEnabled(HibernateParam... param);

    public abstract List<T> listDisabled(HibernateParam... param);

    public abstract List<T> search(HibernateParam... param);

    public abstract T get(HibernateParam... id);
    
    public List<T> executeHQLQuery(String query, HibernateParam... params) {
        Session session = sessionFactory.openSession();
        List<T> list = new ArrayList<>();
        try {
            
            Query q = session.createQuery(query);
            if (params != null) {
                for (HibernateParam p : params) {
                    if (p != null) {
                        q.setParameter(p.getName(), p.getValue());
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
    
    public int executeHQLUpdate(String query, HibernateParam... params) {
        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction();
            Query q = session.createQuery(query);
            if (params != null) {
                for (HibernateParam p : params) {
                    if (p != null) {
                        q.setParameter(p.getName(), p.getValue());
                    }
                }
            }
            int r= q.executeUpdate();
            session.getTransaction().commit();
            return r;
        } catch (Exception e) {
            session.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return 0;
    }

    public T listUnique(String query,HibernateParam... params) {
        Session session = sessionFactory.openSession();
        T bean = null;
        try {
            //session.beginTransaction();
            Query q = session.createQuery(query);
            if (params != null) {
                for (HibernateParam p : params) {
                    if (p != null) {
                        q.setParameter(p.getName(), p.getValue());
                    }
                }
            }
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
