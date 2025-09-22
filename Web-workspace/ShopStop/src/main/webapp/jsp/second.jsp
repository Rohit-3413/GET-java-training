<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Session Implicit Object</title>
</head>
<body>
<h1>Session Implicit Object</h1>
<%

String name = (String)session.getAttribute("user");
out.print("<h2>Hello "+name+"</h2>");

%>
</body>
</html>