<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer Details</title>
<style>
body {
	font-family: Arial, sans-serif;
	background: #f0f8ff;
	display: flex;
	justify-content: center;
	align-items: center;
	height: 100vh;
}

.details-container {
	background: #fff;
	padding: 25px;
	border-radius: 12px;
	box-shadow: 0 4px 12px rgba(0, 0, 0, 0.2);
	width: 450px;
}

h2 {
	text-align: center;
	color: #007bff;
}

h3 {
	margin-top: 20px;
	color: #444;
	border-bottom: 1px solid #ccc;
	padding-bottom: 5px;
}

p {
	font-size: 16px;
	margin: 10px 0;
	color: #333;
}

span {
	font-weight: bold;
}
</style>
</head>
<body>
	<div class="details-container">
		<h2>Customer Details</h2>

		<!-- ✅ Using EL -->
		<h3>Using EL (Expression Language):</h3>
		<p>
			<span>Name:</span> ${name}
		</p>
		<p>
			<span>Email:</span> ${email}
		</p>
		<p>
			<span>Phone:</span> ${phone}
		</p>
		<p>
			<span>Amount:</span> ${amount}
		</p>
		

		<!-- ✅ Using Expressions -->
		<h3>Using Expressions:</h3>
		<p>
			<span>Name:</span>
			<%= request.getAttribute("name") %></p>
		<p>
			<span>Email:</span>
			<%= request.getAttribute("email") %></p>
		<p>
			<span>Phone:</span>
			<%= request.getAttribute("phone") %></p>
	<p>
			<span>Amount:</span>
			<%= request.getAttribute("amount") %></p>
	
		<!-- ✅ Using Scriptlets -->
		<h3>Using Scriptlets:</h3>
		<%
		String name = (String) request.getAttribute("name");
		        String email = (String) request.getAttribute("email");
		        String phone = (String) request.getAttribute("phone");
		       Integer amount = (Integer) request.getAttribute("amount");
		%>
		<p>
			<span>Name:</span>
			<%= name %></p>
		<p>
			<span>Email:</span>
			<%= email %></p>
		<p>
			<span>Phone:</span>
			<%= phone %></p>
		<p>
			<span>Amount:</span>
			<%= amount %></p>
			

	</div>
</body>
</html>