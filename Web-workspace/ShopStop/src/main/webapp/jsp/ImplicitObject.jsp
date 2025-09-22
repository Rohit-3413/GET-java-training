<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "java.time.LocalDateTime,java.util.*" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Implicit Objects</title>
</head>
<body>

<h2>JSP Implicit Objects</h2>
	<ul type="square">
		<li>Implicit Objects are the Java objects that the JSP Container
			makes available to developers in each page.</li>
		<li>JSP uses Java defined implicit objects to access the dynamic
			content of a Web page.</li>
		<li>JSP implicit objects are a set of classes, which are loaded
			by the Web container.</li>
		<li>Developers can call them directly without being explicitly
			declared.</li>
		<li>JSP Implicit Objects are also called pre-defined variables.</li>
	</ul>

	<hr>
	<ul>
		<li><strong>Input OutPut Objects</strong>
			<ol>
				<li>request</li>
				<li>response</li>
				<li>out</li>
			</ol></li>

		<li><strong>Scope Communication Objects</strong>
			<ol>
				<li>session</li>
				<li>application</li>
				<li>pageContext</li>
			</ol></li>

		<li><strong>Servlet Objects</strong>
			<ol>
				<li>page</li>
				<li>config</li>
			</ol></li>
		<li><strong>Error Object</strong>
			<ol>
				<li>exception</li>
			</ol></li>
	</ul>
	<hr>
	<%-- out object example --%>
	<strong>Current Time is</strong>:
	<%
	out.print(LocalDateTime.now());
	%><br>
	<br>

	<%-- request object example --%>
	<strong>Request User-Agent</strong>:
	<%=request.getHeader("User-Agent")%><br>
	<br>

	<strong>Request - locale example: </strong><%=request.getLocale().toString()%><br>
	<br>
	<%-- response object example --%>
	<%
	response.addCookie(new Cookie("Test", "Value"));
	%>


	<%-- application object --%>
	<strong>Application example - server info: </strong><%=application.getServerInfo()%><br>
	<br>

	<%-- session object example --%>
	<strong>User Session ID</strong>:<%=session.getId()%><br>
	<br>

	<%
	session.setAttribute("user", "James Gosling");
	%>
	<a href="second.jsp">Create User Session</a>
	<br>
	<br>

	<strong>Session example - creation time: </strong><%=new Date(session.getCreationTime())%><br>
	<br>

	<%-- pageContext object example --%>
	<%
	pageContext.setAttribute("Test", "Test Value");
	%>
	<strong>PageContext attribute</strong>: {Name="Test",Value="<%=pageContext.getAttribute("Test")%>"}
	<br>
	<br>

	<%-- page object example --%>
	<strong>Generated Servlet Name</strong>:<%=page.getClass().getName() %>
</body>
</html>