<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	<form action="LoginController" method="POST">
		User: <input type="text" name="user_name"/>
		<br/>
		<br/>
		Pass: <input type="text" name="pass_word"/>
		<br/>
		<br/>
		<input type="submit" value="Login"/>
	</form>
</body>
</html>