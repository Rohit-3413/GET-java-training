<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="com.coforge.training.hiberweb.dao.ManipulationDAO,
      com.coforge.training.hiberweb.model.Employee" %>
      <%
    String action = request.getParameter("action");
    String message = "";
    Employee updatedEmp = null;

    if ("update".equals(action)) {
        Long id = Long.parseLong(request.getParameter("id"));
        Double salary = Double.parseDouble(request.getParameter("salary"));
        ManipulationDAO dao = new ManipulationDAO();
        int rows = dao.updateSalaryById(id, salary);
        if (rows > 0) {
            message = "Employee salary updated successfully!";
            updatedEmp = dao.getById(id);   // fetch updated record
        } else {
            message = "No record found for update.";
        }
    } else if ("delete".equals(action)) {
        Long id = Long.parseLong(request.getParameter("id"));
        ManipulationDAO dao = new ManipulationDAO();
        int rows = dao.deleteById(id);
        message = rows > 0 ? "Employee deleted successfully!" : "No record found for deletion.";
    }
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Manage Employees</title>
<style>
        body { font-family: "Segoe UI", sans-serif; background: #f0fdf4; padding: 2rem; }
        h1 { text-align: center; color: #10b981; margin-bottom: 1.5rem; }
        form {
            background: #fff;
            width: 400px;
            margin: 1.5rem auto;
            padding: 1.5rem;
            border-radius: 10px;
            box-shadow: 0 4px 12px rgba(0,0,0,0.1);
        }
        label { display: block; margin-bottom: 0.5rem; font-weight: 600; }
        input[type="text"], input[type="number"] {
            width: 100%; padding: 10px; margin-bottom: 1rem;
            border: 1px solid #d1fae5; border-radius: 6px;
        }
        button {
            background: #10b981; color: #fff; border: none;
            padding: 10px 16px; border-radius: 6px;
            font-weight: bold; cursor: pointer;
            transition: background 0.2s ease;
        }
        button:hover { background: #059669; }
        .delete-btn { background: #ef4444; }
        .message { text-align: center; font-weight: bold; margin: 1rem; color: #059669; }
        table { width: 60%; margin: 2rem auto; border-collapse: collapse; background: #fff; }
        th { background: #10b981; color: #fff; padding: 10px; }
        td { padding: 8px; border-bottom: 1px solid #ddd; text-align: center; }
    </style>
</head>
<body>
 <h1>Manage Employee</h1>

    <% if (!message.isEmpty()) { %>
        <div class="message"><%= message %></div>
    <% } %>

    <!-- Update Form -->
    <form method="post" action="Manipulation.jsp">
        <input type="hidden" name="action" value="update">
        <label for="id">Employee ID</label>
        <input type="number" name="id" required>

        <label for="salary">New Salary</label>
        <input type="number" step="0.01" name="salary" required>

        <button type="submit">Update Salary</button>
    </form>

    <!-- Delete Form -->
    <form method="post" action="Manipulation.jsp">
        <input type="hidden" name="action" value="delete">
        <label for="id">Employee ID</label>
        <input type="number" name="id" required>

        <button type="submit" class="delete-btn">Delete Employee</button>
    </form>

    <% if (updatedEmp != null) { %>
        <h2 style="text-align:center; color:#059669;">Updated Employee Record</h2>
        <table>
            <tr><th>ID</th><th>Name</th><th>Department</th><th>Salary</th></tr>
            <tr>
                <td><%= updatedEmp.getId() %></td>
                <td><%= updatedEmp.getName() %></td>
                <td><%= updatedEmp.getDepartment() %></td>
                <td><%= updatedEmp.getSalary() %></td>
            </tr>
        </table>
    <% } %>
</body>
</html>