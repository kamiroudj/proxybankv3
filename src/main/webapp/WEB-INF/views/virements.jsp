<%@include file="header1.jsp"%>

<div class="container"
	style="position: relative; top: 5em; background-color: null">

	<div class="container-fluid">
		<a href="<c:url value='/listClient' />"><input type="button"
			value="Retour liste clients"></a>
		<div class="virementBloc">
			<div class="widget-header">
				<h3>Effectuer un virement</h3>
			</div>

	 <span class="alert alert-danger" role="alert">${erreur}</span>
		<form  method="post" action="<c:url value="/virement" />">
		<input type="hidden" name="idClient" value="${param.idClient}"/>
			<div class=form-group>
				<h4>Compte à débiter :</h4>
				<select id="compteCredit" name="select1" class="form-control">
					<c:forEach var="compte" items="${comptes}">
					<option value="${compte.numeroCompte}">${compte.numeroCompte}     ${compte.getClass().getSimpleName()} </option>
					</c:forEach>
				</select>
			</div>
			<div class=form-group>
				<h4>Compte à créditer :</h4>
				<select id="compteDebit" name="select2" class="form-control">
					<c:forEach var="compte" items="${comptes2}">
					<option value="${compte.numeroCompte}">${compte.numeroCompte}     ${compte.getClass().getSimpleName()}</option>
					</c:forEach>
				</select>						
			</div>
			<div class=form-group>
				<h4>Montant :</h4>
				<input class="form-control" type="text" placeholder="Montant à verser" name="montant"s>
			</div>
			<button class="valForm">Valider</button>
		</form>


		</div>
	</div>
</div>

</body>
</html>