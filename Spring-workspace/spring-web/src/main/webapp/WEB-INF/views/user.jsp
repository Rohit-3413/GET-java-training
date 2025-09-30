<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Info</title>
</head>
<body background="<c:url value="resources/images/bg1.webp"/>" />
<div align="center">
	<h1>Welcome to ${user} User Page</h1>

	<p>Page served on ${d}</p>

	<a href="spring">Click here for one more View</a>

</div>

</body>
</html>