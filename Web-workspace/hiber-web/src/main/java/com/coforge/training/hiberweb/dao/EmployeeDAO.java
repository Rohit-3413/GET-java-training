package com.coforge.training.hiberweb.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.coforge.training.hiberweb.model.Employee;

/** 
 * Author	:Rohit.10.Gupta
 * Date		:Sep 25, 2025
 * Time		:12:17:23 PM
 * Project	:hiber-web
*/

public class EmployeeDAO {
	
	 private static SessionFactory sessionFactory;

	    static {
	        try {
	            Configuration cfg = new Configuration();
	            cfg.configure("hibernate.cfg.xml"); // make sure this file is in classpath
	            cfg.addAnnotatedClass(Employee.class);
	            sessionFactory = cfg.buildSessionFactory();
	        } catch (Exception e) {
	            e.printStackTrace();
	            throw new ExceptionInInitializerError("SessionFactory init failed");
	        }
	    }

	    // Save employee
	    public void addEmployeeDetails(String name, String department, double salary) {
	        try (Session session = sessionFactory.openSession()) {
	            Transaction tx = session.beginTransaction();
	            // Create an Employee object
	            Employee employee = new Employee();
	            
	            employee.setName(name);
	            employee.setDepartment(department);
	            employee.setSalary(salary);
	
	           
	            session.persist(employee);
	            tx.commit();
	        }
	    }

	    // Fetch all employees
	    public List<Employee> getAll() {
	        try (Session session = sessionFactory.openSession()) {
	            return session.createQuery("from Employee", Employee.class).list();
	        }
	    }

	    // Fetch employees by department
	    public List<Employee> getByDepartment(String dept) {
	        try (Session session = sessionFactory.openSession()) {
	            return session.createQuery("from Employee e where e.department = :dept", Employee.class)
	                          .setParameter("dept", dept)
	                          .list();
	        }
	    }

	    // Fetch employees with salary greater than a threshold
	    public List<Employee> getByMinSalary(double minSalary) {
	        try (Session session = sessionFactory.openSession()) {
	            return session.createQuery("from Employee e where e.salary > :min", Employee.class)
	                          .setParameter("min", minSalary)
	                          .list();
	        }
	    }

	    // Projection: only name and department
	    public List<Object[]> getNameAndDepartment() {
	        try (Session session = sessionFactory.openSession()) {
	            return session.createQuery("select e.name, e.department from Employee e", Object[].class)
	                          .list();
	        }
	    }
	    
}
