<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cube of Number</title>
<style>
	body {
  font-family: Arial, sans-serif;
  background: linear-gradient(to right, #f8ffae, #43c6ac);
  margin: 0;
  padding: 0;
  display: flex;
  justify-content: center;
  align-items: center;
  min-height: 100vh;
}

.container {
  background: #fff;
  padding: 30px;
  border-radius: 12px;
  box-shadow: 0 4px 12px rgba(0,0,0,0.2);
  width: 600px;
  text-align: center;
}

h1 {
  color: #2c3e50;
  font-size: 28px;
  margin-bottom: 15px;
}

h2 {
  color: #007bff;
  font-size: 22px;
  margin-top: 20px;
  margin-bottom: 10px;
}

h3 {
  color: #333;
  font-size: 18px;
  margin: 10px 0;
}

hr {
  margin: 25px 0;
  border: none;
  border-top: 2px solid #ddd;
}

.result {
  font-weight: bold;
  color: #e74c3c;   /* red highlight */
  font-size: 20px;
  background: #fce4ec;
  padding: 5px 12px;
  border-radius: 6px;
  margin-left: 6px;
  display: inline-block;
}
	</style>
</head>
<body>
<div class = "container">
<h1>Java Bean Demo using Standard Action Tags</h1>
<h2>Cube of a Number</h2>

<!-- Cube cb1= new Cube() -->
<jsp:useBean id="cb1" scope="session" class="com.coforge.training.shopstop.bean.Cube"></jsp:useBean>

<jsp:setProperty property="num" name="cb1" value="2"/> <!--  cb1.setNum(5); -->

<h3> Cube of a Number 2 is : 
<span class="result"><jsp:getProperty property ="num" name="cb1"/> </span> <!--  cb1.getNum(); -->
</h3>
<hr>
<h2> Cube of a Number using another Bean Instance</h2>

<jsp:useBean id="cb2" scope="session" class="com.coforge.training.shopstop.bean.Cube"></jsp:useBean>

<jsp:setProperty property="num" name="cb2" value="10"/> <!--  cb2.setNum(10); -->

<h3> Cube of a Number 10 is : 
<span class="result"><jsp:getProperty property ="num" name="cb2"/> </span> <!--  cb2.getNum(); -->
</h3>

<hr>
	<h1>Access Java Bean Data using EL - Expression Language</h1>
	
	<h3>The Cube of 10 is : ${cb2.num}</h3>
	
	<hr>
	<h1>Use Java Bean in Scriptlets</h1>
	<%
		cb1.setNum(5);
	
		int c=cb1.getNum();
		
		out.println("The cube of 5 is : "+c);
	
	%>
	<hr>
</div>

</body>
</html>