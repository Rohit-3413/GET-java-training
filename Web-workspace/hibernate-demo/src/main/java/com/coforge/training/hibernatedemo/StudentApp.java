package com.coforge.training.hibernatedemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.coforge.training.hibernatedemo.model.Student;

/** 
 * Author	:Rohit.10.Gupta
 * Date		:Sep 24, 2025
 * Time		:12:34:46 PM
 * Project	:hibernate-demo
*/

public class StudentApp {

	public static void main(String[] args)  {
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
        Student st = new Student();
        
        st.setRollNumber(6);
        st.setName("Ricky");
        st.setBranch("EE");
        st.setMarks(80.4);
        
     // persist() is a JPA method to save the entity , used for annotated classes
     //used within tranactional context
        session.persist(st);	//Save Employee Object to DB
        
        tx.commit();
        System.out.println("Student Object Saved");
        session.close();
        factory.close();
    }

}
