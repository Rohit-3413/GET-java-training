<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ page import="org.hibernate.Session,
                 org.hibernate.SessionFactory,
                 org.hibernate.boot.MetadataSources,
                 org.hibernate.boot.registry.StandardServiceRegistry,
                 org.hibernate.boot.registry.StandardServiceRegistryBuilder,
                 jakarta.persistence.criteria.CriteriaBuilder,
                 jakarta.persistence.criteria.CriteriaQuery,
                 jakarta.persistence.criteria.Root,
                 java.util.List,
                 com.coforge.training.hiberweb.model.Employee" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee List</title>
<link rel="stylesheet" href="style/viewemp.css">
</head>
<body>
<h1>Employee List</h1>
    <%
        // Hibernate 6 Configuration
        StandardServiceRegistry registry = null;
        SessionFactory sessionFactory = null;
        Session hibernateSession = null;
        List<Employee> employees = null;

        try {
            // Initialize the ServiceRegistry
            registry = new StandardServiceRegistryBuilder()
                        .configure("hibernate.cfg.xml") // Load configuration
                        .build();

            // Build the SessionFactory
            sessionFactory = new MetadataSources(registry)
                             .buildMetadata()
                             .getSessionFactoryBuilder()
                             .build();

            // Open a session and fetch Employee records
            hibernateSession = sessionFactory.openSession();

            // Using Criteria API
            CriteriaBuilder cb = hibernateSession.getCriteriaBuilder();
            CriteriaQuery<Employee> cq = cb.createQuery(Employee.class);
            Root<Employee> root = cq.from(Employee.class);

            cq.select(root); // Fetch all records
            employees = hibernateSession.createQuery(cq).getResultList();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (hibernateSession != null) hibernateSession.close();
            if (sessionFactory != null) sessionFactory.close();
            if (registry != null) StandardServiceRegistryBuilder.destroy(registry); // Destroy registry
        }
    %>
    <table>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Department</th>
            <th>Salary</th>
        </tr>
        <%
            if (employees != null && !employees.isEmpty()) {
                for (Employee emp : employees) {
        %>
        <tr>
            <td><%= emp.getId() %></td>
            <td><%= emp.getName() %></td>
            <td><%= emp.getDepartment() %></td>
            <td><%= emp.getSalary() %></td>
        </tr>
        <%
                }
            } else {
        %>
        <tr>
            <td colspan="4" style="text-align: center;">No employees found</td>
        </tr>
        <%
            }
        %>
    </table>
  <div class="button-container">
  <a href="employee.html" class="center-btn">Add Employee</a>
</div>
</body>
</html>