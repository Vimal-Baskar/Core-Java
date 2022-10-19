<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Form</title>
</head>
<body>
	<form action="./registerUser" method="post">
		<label>Enter your Name</label>
		<input type="text" name="name">
		<br><br>
		<label>Enter your Email</label>
		<input type="email" name="email">
		<br><br>
		<label>Enter your Password</label>
		<input type="password" name="password">
		<br><br>
		<label>Confirm Password</label>
		<input type="password" name="confirm-password">
		<br><br>
		<button type="submit">Register</button>
	</form>
	<a href="./showSessions">Show current Sessions</a>
	<a href="./userError">Get a user defined Exception</a>
</body>
</html>