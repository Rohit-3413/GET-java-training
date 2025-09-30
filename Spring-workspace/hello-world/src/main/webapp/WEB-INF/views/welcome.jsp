<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello World</title>
<style>
body {
    font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
    background: linear-gradient(135deg, #74ebd5 0%, #ACB6E5 100%);
    margin: 0;
    padding: 0;
    display: flex;
    justify-content: center;
    align-items: center;
    height: 100vh;
}

.box {
    background: white;
    padding: 40px;
    width: 500px;
    border-radius: 20px;
    text-align: center;
    box-shadow: 0px 8px 20px rgba(0, 0, 0, 0.2);
    animation: fadeIn 1.2s ease-in-out;
}

h1 {
    color: #2c3e50;
    margin-bottom: 10px;
}

h3 {
    color: #34495e;
    font-weight: normal;
}

hr {
    border: none;
    border-top: 2px solid #ddd;
    margin: 20px 0;
}

h2 {
    color: #27ae60;
    margin: 15px 0;
}

p {
    font-size: 16px;
    color: #555;
}

b {
    color: #2980b9;
}

/* Smooth animation */
@keyframes fadeIn {
    from { opacity: 0; transform: scale(0.9); }
    to { opacity: 1; transform: scale(1); }
}

</style>
</head>
<body>
<div class="box">
	<h1>Spring Boot JSP View - Hello, World!</h1>
	<h3>Welcome to Spring Boot JSP Example</h3>
	<h2>${hello}</h2>
	<p>Created by <b>${name}</b> from ${city} , ${country}</p>
</div>
</body>
</html>