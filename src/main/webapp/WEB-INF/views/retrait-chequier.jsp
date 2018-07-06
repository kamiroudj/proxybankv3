<%@ include file="head.jsp"%>
        <div class="row flex-center full-screen my-4">
            <div class="col-md-6">
                <!-- Card -->
                 <span>${erreur}</span>
                <div class="card">


                    <div class="card-body">
                        <form method="POST">
                                        <input type="hidden" name="idClient" value="${idClient}"/>
                            <p class="h4 text-bank-light text-center py-4">Retrait de chequier</p>

                            <label for="compte" class="font-weight-light">Choix du compte associé au chequier :</label>
                            <select class="form-control" id="compte" name="compte">
         				 		<c:forEach var="compte" items="${comptes}">
									<option value="${compte.id}">${compte.numCompte} - ${compte.libelle}  - solde :${compte.solde}</option>				
								</c:forEach>
                            </select>
                            
                            <div class="text-center py-4 mt-3">
                                <button class="btn btn-success" type="submit">Valider</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
            <%@ include file="action-user.jsp"%> 
        </div>
<%@ include file="footer.jsp"%> 