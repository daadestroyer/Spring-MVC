<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>About Page</title>
</head>
<body>
<center>
<h1>About page</h1>
<%/*
String name = (String)request.getAttribute("name");
Integer age = (Integer)request.getAttribute("age");
LocalDateTime dt = (LocalDateTime)request.getAttribute("date");*/

%>

<h2>Hello , ${name} your age is ${age} %></h2>
<h2>Date and Time : ${date} </h2>
</center>
</body>
</html>