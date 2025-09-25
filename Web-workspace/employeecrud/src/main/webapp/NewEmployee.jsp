<%@page import="com.coforge.training.empsoft.dao.EmployeeDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add New Employee</title>
</head>
<body>
	<jsp:useBean id="emp" class="com.coforge.training.empsoft.bean.Employee"></jsp:useBean>
	<jsp:setProperty property="*" name="emp"/>
	
	<%
		int i = EmployeeDAO.save(emp);
	if(i>0)
	{
		response.sendRedirect("AddUserSuccess.jsp");
	}
	else {response.sendRedirect("AddUserError.jsp");}
	
	%>
</body>
</html>