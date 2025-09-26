<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*,
    com.coforge.training.hiberweb.dao.CriteriaDAO,
    com.coforge.training.hiberweb.model.Employee" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
 <title>Criteria API methods</title>
<style>
        body { font-family: "Segoe UI", sans-serif; background: #f0fdf4; padding: 2rem; }
        h1 { text-align: center; color: #10b981; margin-bottom: 1.5rem; }
        h2 { color: #059669; margin-top: 2rem; }
        table { width: 90%; margin: auto; border-collapse: collapse; background: #fff;
                box-shadow: 0 4px 12px rgba(0,0,0,0.1); border-radius: 10px; overflow: hidden; }
        th { background: #10b981; color: #fff; padding: 12px; text-align: left; }
        td { padding: 10px; border-bottom: 1px solid #e5e7eb; }
        tr:nth-child(even) td { background: #f9fafb; }
        tr:hover td { background: #ecfdf5; }
        .section { margin: 2rem auto; width: 90%; }
    </style>
</head>
<body>
 <h1>Hibernate 6 Criteria API Demo</h1>

<%
    CriteriaDAO dao = new CriteriaDAO();

    List<Employee> allEmployees = dao.getAll();
    List<Employee> finEmployees = dao.getByDepartment("Finance");
    List<Employee> lowSalary = dao.getByMinSalary(50000.0);
    List<Employee> ordered = dao.getOrderedBySalaryDesc();
    long count = dao.getCount();
    double avgSalary = dao.getAverageSalary();
%>

<div class="section">
    <h2>All Employees</h2>
    <table>
        <tr><th>ID</th><th>Name</th><th>Department</th><th>Salary</th></tr>
        <% for(Employee e : allEmployees) { %>
        <tr>
            <td><%= e.getId() %></td>
            <td><%= e.getName() %></td>
            <td><%= e.getDepartment() %></td>
            <td><%= e.getSalary() %></td>
        </tr>
        <% } %>
    </table>
</div>

<div class="section">
    <h2>Employees in Finance Department</h2>
    <table>
        <tr><th>Name</th><th>Department</th></tr>
        <% for(Employee e : finEmployees) { %>
        <tr>
            <td><%= e.getName() %></td>
            <td><%= e.getDepartment() %></td>
        </tr>
        <% } %>
    </table>
</div>

<div class="section">
    <h2>Employees with Salary < 50,000</h2>
    <table>
        <tr><th>Name</th><th>Salary</th></tr>
        <% for(Employee e : lowSalary) { %>
        <tr>
            <td><%= e.getName() %></td>
            <td><%= e.getSalary() %></td>
        </tr>
        <% } %>
    </table>
</div>

<div class="section">
    <h2>Employees Ordered by Salary (Desc)</h2>
    <table>
        <tr><th>Name</th><th>Salary</th></tr>
        <% for(Employee e : ordered) { %>
        <tr>
            <td><%= e.getName() %></td>
            <td><%= e.getSalary() %></td>
        </tr>
        <% } %>
    </table>
</div>

<div class="section">
    <h2>Aggregates</h2>
    <p><strong>Total Employees:</strong> <%= count %></p>
    <p><strong>Average Salary:</strong> <%= avgSalary %></p>
</div>
</body>
</html>