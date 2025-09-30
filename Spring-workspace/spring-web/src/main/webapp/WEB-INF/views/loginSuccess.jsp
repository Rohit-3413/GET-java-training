<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
    <title>Login Success</title>
    <link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/login.css' />" />
</head>
<body>
<div class="container success">
    <h2>Welcome, ${username}!</h2>
    <p>Login Successful ✅</p>
</div>
</body>
</html>