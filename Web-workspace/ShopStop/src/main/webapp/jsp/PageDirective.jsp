<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import = "java.time.LocalDateTime"
    info ="Created by Rohit during JSP Training"
    buffer ="16kb"
    errorPage="MyErrorPage.jsp"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Page Directive Demo</title>
</head>
<body>
<h1> Page Directive Attributes Demo</h1>

<p>Today is : <%=LocalDateTime.now() %><p>
<p><%= 100/10 %><p>
<p><%= 100/5 %><p>

<p><%= getServletInfo() %><p>
<p>Buffer Size is : <%= pageContext.getResponse().getBufferSize() %> bytes</p>
<p>Character Encoding is : <%= pageContext.getResponse().getCharacterEncoding() %><p>
<p>Context Type is : <%= pageContext.getResponse().getContentType() %><p>

</body>
</html>