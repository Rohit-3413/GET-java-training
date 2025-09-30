<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Reservation Confirmed</title>
<link rel="stylesheet" href="<c:url value='/resources/css/style.css'/>">

</head>
<body>

	<h3>Your reservation is confirmed successfully.</h3>
	<p>Please, re-check the details.</p>
	First Name : ${reserve.firstName}
	<br> Last Name : ${reserve.lastName}
	<br> Gender: ${reserve.gender}
	<br> Meals:
	<ul>
		<c:forEach var="meal" items="${reserve.food}">
			<li>${meal}</li>
		</c:forEach>
	</ul>
	Leaving From : ${reserve.cityFrom}
	<br> Going To : ${reserve.cityTo}



</body>
</html>