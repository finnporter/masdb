package db;

import models.Dog;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class DBDog {

    private static Transaction transaction;
    private static Session session;

    public static void saveDog(Dog dog) {

        session = HibernateUtil.getSessionFactory().openSession();
        try {
            transaction = session.beginTransaction();
            session.save(dog);
            transaction.commit();
        } catch (HibernateException ex) {
            transaction.rollback();
            ex.printStackTrace();
        } finally {
            session.close();
        }
    }

    public static List<Dog> getAllDogs() {
        session = HibernateUtil.getSessionFactory().openSession();
        List<Dog> allDogs = null;
        try {
            transaction = session.beginTransaction();
            allDogs = session.createQuery("from Dog").list();
            transaction.commit();
        } catch (HibernateException ex) {
            transaction.rollback();
            ex.printStackTrace();
        } finally {
            session.close();
        }
        return allDogs;
    }

    public static Dog findDogbyId(int id) {

        session = HibernateUtil.getSessionFactory().openSession();
        Dog dog = null;
        try {
            transaction = session.beginTransaction();
            String sql = "from Dog where id = :id";
            Query query = session.createQuery(sql);
            query.setInteger("id", id);
            dog = (Dog) query.uniqueResult();
            transaction.commit();
        } catch (HibernateException ex) {
            transaction.rollback();
            ex.printStackTrace();
        } finally {
            session.close();
        }

        return dog;
    }


    public static void updateDogbyId(int id) {
//        TODO refactor to go by Id
        session = HibernateUtil.getSessionFactory().openSession();
        Dog dog = null;
        try {
            transaction = session.beginTransaction();
            String sql = "from Dog where id = :id";
            Query query = session.createQuery(sql);
            query.setInteger("id", id);
            dog = (Dog) query.uniqueResult();
            session.update(dog);
            transaction.commit();
        } catch (HibernateException ex) {
            transaction.rollback();
            ex.printStackTrace();
        } finally {
            session.close();
        }
    }


    public static void deleteAllDogs() {

        session = HibernateUtil.getSessionFactory().openSession();
        try {
            transaction = session.beginTransaction();
            String sql = String.format("delete from %s", "Dog");
            Query query = session.createQuery(sql);
            query.executeUpdate();
        } catch (HibernateException ex) {
            transaction.rollback();
            ex.printStackTrace();
        } finally {
            session.close();
        }
    }


    public static void deleteDogById(int id) {

        session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        Dog dog = null;
        try {
            transaction = session.beginTransaction();
            String sql = "from Dog where id = :id";
            Query query = session.createQuery(sql);
            query.setInteger("id", id);
            dog = (Dog) query.uniqueResult();
            session.delete(dog);
            transaction.commit();
        } catch (HibernateException ex) {
            transaction.rollback();
            ex.printStackTrace();
        } finally {
            session.close();
        }
    }
}