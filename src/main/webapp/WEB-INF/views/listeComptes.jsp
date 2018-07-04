<%@ include file="header1.jsp"%>

<div class="container">

<div ><a href="<c:url value="/listClient" />"><input type =" button" value="Retour à la liste des clients"></a></div>
	<div class="container-fluid">
	
		<div class="widget-header">
			<h3>Liste des comptes</h3>
		</div>
		
		<table class="table table-bordered">
			<thead>
				<tr>
					<th scope="col">Numéro du compte</th>
					<th scope="col">type Compte</th>
					<th scope="col">solde</th>
					<th scope="col">decouvert</th>
					<th scope="col">taux</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="compte" items="${comptes}">
					<tr>

						<th scope="row">${compte.numeroCompte}</th>
						<td>${compte.getClass().getSimpleName()}</td>
						<td>${compte.solde}</td>
						
						
						<c:choose>
  							<c:when test="${compte.getClass().getSimpleName() == 'CompteCourant'}">
    						<td>${compte.decouvert}</td>
  						</c:when>
  						<c:otherwise>
    						<td>--</td>
  						</c:otherwise>
						</c:choose>
						
						<c:choose>
  							<c:when test="${compte.getClass().getSimpleName() == 'CompteEpargne'}">
    						<td>${compte.taux}</td>
  						</c:when>
  						<c:otherwise>
    						<td>--</td>
  						</c:otherwise>
						</c:choose>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		</div>
	</div>
</body>
</html>