<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dashboard</title>
<style>
body {
	font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
	background: linear-gradient(120deg, #89f7fe 0%, #66a6ff 100%);
	margin: 0;
	padding: 0;
	display: flex;
	justify-content: center;
	align-items: center;
	height: 100vh;
}

.box {
	background: #ffffff;
	padding: 35px;
	width: 450px;
	border-radius: 15px;
	text-align: center;
	box-shadow: 0px 10px 25px rgba(0, 0, 0, 0.2);
	animation: slideIn 1s ease-out;
}

h1 {
	color: #2c3e50;
	margin-bottom: 10px;
	font-size: 26px;
}

h2 {
	color: #27ae60;
	margin: 15px 0;
	font-size: 22px;
}

p {
	font-size: 15px;
	color: #555;
	margin: 10px 0 20px;
}

hr {
	border: none;
	border-top: 2px solid #eee;
	margin: 15px 0;
}

/* Logout Button */
.btn {
	display: inline-block;
	background: #e74c3c;
	color: #fff;
	padding: 12px 25px;
	text-decoration: none;
	border-radius: 8px;
	font-weight: bold;
	transition: all 0.3s ease;
	box-shadow: 0px 4px 10px rgba(231, 76, 60, 0.3);
}

.btn:hover {
	background: #c0392b;
	box-shadow: 0px 6px 15px rgba(231, 76, 60, 0.5);
	transform: scale(1.05);
}

/* Smooth animation */
@
keyframes slideIn {from { opacity:0;
	transform: translateY(30px);
}

to {
	opacity: 1;
	transform: translateY(0);
}
}
</style>
</head>
<body>
<div class="box">
		<h1>${message}</h1>
		<hr>
		<h2>Welcome, ${user} 🎉</h2>
		<p>You are now logged in with session management at ${date}.</p>
		<a href="logout" class="btn">Logout</a>
	</div>
</body>
</html>