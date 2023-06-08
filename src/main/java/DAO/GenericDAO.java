package DAO;

import java.util.List;
import javax.persistence.criteria.CriteriaQuery;
import org.hibernate.HibernateException;
import org.hibernate.Session;

public class GenericDAO {

    public void inserir(Object obj) {
        Session session = null;
        try {
            session = HibernateConnection.getSessionFactory().openSession();
            session.beginTransaction();

            session.save(obj);

            session.getTransaction().commit();
            session.close();

        } catch (HibernateException erro) {
            if (session != null) {
                session.getTransaction().rollback();
                session.close();
            }
        }
    }
    
    public Object get(Class classe, int id){
        Session sessao = null;
        Object obj = null;

        try {
            sessao = HibernateConnection.getSessionFactory().openSession();
            sessao.beginTransaction();

            obj = sessao.get(classe, id);

            sessao.getTransaction().commit();
            sessao.close();
        } catch (HibernateException erro) {
            if (sessao != null) {
                sessao.getTransaction().rollback();
                sessao.close();
            }
        }
        return obj;
    }

    public List listar(Class classe) throws HibernateException {
        Session sessao = null;
        List lista = null;

        try {
            sessao = HibernateConnection.getSessionFactory().openSession();
            sessao.beginTransaction();

            //OPERAÇÕES
            CriteriaQuery consulta = sessao.getCriteriaBuilder().createQuery(classe);
            consulta.from(classe);
            lista = sessao.createQuery(consulta).getResultList();

            sessao.getTransaction().commit();
            sessao.close();
        } catch (HibernateException erro) {
            if (sessao != null) {
                sessao.getTransaction().rollback();
                sessao.close();
            }
        }
        return lista;
    }
    
    public void alterar(Object obj){
        Session session = null;
        try {
            session = HibernateConnection.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(obj);

            session.getTransaction().commit();
            session.close();

        } catch (HibernateException erro) {
            if (session != null) {
                session.getTransaction().rollback();
                session.close();
            }
        }
    }
    
    public void excluir(Object obj) {
        Session session = null;
        try {
            session = HibernateConnection.getSessionFactory().openSession();
            session.beginTransaction();

            session.delete(obj);

            session.getTransaction().commit();
            session.close();

        } catch (HibernateException erro) {
            if (session != null) {
                session.getTransaction().rollback();
                session.close();
            }
        }
    }

}
