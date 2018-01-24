package db;

import models.Login;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class DBLogin {

    private static Transaction transaction;
    private static Session session;

    public static void saveLogin(Login login) {

        session = HibernateUtil.getSessionFactory().openSession();
        try {
            transaction = session.beginTransaction();
            session.save(login);
            transaction.commit();
        } catch (HibernateException ex) {
            transaction.rollback();
            ex.printStackTrace();
        } finally {
            session.close();
        }
    }

    public static Login findLoginById(int id) {

        session = HibernateUtil.getSessionFactory().openSession();
        Login login = null;
        try {
            transaction = session.beginTransaction();
            String sql = "from Login where id = :id";
            Query query = session.createQuery(sql);
            query.setInteger("id", id);
            login = (Login) query.uniqueResult();
            transaction.commit();
        } catch (HibernateException ex) {
            transaction.rollback();
            ex.printStackTrace();
        } finally {
            session.close();
        }

        return login;
    }


    public static void updateLoginById(int id) {

        session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        Login login = null;
        try {
            transaction = session.beginTransaction();
            String sql = "from Login where id = :id";
            Query query = session.createQuery(sql);
            query.setInteger("id", id);
            login = (Login) query.uniqueResult();
            session.update(login);
            transaction.commit();
        } catch (HibernateException ex) {
            transaction.rollback();
            ex.printStackTrace();
        } finally {
            session.close();
        }
    }


    public static void deleteAllLogins() {

        session = HibernateUtil.getSessionFactory().openSession();
        try {
            transaction = session.beginTransaction();
            String sql = String.format("delete from %s", "Login");
            Query query = session.createQuery(sql);
            query.executeUpdate();
        } catch (HibernateException ex) {
            transaction.rollback();
            ex.printStackTrace();
        } finally {
            session.close();
        }
    }


    public static void deleteLoginById(int id) {

        session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        Login login = null;
        try {
            transaction = session.beginTransaction();
            String sql = "from Login where id = :id";
            Query query = session.createQuery(sql);
            query.setInteger("id", id);
            login = (Login) query.uniqueResult();
            session.delete(login);
            transaction.commit();
        } catch (HibernateException ex) {
            transaction.rollback();
            ex.printStackTrace();
        } finally {
            session.close();
        }
    }
}
