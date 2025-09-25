<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ page import="java.util.List,
    com.coforge.training.hiberweb.dao.StudentDAO,
    com.coforge.training.hiberweb.model.Student" %>
    <%
    // Fetch all students from Hibernate DAO
    
    StudentDAO dao = new StudentDAO();
    List<Student> students = dao.getAll();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student List</title>
<style>
        /* Theme variables */
        :root {
          --primary: #2563eb;
          --primary-hover: #1d4ed8;
          --bg: #f9fafb;
          --text: #1f2937;
          --border: #e5e7eb;
          --card-bg: #ffffff;
          --shadow: 0 4px 12px rgba(0, 0, 0, 0.08);
        }

        body {
          font-family: "Segoe UI", Roboto, Arial, sans-serif;
          background: var(--bg);
          color: var(--text);
          padding: 2rem;
          display: flex;
          flex-direction: column;
          align-items: center;
        }

        h1 {
          font-size: 2rem;
          font-weight: 700;
          color: var(--primary);
          margin-bottom: 1.5rem;
          text-shadow: 1px 1px 2px rgba(37, 99, 235, 0.15);
        }

        table {
          width: 90%;
          max-width: 900px;
          border-collapse: collapse;
          background: var(--card-bg);
          box-shadow: var(--shadow);
          border-radius: 12px;
          overflow: hidden;
        }

        th {
          background: var(--primary);
          color: #fff;
          padding: 14px;
          text-align: left;
          font-weight: 600;
        }

        td {
          padding: 12px 14px;
          border-bottom: 1px solid var(--border);
        }

        tr:nth-child(even) td {
          background: #f3f4f6;
        }

        tr:hover td {
          background: #eef2ff;
          transition: background 0.25s ease;
        }

        /* Link styled as button */
        a.button {
          display: inline-block;
          margin-top: 1.5rem;
          padding: 10px 20px;
          background: var(--primary);
          color: #fff;
          text-decoration: none;
          font-weight: 600;
          border-radius: 8px;
          box-shadow: 0 4px 10px rgba(37, 99, 235, 0.25);
          transition: background 0.25s ease, transform 0.15s ease;
        }
        a.button:hover {
          background: var(--primary-hover);
          transform: translateY(-2px);
        }
        a.button:active {
          transform: translateY(0);
        }
    </style>
</head>
<body>
<h1>Student List</h1>
    <table>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Email</th>
            <th>Course</th>
        </tr>
        <% for(Student s : students) { %>
        <tr>
            <td><%= s.getId() %></td>
            <td><%= s.getName() %></td>
            <td><%= s.getEmail() %></td>
            <td><%= s.getCourse() %></td>
        </tr>
        <% } %>
    </table>

    <a href="index.jsp" class="button">Home</a>
</body>
</html>