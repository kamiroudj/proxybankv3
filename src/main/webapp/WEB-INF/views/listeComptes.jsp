<%@ include file="head.jsp"%>
<%@ include file="header.jsp"%>

<div class="row my-4">
            <div class="col-10 mx-auto">
                <h2>GESTION DES CLIENTS</h2>
                <table class="table">
                    <thead class="thead-light">
                        <tr>
                            <th scope="col">N°Compte</th>
                            <th scope="col">Type de compte</th>
                            <th scope="col">Solde</th>
                            <th scope="col">Decouvert</th>
                            <th scope="col">Taux</th>
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

<%@ include file="header.jsp"%>