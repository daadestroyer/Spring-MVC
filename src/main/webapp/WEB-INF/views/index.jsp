<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<center>
		<%
			/*String name = (String) request.getAttribute("name");
		Integer age = (Integer) request.getAttribute("age");
		List<String> friends = (List<String>) request.getAttribute("friends");*/
		%>
		<h1>Home page</h1>
		<h2>
			<span style="color: red;">Welcome</span> , ${name} your age is ${age }
		</h2>
		<h2>
			Your friends are :
			<c:forEach var="item" items="${friends}">
				<!--
				<h3>${item }</h3>
				 or use this -->
				 
				<h3><c:out value="${item}"></c:out></h3>
			</c:forEach>

		</h2>
	</center>
</body>
</html>