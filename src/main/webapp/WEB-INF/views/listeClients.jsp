<%@include file="header.jsp"%>


<div class="container"style=position:relative;top:5em>

	<div class="container-fluid">
					
		            <div class="widget-header">
               			 <h3>Liste des clients</h3>
            		</div>
		<table class="table table-bordered">
			<thead>
				<tr>
					<th scope="col">Numéro</th>
					<th scope="col">Nom</th>
					<th scope="col">Prénom</th>
					<th scope="col">Adresse</th>
					<th scope="col">Telephone</th>
					<th scope="col">email</th>
					<th scope="col">
						<div class="action">Actions</div> <!-- <div class="actions"><div><label>modifier</label></div><div><label >supprimer</label></div><div><label >les comptes</label></div></div> -->
					</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="client" items="${sessionScope.clients}">
					<tr>
						<th scope="row">${client.id}</th>
						<td>${client.nom}</td>
						<td>${client.prenom}</td>
						<td>${client.adresse}</td>
						<td>${client.telephone}</td>
						<td>${client.email}</td>
						<td>
							<nav class="navbar navbar-expand-sm navbar-light actions2">
								<div id="icones">
									<a href="<c:url value="/updateClient?idClient=${client.id}" />"
										alt="Modifier" title="Modifier"><img id="CRUDIcons"
										title="Modifier" alt="Modifier" src="images/update-icon.png"
										style="width: 24px" style=height:24px /></a>
								</div>
								<div id="icones">
									<a href="<c:url value='/deleteClient'/>" 
										title="Supprimer"><img id="CRUDIcons" title="Supprimer"
										alt="Supprimer" src="images/delete-icon.png"
										style="width: 24px" style=height:24px /></a>
								</div>
								<div id="icones">
									<a href="<c:url value="/comptes?idClient=${client.id}" />"  
										title="ListComptes"><img id="CRUDIcons"
										title="ListComptes" alt="ListComptes"
										src="images/list-icon.png" style="width: 24px"
										style=height:24px /></a>
								</div>
								<div id="icones">
									<a href="<c:url value="/virement?idClient=${client.id}" />"  
										title="virements"><img id="CRUDIcons"
										title="virements" alt="virements"
										src="images/virement-icon.png" style="width: 30px"
										style=height:30px /></a>
								</div>
							</nav>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</div>
</body>
</html>

						
									