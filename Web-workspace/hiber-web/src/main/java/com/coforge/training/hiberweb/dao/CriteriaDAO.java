package com.coforge.training.hiberweb.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.coforge.training.hiberweb.model.Employee;

import jakarta.persistence.criteria.*;

/** 
 * Author	:Rohit.10.Gupta
 * Date		:Sep 26, 2025
 * Time		:10:51:18 AM
 * Project	:hiber-web
*/

public class CriteriaDAO {

	private static SessionFactory sessionFactory;

    static {
        Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
        cfg.addAnnotatedClass(Employee.class);
        sessionFactory = cfg.buildSessionFactory();
    }

    public void save(Employee emp) {
        try (Session session = sessionFactory.openSession()) {
            Transaction tx = session.beginTransaction();
            session.persist(emp);
            tx.commit();
        }
    }

    public List<Employee> getAll() {
        try (Session session = sessionFactory.openSession()) {
            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery<Employee> cq = cb.createQuery(Employee.class);
            Root<Employee> root = cq.from(Employee.class);
            cq.select(root);
            return session.createQuery(cq).getResultList();
        }
    }

    public List<Employee> getByDepartment(String dept) {
        try (Session session = sessionFactory.openSession()) {
            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery<Employee> cq = cb.createQuery(Employee.class);
            Root<Employee> root = cq.from(Employee.class);
            cq.select(root).where(cb.equal(root.get("department"), dept));
            return session.createQuery(cq).getResultList();
        }
    }

    public List<Employee> getByMinSalary(double minSalary) {
        try (Session session = sessionFactory.openSession()) {
            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery<Employee> cq = cb.createQuery(Employee.class);
            Root<Employee> root = cq.from(Employee.class);
            cq.select(root).where(cb.lt(root.get("salary"), minSalary));
            return session.createQuery(cq).getResultList();
        }
    }

    public List<Employee> getOrderedBySalaryDesc() {
        try (Session session = sessionFactory.openSession()) {
            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery<Employee> cq = cb.createQuery(Employee.class);
            Root<Employee> root = cq.from(Employee.class);
            cq.select(root).orderBy(cb.desc(root.get("salary")));
            return session.createQuery(cq).getResultList();
        }
    }

    public long getCount() {
        try (Session session = sessionFactory.openSession()) {
            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery<Long> cq = cb.createQuery(Long.class);
            Root<Employee> root = cq.from(Employee.class);
            cq.select(cb.count(root));
            return session.createQuery(cq).getSingleResult();
        }
    }

    public double getAverageSalary() {
        try (Session session = sessionFactory.openSession()) {
            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery<Double> cq = cb.createQuery(Double.class);
            Root<Employee> root = cq.from(Employee.class);
            cq.select(cb.avg(root.get("salary")));
            return session.createQuery(cq).getSingleResult();
        }
    }

}
