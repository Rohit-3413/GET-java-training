<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Shop Stop</title>
</head>
<body>
	<h1>Welcome to Shop Stop- request Object Demo</h1>
	<font color="red"> <%
		String fname=request.getParameter("txtfirstname");
		String lname=request.getParameter("txtlastname");
		
		out.print("<strong>"+fname+" "+lname+"<strong>");
	%>
	</font>
</body>
</html>