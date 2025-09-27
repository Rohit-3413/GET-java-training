<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello World</title>
</head>
<body style="font-family: Arial, sans-serif; 
			margin: 20px;background-color: #f9f9f9;">
			
	<h1>Hello World from Spring MVC App</h1>
	<hr>
	<p>This is a simple JSP page served by Served MVC.</p>
	
	<p>Current Date and Time: <strong><%= new java.util.Date() %></strong></p>
	<p>Server Info: <strong><%= application.getServerInfo() %></strong></p>
	<p>Java Version: <strong><%= System.getProperty("java.version") %></strong></p>
	<p>OS Name: <strong><%= System.getProperty("os.name") %></strong></p>
	<p>OS Version: <strong><%= System.getProperty("os.version") %></strong></p>
	<p>User Home Directory: <strong><%= System.getProperty("user.home") %></strong></p>
	
</body>
</html>