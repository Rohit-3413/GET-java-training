<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<html>
<head>
    <title>Login Page</title>
    <link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/login.css' />" />
</head>
<body>
<div class="container">
    <h2>Login Form</h2>
    <form:form action="login" method="post" modelAttribute="user">
        <div class="form-group">
            <label>Username:</label>
            <form:input path="username" />
        </div>
        <div class="form-group">
            <label>Password:</label>
            <form:password path="password" />
        </div>
        <div class="form-group">
            <input type="submit" value="Login" class="btn"/>
        </div>
    </form:form>
</div>
</body>
</html>