<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>forward Demo</title>
</head>
<body>
<jsp:forward page="print.jsp">
	<jsp:param value="101" name="empId"/>
	<jsp:param value="Rohit Gupta" name="empName"/>
	<jsp:param value="5000" name="salary"/>
	<jsp:param value="forwardDemo.jsp" name="requestCameFrom"/>
</jsp:forward>
</body>
</html>