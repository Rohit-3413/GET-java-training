<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My First JSP</title>
<style>
h1 {
	color: blue;
	text-align: center;
}

hr {
	color: red;
}

p {
	font-size: 20px;
	font-family: Arial, Helvetica, sans-serif;
	color: green;
	text-align: center;
}



.footer-style {
    background: yellow;
    color: white;
    padding: 15px;
    text-align: center;
}
</style>
</head>
<body style="background-color:aqua">

<h1>Hello World from JSP</h1>  <!--  static content -->
<hr>
<!--  Scriptlet used to generate Dynamic Content  -->
<%
	out.print("Hello from Java Scriptlet<br>");
	out.print("Your IP Address is : "+request.getRemoteAddr());
%>
<!--  JSP Expressions -->
<p><strong>Today's Date is : <%= new java.util.Date().toLocaleString() %></strong></p>
<p><strong>The Sum of 10 & 20 is : <%= 10 + 20 %></strong></p>
<p><strong>Today's Date is : <%= String.valueOf("hello jsp").toUpperCase() %></strong></p>

<div class ="footer-style">
<jsp:include page="footer.jsp"></jsp:include>  <!--  Include Directive  -->
</div>

</body>
</html>