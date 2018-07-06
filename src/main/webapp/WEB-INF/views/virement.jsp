<%@ include file="head.jsp"%>
        <div class="row flex-center full-screen my-4">
            <div class="col-md-6">
                <!-- Card -->
                  <span>${erreur}</span>
                <div class="card">


                    <div class="card-body">
                        <form method="POST">
                       	 	<input type="hidden" name="idClient" value="${idClient}"/>
                            <p class="h4 text-bank-light text-center py-4">Virement</p>

                            <label for="compteDebit" class="font-weight-light">Choix du compte à débiter :</label>
                            <select class="form-control" id="compteDebit" name="compteDebit">
                           		<c:forEach var="compte" items="${comptes}">
									<option value="${compte.id}">${compte.numCompte} -- ${compte.libelle} -- solde: ${compte.solde}</option>
								 </c:forEach>
                            </select>

                            <label for="compteDebit" class="font-weight-light">Choix du compte à créditer :</label>
                            <select class="form-control" id="compteCredit" name="compteCredit">
                		<c:forEach var="compte" items="${comptes}">
									<option value="${compte.id}">${compte.numCompte} -- ${compte.libelle} -- solde: ${compte.solde}</option>
								 </c:forEach>
                            </select>


                            <div class="md-form">
                                <i class="fa fa-euro prefix grey-text"></i>
                                <input type="number" id="montant" class="form-control" name="montant" required>
                                <label for="montant" class="font-weight-light">Montant maximum de retrait 900 euros</label>
                            </div>

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