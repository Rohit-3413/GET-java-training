<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Train Reservation</title>
<link rel="stylesheet" href="<c:url value='/resources/css/style.css'/>">
</head>

<body>
<div class="container">
	<h3>Railways Reservation Form</h3>
	<form:form action="submitForm" modelAttribute="reserve">  
        First name: <form:input path="firstName" />
		<br>
		<br>  
        Last name: <form:input path="lastName" />
		<br>
		<br>  
        Gender:   
        Male<form:radiobutton path="Gender" value="Male" />  
        Female<form:radiobutton path="Gender" value="Female" />
		<br>
		<br>  
        Meals:  
        BreakFast<form:checkbox path="Food" value="BreakFast" />  
        Lunch<form:checkbox path="Food" value="Lunch" />  
        Dinner<form:checkbox path="Food" value="Dinner" />
		<br>
		<br>  
        Leaving from: <form:select path="cityFrom">
			<form:option value="Bangalore" label="Bangalore" />
			<form:option value="Delhi" label="Delhi" />
			<form:option value="Chennai" label="Chennai" />
			<form:option value="Mumbai" label="Mumbai" />
		</form:select>
		<br>
		<br>  
        Going to: <form:select path="cityTo">
			<form:option value="Bangalore" label="Bangalore" />
			<form:option value="Delhi" label="Delhi" />
			<form:option value="Chennai" label="Chennai" />
			<form:option value="Mumbai" label="Mumbai" />
		</form:select>

		<br>
		<br>
		<input type="submit" value="Submit" />
	</form:form>
</div>
</body>
</html>