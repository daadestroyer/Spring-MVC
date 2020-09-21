<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success</title>
</head>
<body>
	<center>
		<h1>${Header}</h1>
		<p>
		<h3>${Desc }</h3>
		</p>

		<h1>Welcome , ${user.uname}</h1>
		<h2>
			Your <span style="color: red;">email </span> is ${user.uemail} and <span
				style="color: red;">password</span> is ${user.upassword}
		</h2>
	</center>
</body>
</html>