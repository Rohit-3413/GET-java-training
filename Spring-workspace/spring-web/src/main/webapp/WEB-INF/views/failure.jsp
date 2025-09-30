<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
    <title>Login Failed</title>
    <link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/style.css' />" />
</head>
<body>
<div class="container failure">
    <h2>Login Failed ❌</h2>
    <p>Invalid Username or Password. Try again!</p>
    <a href="login">Go Back</a>
</div>
</body>
</html>