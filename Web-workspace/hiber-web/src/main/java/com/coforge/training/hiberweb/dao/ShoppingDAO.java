package com.coforge.training.hiberweb.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.coforge.training.hiberweb.model.ShoppingCart;

/** 
 * Author	:Rohit.10.Gupta
 * Date		:Sep 25, 2025
 * Time		:4:21:39 PM
 * Project	:hiber-web
*/

public class ShoppingDAO {

	private static SessionFactory sessionFactory;

    static {
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.xml")
                .build();
        sessionFactory = new MetadataSources(registry)
                .addAnnotatedClass(ShoppingCart.class)
                .buildMetadata()
                .buildSessionFactory();
    }

    public void save(ShoppingCart cart) {
        try (Session session = sessionFactory.openSession()) {
            Transaction tx = session.beginTransaction();
            session.persist(cart);
            tx.commit();
        }
    }

    public List<ShoppingCart> getAll() {
        try (Session session = sessionFactory.openSession()) {
            return session.createQuery("from ShoppingCart", ShoppingCart.class).list();
        }
    }

}
