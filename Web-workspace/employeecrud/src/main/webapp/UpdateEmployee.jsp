<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="com.coforge.training.empsoft.dao.EmployeeDAO"%>
<%@page import="com.coforge.training.empsoft.bean.Employee"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Employee Details</title>
<link rel="stylesheet" href="style/update.css">

</head>
<body>
	<%
	String id = request.getParameter("id");
	Employee u = EmployeeDAO.getRecordById(Integer.parseInt(id));
	%>
	<h1>Coforge Technologies</h1>
	<h2>Edit Employee Details</h2>
	<form action="UpdateServlet" method="post">
		<input type="hidden" name="id" value="<%=u.getId()%>" />
		<table>
			<tr>
				<td>Name:</td>
				<td><input type="text" name="name" value="<%=u.getName()%>" /></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="password"
					value="<%=u.getPassword()%>" /></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><input type="email" name="email" value="<%=u.getEmail()%>" /></td>
			</tr>
			<tr>
				<td>Sex:</td>
				<td><input type="radio" name="sex" value="male" />Male <input
					type="radio" name="sex" value="female" />Female</td>
			</tr>
			<tr>
				<td>Country:</td>
				<td><select name="country">
						<option>India</option>
						<option>Japan</option>
						<option>Germany</option>
						<option>USA</option>
						<option>Other</option>
				</select></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Edit Employee" /></td>
			</tr>
		</table>
	</form>
</body>
</html>