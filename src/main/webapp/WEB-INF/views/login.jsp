<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<link rel="stylesheet" href="<%= request.getContextPath() %>/css/index.css">
<link rel="stylesheet" href="<%= request.getContextPath() %>/css/bootstrap.min.css">
<title>Document</title>
</head>

<body style="background-color: gray">

	<div class=header>
		<nav class="navbar navbar-expand-lg navbar-light bg-dark">
						<div class="roundedImage"></div>
			<img id="logo" src="<%= request.getContextPath() %>/images/headerv2-logo.png" />
			<h1 style="color: white">ProxiBanque</h1>
		</nav>
	</div>
	
	
	<div class=content>
		<form id="authentification" method="post"
			action="<c:url value="/auth.html" />">
			<span><h3>Authentification</h3></span> <span
				class="alert alert-danger" role="alert">${erreur}</span>
			<div class="form-group">
				<label for="InputLogin">User Id</label> <input type="userId"
					class="form-control" id="InputId" placeholder="Enter User Id"
					name="login" required>
			</div>
			<div class="form-group">
				<label for="InputPassword">Password</label> <input type="password"
					class="form-control" id="InputPassword" placeholder="Password"
					required name="password">
			</div>
			<button class="valForm">Valider</button>
		</form>

	</div>
	<div class=footer>
		<h6>&copy; GTM-ingénierie Projects -- Contact :
			ProxiBanque.elsisiussu@gmail.com</h6>
	</div>
</body>
</html>