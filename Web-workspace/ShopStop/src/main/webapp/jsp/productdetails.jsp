<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product Details</title>
<style type="text/css">
body {
	font-family: Arial, sans-serif;
	background: linear-gradient(to right, #ffecd2, #fcb69f);
	margin: 0;
	padding: 0;
	display: flex;
	justify-content: center;
	align-items: center;
	min-height: 100vh;
}

.container {
	background: #fff;
	padding: 30px 40px;
	border-radius: 12px;
	box-shadow: 0 4px 12px rgba(0, 0, 0, 0.2);
	width: 600px;
}

h1 {
	color: #2c3e50;
	text-align: center;
	margin-bottom: 15px;
}

h2 {
	color: #007bff;
	margin-top: 20px;
	border-bottom: 2px solid #ddd;
	padding-bottom: 5px;
}

h3 {
	color: #333;
	margin: 8px 0;
}

p {
	font-size: 16px;
	margin: 10px 0 20px;
	color: #444;
}

.result-box {
	background: #f9f9f9;
	border: 1px solid #ccc;
	padding: 12px;
	border-radius: 8px;
	margin-bottom: 20px;
}

span.value {
	font-weight: bold;
	color: #e74c3c; /* red highlight for values */
}
</style>
</head>
<body>
<div class="container">
		<h1>Product Details</h1>
		<hr>

		<jsp:useBean id="p1" class="com.coforge.training.shopstop.bean.Product"></jsp:useBean>
		<jsp:setProperty property="*" name="p1" />

		<p>You have entered the following Product Details:</p>

		<!-- Using Standard Action Tags -->
		<div class="result-box">
			<h2>
				Using &lt;jsp:getProperty&gt; Standard Action</h2>
			<h3>
				Product Id : <span class="value"><jsp:getProperty
						property="pId" name="p1" /></span>
			</h3>
			<h3>
				Product Name : <span class="value"><jsp:getProperty
						property="pName" name="p1" /></span>
			</h3>
			<h3>
				Product Price: <span class="value"><jsp:getProperty
						property="price" name="p1" /></span>
			</h3>
		</div>

		<hr>

		<!-- Using EL -->
		<h1>Access Java Bean Data using EL (Expression Language)</h1>
		<div class="result-box">
			<h2>Product Details</h2>
			<h3>
				Product Id : <span class="value">${p1.pId}</span>
			</h3>
			<h3>
				Product Name : <span class="value">${p1.pName}</span>
			</h3>
			<h3>
				Product Price: <span class="value">${p1.price}</span>
			</h3>
		</div>
	</div>

</body>
</html>