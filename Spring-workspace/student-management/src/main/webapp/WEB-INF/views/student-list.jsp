<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.coforge.training.studentsoft.model.Student" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Graphic Era Hill University - Student List</title>
<link rel="stylesheet" href="/studentsoft/resources/static/css/student.css">
</head>
<body>
<h2>Spring University - Student List</h2>
	<hr>
	<table>
		<thead>
			<tr>
				<th>Roll Number</th>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Gender</th>
				<th>Course</th>
				<th>Actions</th>
			</tr>
		</thead>
		<tbody>
<!-- Java Scriptlet for inserting Java Code in JSP for Dynamic Content -->
		<% 
    List<Student> studentList = (List<Student>) request.getAttribute("stud");
    for (Student s : studentList) {
%>
    <tr>
        <td><%= s.getRollNo() %></td> <!-- Expression Tag -->
        <td><%= s.getFirstName() %></td>
        <td><%= s.getLastName() %></td>
        <td><%= s.getGender() %></td>
        <td><%= s.getCourse() %></td>
        <td>
        <a href="/studentsoft/edit/<%=s.getRollNo()%>">Update</a> <!-- /studentsoft/edit/1007 -->
        <a href="/studentsoft/delete/<%=s.getRollNo()%>">Delete</a> <!-- /studentsoft/delete/1007 -->
        </td>
    </tr>
<% 
    } 
%>	
		</tbody>
	</table>
	<a href="/studentsoft/new">Add New Student</a>	&nbsp;&nbsp;&nbsp;
	<a href="/studentsoft/">Home page</a>
</body>
</html>