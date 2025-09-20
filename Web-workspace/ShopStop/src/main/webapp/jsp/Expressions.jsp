<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Java in JSP</title>
 <style>
        /* General body styling */
        body {
            font-family: 'Arial', sans-serif;
            background-color: #f0f8ff; /* Light Sky Blue */
            color: #333;
            text-align: center;
            padding: 30px;
            line-height: 1.6;
        }

        /* Main headings */
        h1 {
            color: #1e90ff;
            font-size: 2.2rem;
            margin-bottom: 20px;
            border-bottom: 2px solid #1e90ff;
            padding-bottom: 10px;
        }

        /* Secondary headings */
        h2 {
            color: #ff4500;
            font-size: 1.6rem;
            margin: 15px 0;
        }

        /* Smaller headings */
        h3 {
            color: #2e8b57;
            font-size: 1.4rem;
            margin: 10px 0;
        }

        /* Bold text */
        b {
            color: #8b0000;
        }

        /* Dynamic output / scriptlet lines */
        .out-text {
            background-color: #ffffe0; /* Light Yellow */
            padding: 6px 10px;
            margin: 5px 0;
            border-radius: 5px;
            display: inline-block;
        }

        /* Mathematical section styling */
        .math-section {
            background-color: #e6f2ff; /* Light Blue */
            padding: 15px;
            margin-top: 20px;
            border-radius: 10px;
            display: inline-block;
            text-align: left;
        }

        /* Line breaks for numbers output */
        .number-output {
            display: block;
            color: #4b0082; /* Indigo */
            font-weight: bold;
            margin: 2px 0;
        }
    </style>
    
    <%-- JSP Demo: Scriptlets, Expressions, Declarations & Static Content --%>

<%! 
    // Declaration tag example
    public long fact(long x) {
        if (x == 0) return 1;
        else return x * fact(x - 1);
    } 
%>
</head>
<body>
<h1>Dynamic Content Generation using Java in JSP - Demo</h1>

	<!-- Expressions -->
	<h2><%= "Welcome To JSP" %></h2>
	<h2>Arithmetic Expression :<%= 2 + 4 / 10 %></h2>

	<!-- Scriptlet with output -->
	<%
        int a = 20, b = 30, c = 10;
        out.println("<span class='out-text'>Sum of a+b+c = " + (a+b+c) + "</span>");
    %>

	<h2>
		The Addition of 3 Numbers is : <span class='out-text'><%= a+b+c %></span>
	</h2>

	<h3>
		The Current Time is : <span class='out-text'><%= java.time.LocalTime.now() %></span>
	</h3>

	<!-- Declaration method used -->
	<h3>
		The Factorial of 5 is : <span class='out-text'><%= fact(5) %></span>
	</h3>

	<h3>Display numbers from 1 to 10</h3>
	<%
        for (int i = 1; i <= 10; i++) {
            out.print("<span class='number-output'>" + i + " Rohit</span>");
        }
    %>

	<!-- Mathematical functions -->
	<h1>Mathematical Functions</h1>
	<div class="math-section">
		<b>Value of PI :</b> <span class='out-text'><%= Math.PI %></span><br />
		<b>Exponential Value of 10 :</b> <span class='out-text'><%= Math.exp(10) %></span><br />
		<b>Floor of 3.14 :</b> <span class='out-text'><%= Math.floor(3.14) %></span><br />
		<b>Ceil of 3.14 :</b> <span class='out-text'><%= Math.ceil(3.14) %></span><br />
		<b>Log 10 :</b> <span class='out-text'><%= Math.log(10) %></span><br />
		<b>Max of 10 and 11 :</b> <span class='out-text'><%= Math.max(10, 11) %></span><br />
		<b>Min of 10 and 11 :</b> <span class='out-text'><%= Math.min(10, 11) %></span><br />
	</div>
</body>
</html>