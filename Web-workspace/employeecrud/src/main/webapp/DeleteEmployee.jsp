<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.coforge.training.empsoft.dao.EmployeeDAO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete Employee</title>
</head>
<body>

	<jsp:useBean id="emp"
		class="com.coforge.training.empsoft.bean.Employee" />
	<jsp:setProperty property="id" name="emp" />

	<%
    if (emp.getId() != 0) {   // check to avoid null
        EmployeeDAO.deleteEmployee(emp);
    }
    response.sendRedirect("ViewServlet");
%>
</body>
</html>