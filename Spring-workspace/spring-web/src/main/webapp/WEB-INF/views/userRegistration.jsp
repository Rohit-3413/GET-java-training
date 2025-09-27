<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Registration</title>
<link rel="stylesheet" href="<c:url value='/resources/css/style.css'/>">

</head>
<body>
<div class="container">
        <h2>User Registration</h2>
        <form:form method="post" modelAttribute="user" action="saveUser">
            <label>Name:</label>
            <form:input path="name"/>

            <label>Email:</label>
            <form:input path="email"/>

            <label>Password:</label>
            <form:password path="password"/>

            <label>Gender:</label>
            <form:radiobutton path="gender" value="Male"/> Male
            <form:radiobutton path="gender" value="Female"/> Female
            <br><br>

            <label>Country:</label>
            <form:select path="country">
                <form:option value="India" label="India"/>
                <form:option value="USA" label="USA"/>
                <form:option value="UK" label="UK"/>
            </form:select>

            <input type="submit" value="Register"/>
        </form:form>
    </div>
</body>
</html>