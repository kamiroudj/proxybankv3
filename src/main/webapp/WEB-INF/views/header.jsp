<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<link rel="stylesheet" href="css/index.css">
<!-- <link rel="stylesheet" href="css/listeClients.css"> -->
<link rel="stylesheet" href="css/bootstrap.min.css">
<title>ProxibanqueV2</title>
</head>

<body style="background-color: gray">
	<div class=header>
		<nav class="navbar navbar-expand-lg navbar-light bg-dark">
			<div class="roundedImage"></div>
			<img id="logo" src="images/headerv2-logo.png" />
			<h1 style="color: white">ProxiBanque</h1>
			<div id="username">
				<a id="userStatut" href="#">${sessionScope.conseiller.nom}</a>
				<div id="disconect">


					<!-- TODO mettre le lien pour l'icone logout -->


					<a href="<c:url value='/logout'/>" ><img id="logout" src="images/logout-icon.png"
						alt="se déconnecter" title="se déconnecter" /></a>
				</div>
			</div>
		</nav>
	</div>
