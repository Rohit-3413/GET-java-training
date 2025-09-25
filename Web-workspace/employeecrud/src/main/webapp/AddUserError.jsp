<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Error</title>
<style type="text/css">
.error-msg {
	width: 50%;
	margin: auto;
	padding: 10px 16px;
	background-color: pink;
	color: red;
	border: 1px solid #bfe9c9;
	border-radius: 6px;
	font-weight: 600;
	font-family: "Segoe UI", Roboto, Arial, sans-serif;
	box-shadow: 0 2px 6px rgba(11, 107, 58, 0.08);
	text-align: center;
}
</style>
</head>

<body>
	<p class="error-msg">Sorry !! Error Occurred</p>
	<jsp:include page="EmployeeForm.html"></jsp:include>
</body>
</html>