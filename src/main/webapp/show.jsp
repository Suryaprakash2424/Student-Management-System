<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="com.techpalle.model.Student"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Show student details</title>
</head>
<body>
<h1>Student Details</h1>
<%
ArrayList<Student> al = (ArrayList<Student>) request.getAttribute("students");
%>
<table>
<tr>
<td>s.no</td>
<td>name</td>
<td>course</td>
<td>gender</td>
<td>email</td>
<td>education</td>
</tr>
<%
for(Student s : al)
{
%>
	<tr>
		<td><%= s.getSno()%></td>
		<td><%= s.getName()%></td>
		<td><%= s.getCourse()%></td>
		<td><%= s.getGender()%></td>
		<td><%= s.getEmail()%></td>
		<td><%= s.getEducation()%></td>
	</tr>
<%
}
%>
</table>
</body>
</html>