<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert Student Details Here</title>
</head>
<body>
<h1>Insert Student Details</h1>
<form action="insertstudent" method="post" >
Enter Name : <input type="text" name="name" placeholder="Enter name"><br><br>
Enter Course : <input type="text" name="course" placeholder="Enter course"><br><br>
Enter Email : <input type="text" name="email" placeholder="Enter email"><br><br>
Select Gender : <input type="radio" name = "gender" value="male" >male
<input type="radio" name = "gender" value="female" >female
<input type="radio" name = "gender" value="others" >others<br><br>
Enter Education : <input type="text" name="education" placeholder="Enter education"><br><br>
<input type="submit" value="save student details" onclick="alert('Student Details inserted successfully');"><br><br>
</form>
<form action="return">
<input type="submit" value="go home" >
</form>
</body>
</html>