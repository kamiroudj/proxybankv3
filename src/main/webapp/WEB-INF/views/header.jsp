<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<!-- utiliser HEAD.JSP avant ce fichier pour les import des ressources JS et CSS -->

<body>

	<!-- div de CONNEXION -->
	<div class="container-fluid">
		<header>
			<div class="row shadow">
				<div class="col-2 p-3">
					<img src="<c:url value="img/proxybank.png"/>" alt=""
						class="img-fluid mid-logo">
				</div>
				<div
					class="col-8 d-flex flex-column justify-content-center align-items-center">
					<h1 class="text-bank">Proxybank</h1>
					<a href="<c:url value="/liste-client"/>"><i
						class="fa fa-home text-bank fa-3x" aria-hidden="true"></i></a>
				</div>
				<!-- informations de la personne connéctée -->
				<div
					class="col-2  d-flex justify-content-center align-items-center flex-column">
					<span class="text-center">Conseiller connecté</span> <a href=""
						class="text-center">Se deconnecter</a>
				</div>
			</div>

		</header>