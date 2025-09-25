<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee List</title>
<link rel="stylesheet" href="style/employee.css">
</head>
<body>


 <h1>Coforge Technologies</h1>
		<h2>Employee Details</h2>

<table>
  <tr>
    <th>Id</th>
    <th>Name</th>
    <th>Email</th>
    <th>Sex</th>
    <th>Country</th>
    <th>Edit</th>
    <th>Delete</th>
  </tr>

  <c:forEach items="${elist}" var="u">
    <tr>
      <td>${u.getId()}</td>
      <td>${u.getName()}</td>
      <td>${u.getEmail()}</td>
      <td>${u.getSex()}</td>
      <td>${u.getCountry()}</td>
      <td><a class="update-btn" href="UpdateEmployee.jsp?id=${u.getId()}">Update</a></td>
      <td><a class="delete-btn" href="DeleteEmployee.jsp?id=${u.getId()}" onclick="return confirm('Are you sure you want to delete this employee?')">Delete</a></td>
    </tr>
  </c:forEach>
</table>

<a href="AddEmployee.jsp" class="add-user-link">Add New User</a>
<a href="index.html" class="add-user-link">Home</a> 

</body>
</html>