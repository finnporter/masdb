package db;

import models.Breeder;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class DBBreeder {

    private static Transaction transaction;
    private static Session session;

    public static void saveBreeder(Breeder breeder) {

        session = HibernateUtil.getSessionFactory().openSession();
        try {
            transaction = session.beginTransaction();
            session.save(breeder);
            transaction.commit();
        } catch (HibernateException ex) {
            transaction.rollback();
            ex.printStackTrace();
        } finally {
            session.close();
        }
    }

    public static List<Breeder> getAllBreeders() {
        session = HibernateUtil.getSessionFactory().openSession();
        List<Breeder> allBreeders = null;
        try {
            transaction = session.beginTransaction();
            allBreeders = session.createQuery("from Breeder").list();
            transaction.commit();
        } catch (HibernateException ex) {
            transaction.rollback();
            ex.printStackTrace();
        } finally {
            session.close();
        }
        return allBreeders;
    }


    public static void updateBreederById(Breeder breeder) {
        session = HibernateUtil.getSessionFactory().openSession();
        try {
            transaction = session.beginTransaction();
            session.update(breeder);
            transaction.commit();
        } catch (HibernateException ex) {
            transaction.rollback();
            ex.printStackTrace();
        } finally {
            session.close();
        }
    }


    public static void deleteAllBreeders() {

        session = HibernateUtil.getSessionFactory().openSession();
        try {
            transaction = session.beginTransaction();
            String sql = String.format("delete from %s", "Breeder");
            Query query = session.createQuery(sql);
            query.executeUpdate();
        } catch (HibernateException ex) {
            transaction.rollback();
            ex.printStackTrace();
        } finally {
            session.close();
        }
    }


    public static void deleteBreederById(int id) {

        session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        Breeder breeder = null;
        try {
            transaction = session.beginTransaction();
            String sql = "from Breeder where id = :id";
            Query query = session.createQuery(sql);
            query.setInteger("id", id);
            breeder = (Breeder) query.uniqueResult();
            session.delete(breeder);
            transaction.commit();
        } catch (HibernateException ex) {
            transaction.rollback();
            ex.printStackTrace();
        } finally {
            session.close();
        }
    }
}
