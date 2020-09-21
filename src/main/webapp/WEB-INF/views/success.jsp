<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success</title>
</head>
<body>
<center>
<h1 style="color:red;"> Registration Successfull</h1>
<h1>Welcome , ${name}</h1>
<h2>Your <span style="color:red;">email </span> is ${email} and <span style="color:red;">password</span> is ${password}</h2>
</center>
</body>
</html>