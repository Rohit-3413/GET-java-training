package com.coforge.training.hibernatedemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.coforge.training.hibernatedemo.model.Employee;

/**
 * Hibernate Demo Application to save Employee details using Hibernate ORM Tool using XML configuration
 *
 */
public class EmployeeApp 
{
    public static void main( String[] args )
    {
    	// Configure hibernate App
        Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
        System.out.println("Configuration Object Created");
        
        // It is a factory of sessions
        SessionFactory factory = cfg.buildSessionFactory();
        System.out.println("SessionFactory Object Created");
        
        // Create physical connection with DB
        Session session = factory.openSession();
        System.out.println("Session Object Created");
        
        // Create Transaction Object to handle transactions
        Transaction tx = session.beginTransaction();
        System.out.println("Transaction Object Created");
        
        //Create Employee Object
        Employee emp = new Employee(106, "Rod", "Johnson", 70000, "IT", "rod@hibernate.org");
        
        // save() method is a Hibernate method to save the entity, used for non-annotated classes
        // it returns the generated identifier.
        // used without transactional context
        session.save(emp);	//Save Employee Object to DB
        
        tx.commit();
        System.out.println("Employee Object Saved");
        session.close();
    }
}
