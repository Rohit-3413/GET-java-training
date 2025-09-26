<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List,
    com.coforge.training.hiberweb.dao.UserDAO,
    com.coforge.training.hiberweb.model.User" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Users Skills List</title>
<link rel="stylesheet" type="text/css" href="style/skills1.css">
</head>
<body>
<%
    UserDAO dao = new UserDAO();
    List<User> users = dao.getAll();
%>
<h1>User List</h1>
<table border="1" cellpadding="8">
    <tr><th>ID</th><th>Name</th><th>Skills</th></tr>
    <% for(User u : users) { %>
    <tr>
        <td><%= u.getId() %></td>
        <td><%= u.getName() %></td>
        <td><%= (u.getSkills() != null && !u.getSkills().isEmpty()) 
                    ? String.join(", ", u.getSkills()) 
                    : "No Skills" %>
         </td>
    </tr>
    <% } %>
</table>
<a href="skills.html">Add Another User Skills</a>
</body>
</html>