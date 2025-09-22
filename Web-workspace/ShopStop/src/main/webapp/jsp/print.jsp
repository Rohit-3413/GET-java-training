<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Forwarded Page</title>
</head>
<body>
<h1>Forwarded Page with Parameters</h1>
<h2>Usage of Standard Action Tags &lt;jsp:forward&gt;, &lt;jsp:param&gt; , &lt;jsp:include&gt; Tags</h2>
<hr color="red">
<h3>
	Employee Id        : <%= request.getParameter("empId") %> <br>
	Employee Name      : <%= request.getParameter("empName") %><br>
	Employee Salary    : <%= request.getParameter("salary") %><br>
	Request Came from  : <%= request.getParameter("requestCameFrom") %><br>

</h3>

<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>