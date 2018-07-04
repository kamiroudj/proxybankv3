<%@ include file="head.jsp"%>

<body>
	<div class="container-fluid">
		<!-- div de CONNEXION -->
		<div class="row flex-center flex-column full-screen">
			<div class="card">

				<div class="card-header bg-white text-center text-white">
					<img src="img/proxybank.png" alt="" class="img-fluid mid-logo">
				</div>
				<div class="card-body">
					<form method="post"
					action="<c:url value="/auth.html" />">
						<span
						class="alert alert-danger" role="alert">${erreur}</span>
						<div class="form-group">
							<label for="login">Nom d'utilisateur</label> <input type="text"
								class="form-control" id="login" name="login"
								placeholder="Nom d'utilisateur" required>
						</div>
						<div class="form-group">
							<label for="password">Mot de passe</label> <input type="password"
								class="form-control" id="password" name="password"
								placeholder="Mot de passe" required>
						</div>
						<button type="submit" class="btn bg-bank">Connexion</button>
					</form>
				</div>
			</div>
		</div>
	</div>
	<!-- /fin de CONNEXION-->
	<!-- Footer -->
	<footer class="page-footer font-small blue">

		<!-- Copyright -->
		<div class="footer-copyright text-center py-3">© 2018 Copyright:
			KMAProduction</div>
		<!-- Copyright -->

	</footer>
	
<%@ include file="footer.jsp"%>	