<%@ include file="head.jsp" %>




<div class="row my-4">
            <div class="col-10 mx-auto">
                <h2>GESTION DES CLIENTS</h2>
                <table class="table">
                    <thead class="thead-light">
                        <tr>
                            <th scope="col">N°Client</th>
                            <th scope="col">Nom</th>
                            <th scope="col">Prenom</th>
                            <th scope="col">Adresse</th>
                            <th scope="col">Téléphone</th>
                            <th scope="col">Email</th>
                            <th scope="col">Actions</th>
                        </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="client" items="${clients}">
                        <tr>
                            <th scope="row">${client.id}</th>
							<td>${client.nom}</td>
							<td>${client.prenom}</td>
							<td>${client.adresse}</td>
							<td>${client.telephone}</td>
							<td>${client.email}</td>
                            <td>
                            	<!-- modifier client -->
                                <a href="<c:url value=" /edition-client?client="/>${client.id}" 
                                class="btn btn-warning">
                                <i class="fa fa-pencil" aria-hidden="true"></i> Editer
                                </a>
                                
                                <a href="<c:url value=" /liste-compte?client="/>${client.id}" 
                                class="btn btn-primary">
                                <i class="fa fa-list-ul" aria-hidden="true"></i> Liste des comptes
                                </a>
                                
                                <a href="<c:url value=" /delete-client?client="/>${client.id}" 
                                class="btn btn-primary">
                                <i class="fa fa-exchange" aria-hidden="true"></i> Virement
                                </a>
                                
                                <a href="<c:url value=" /delete-client?client="/>${client.id}" 
                                class="btn btn-danger">
                                <i class="fa fa-trash" aria-hidden="true"></i> Supprimer
                                </a>                               
                                                          
                            </td>
                        </tr>
                    </c:forEach>  
                   </tbody>
                </table>
            </div>
</div>

<%@ include file="footer.jsp" %>
						
									