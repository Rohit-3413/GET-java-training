<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Java Bean Demo</title>
</head>
<body>
<h1>Using Java Bean(Reusable Component) in JSP</h1>
<hr>

<jsp:useBean id="cust1" class="com.coforge.training.shopstop.bean.Customer"></jsp:useBean>

<jsp:setProperty name="cust1" property="customerId" value="101"/>
<jsp:setProperty name="cust1" property="firstName" value="James"/>
<jsp:setProperty name="cust1" property="lastName" value="Gosling"/>
<jsp:setProperty name="cust1" property="goldCustomer" value="true"/>

<h2>Customer Details:</h2>
<h4>Customer   Id: <jsp:getProperty property="customerId" name="cust1"/></h4>
<h4>Customer Name: <jsp:getProperty property="firstName" name="cust1"/>
<jsp:getProperty property="lastName" name="cust1"/></h4>
<h4>Gold Customer: <jsp:getProperty property="goldCustomer" name="cust1"/></h4>

<jsp:useBean id="cust2" class="com.coforge.training.shopstop.bean.Customer"></jsp:useBean>

<jsp:setProperty name="cust2" property="customerId" value="102"/>
<jsp:setProperty name="cust2" property="firstName" value="Rohit"/>
<jsp:setProperty name="cust2" property="lastName" value="Gupta"/>
<jsp:setProperty name="cust2" property="goldCustomer" value="true"/>

<hr>
<h4>Customer   Id: <jsp:getProperty property="customerId" name="cust2"/></h4>
<h4>Customer Name: <jsp:getProperty property="firstName" name="cust2"/>
<jsp:getProperty property="lastName" name="cust2"/></h4>
<h4>Gold Customer: <jsp:getProperty property="goldCustomer" name="cust2"/></h4>

</body>
</html>