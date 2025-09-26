package com.coforge.training.hiberweb.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.coforge.training.hiberweb.model.User;
/** 
 * Author	:Rohit.10.Gupta
 * Date		:Sep 25, 2025
 * Time		:2:40:53 PM
 * Project	:hiber-web
*/

public class UserDAO {
	
	private static SessionFactory sessionFactory;
	
	static {
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.xml")
                .build();
        sessionFactory = new MetadataSources(registry)
                .addAnnotatedClass(User.class)
                .buildMetadata()
                .buildSessionFactory();
    }

    public void save(User user) {
        try (Session session = sessionFactory.openSession()) {
            Transaction tx = session.beginTransaction();
            session.persist(user);
            tx.commit();
        }
    }

    public List<User> getAll() {
        try (Session session = sessionFactory.openSession()) {
            return session.createQuery(
                "select distinct u from User u left join fetch u.skills",
                User.class
            ).list();
        }
    }
}
