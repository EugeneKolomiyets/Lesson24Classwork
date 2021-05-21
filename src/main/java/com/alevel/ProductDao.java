package com.alevel;

import org.hibernate.CustomEntityDirtinessStrategy;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import javax.xml.transform.Result;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ResourceBundle;

public class ProductDao {
    private SessionFactory sessionFactory;

    public ProductDao(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }
    public List<Product> getAll() {
        Session session = sessionFactory.openSession();
/*      Query query = session.createQuery("FROM ProductDao");
        session.close();
        return query.list();*/
        return session.createQuery("FROM Product").list();
    }
    public Product getById(long id) {
        Session session = sessionFactory.openSession();
/*      Query query = session.createQuery("FROM ProductDao");
        session.close();
        return query.list();*/
        //return session.createQuery("FROM Product").list();
        Query query = session.createQuery("FROM CustomerEntity WHERE id = :customerId");
        query.setParameter("customerrId",id);
        return (Product)query.getSingleResult();
    }
/*    public Product add(Produjkct newEntity){
        Session session = sessionFactory.openSession();
        return (Product)session.save(newEntity);
    }*/
}
