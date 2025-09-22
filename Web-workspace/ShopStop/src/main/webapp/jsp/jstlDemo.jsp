<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib prefix="c" uri="jakarta.tags.core" %>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL & EL Demo</title>
</head>
<body>
<h1>JSTL (JSP Standard Tag Library)</h1>
	<p>The JSP Standard Tag Library (JSTL) represents a set of tags to
		simplify the JSP development.</p>

	<h2>Advantage of JSTL</h2>
	<ul>
		<li>Fast Development. JSTL provides many tags that simplify the
			JSP.</li>
		<li>Code Reusability We can use the JSTL tags on various pages.</li>
		<li>No need to use scriptlet tag. It avoids the use of scriptlet
			tag.</li>
	</ul>



	<h2>JSTL Tags</h2>
	<h3>Core Tags</h3>
	<p>The JSTL core tag provide variable support, URL management, flow
		control, etc. The URL for the core tag is
		http://java.sun.com/jsp/jstl/core. The prefix of core tag is c.</p>
	<hr>
	<h2>c:out Tag</h2>

	<c:out value="${'Welcome to JSTL' }"></c:out>

	<c:set var="sum" value="${100+50}" />

	<h3>
		The Sum of 100 & 50 is :
		<c:out value="${sum}"></c:out>
	</h3>

	<p>The Square of 5 is :${5*5}</p>

	<hr>
	<h1>If in Jstl</h1>

	<c:set var="income" value="${4000*4}" scope="session" />

	<c:if test="${income > 8000 }">
		<h5>
			My Income is :
			<c:out value="${income}" />
		</h5>
	</c:if>

	<hr>
	<h1>JSTL c:choose, c:when, c:otherwise,</h1>

	<c:set value="10" var="num"></c:set>
	<c:choose>
		<c:when test="${num%2==0}">
			<c:out value="${num} is even number"></c:out>
		</c:when>
		<c:otherwise>
			<c:out value="${num} is odd number"></c:out>
		</c:otherwise>
	</c:choose>
	<hr>
	<h1>Multiple Conditional Statements using c:when, c:otherwise,
		c:choose</h1>

	<c:set var="income" scope="session" value="${400*4}" />
	<p>
		Your income is :
		<c:out value="${income}" />
	</p>
	<c:choose>
		<c:when test="${income <= 1000}">  
       Income is not good.  
    </c:when>
		<c:when test="${income > 10000}">  
        Income is very good.  
    </c:when>
		<c:otherwise>  
       Income is undetermined...  
    </c:otherwise>
	</c:choose>
	<hr>
	<h1>foreach Iteration Tag in JSTL</h1>

	<c:forEach var="i" begin="1" end="10" step="1">
	JSTL <c:out value="${i}" />
		<p>
	</c:forEach>
	<hr>
		<h1>JSTL foreach with Array</h1>
	<c:set var="arr" value="${{'Java','JSP','Servlet','JSTL','EL'}}" />
	<c:forEach var="s" items="${arr}">
		<p>
			<c:out value="${s}" />
		</p>
		</c:forEach>
		<hr>
		
		<h1>Reverse For Loop</h1>
		<c:forEach var="i" begin="1" end="10" step="1">
		<p>
			<c:out value="${11-i}" />
		</p>
		</c:forEach>
	
	
</body>
</html>