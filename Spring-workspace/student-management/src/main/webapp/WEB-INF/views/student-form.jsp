<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.coforge.training.studentsoft.model.Student" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Form</title>
<link rel="stylesheet" href="/studentsoft/resources/static/css/student.css">
</head>
<body>
<!-- "student-form" is used to Insert New Student & Update Student details  -->

	<h1 style="color:blue;text-align:center;">Spring University - Student Admission Form</h1>
	
	<h2> ${student.rollNo == 0 ? 'Add New Student' :'Edit Student Details'} </h2>
	
	<%
			Student student = (Student) request.getAttribute("student");
	%>
	<!--  if rollNo ==0 Insert Student , else Update Student -->
	<form action="<%= (student.getRollNo() == 0) ? "/studentsoft/students" : "/studentsoft/students/" + 
	  student.getRollNo() %>" method="post">
		 <table>
            <tr>
                <td>First Name:</td>
                <td><input type="text" name="firstName" value="${student.firstName}" required /></td>
            </tr>
            <tr>
                <td>Last Name:</td>
                <td><input type="text" name="lastName" value="${student.lastName}" required /></td>
            </tr>
            <tr>
                <td>Gender:</td>
                <td>
                    <input type="radio" name="gender" value="Male" ${student.gender == 'Male' ? 'checked' : ''} required /> Male
                    <input type="radio" name="gender" value="Female" ${student.gender == 'Female' ? 'checked' : ''} required /> Female
                </td>
            </tr>
            <tr>
                <td>Course:</td>
                <td><input type="text" name="course" value="${student.course}" required /></td>
            </tr>
            <tr>
                <td colspan="2">
                <input type="submit" value="${student.rollNo == 0 ? 'Save' :'Update'}">
               <a href="/studentsoft/">Cancel</a>
	 			</td>
            </tr>
        </table>
	</form>
</body>
</html>