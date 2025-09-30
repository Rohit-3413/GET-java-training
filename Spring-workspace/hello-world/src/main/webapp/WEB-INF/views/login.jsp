<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
 <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #e6f2ff;
            text-align: center;
            margin-top: 100px;
        }
        .box {
            background: white;
            padding: 20px;
            width: 300px;
            margin: auto;
            border-radius: 10px;
            box-shadow: 0px 4px 8px rgba(0,0,0,0.2);
        }
        input {
            padding: 10px;
            margin: 8px;
            width: 90%;
        }
        .btn {
            background-color: #3498db;
            color: white;
            border: none;
            cursor: pointer;
            width: 100%;
            padding: 10px;
            border-radius: 5px;
        }
        .btn:hover {
            background-color: #2980b9;
        }
        .error {
            color: red;
        }
        </style>
</head>
<body>
 <div class="box">
        <h2>Login</h2>
        <form action="login" method="post">
            <input type="text" name="username" placeholder="Enter Username" required /><br/>
            <input type="password" name="password" placeholder="Enter Password" required /><br/>
            <button type="submit" class="btn">Login</button>
        </form>
        <p class="error">${error}</p>
    </div>
</body>
</html>