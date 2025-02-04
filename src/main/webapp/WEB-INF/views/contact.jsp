<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<title>Contact Page</title>
</head>
<body>
	<div class="container mt-5">
		<center>
			<h1>${Header}</h1>
			<p><h5>${Desc }</h5></p>
		</center>
		<form action="register" method="post">
			<div class="form-group">
				<label for="userEmail"><h6>User Email</h6></label> <input
					type="email" class="form-control" id="userEmail"
					aria-describedby="emailHelp" placeholder="User Email" name="uemail">
			</div>
			<div class="form-group">
				<label for="userName"><h6>User Name</h6></label> <input type="text"
					class="form-control" id="userName" aria-describedby="emailHelp"
					placeholder="User Name" name="uname">
			</div>
			<div class="form-group">
				<label for="userPassword"><h6>User Password</h6></label> <input
					type="password" class="form-control" id="userPassword"
					aria-describedby="emailHelp" placeholder="User Password"
					name="upassword">
			</div>
			<div class="container text-center">
				<button type="submit" class="btn btn-success">Sign Up</button>
			</div>
		</form>
	</div>
	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
</body>
</html>