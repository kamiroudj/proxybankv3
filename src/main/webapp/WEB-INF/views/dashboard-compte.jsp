<%@ include file="head.jsp"%>
        <div class="row flex-center full-screen my-4">
            <!-- LISTES DES COMPTES -->
            <div class="col-md-6">
                <h2 class="text-bank-light">GESTION DES CLIENTS</h2>
                <table class="table table-responsive w-auto">
                    <thead class="thead-light">
                        <tr>
                            <th scope="col">N°Compte</th>
                            <th scope="col">Libellé</th>
                            <th scope="col">Date d'ouverture</th>
                            <th scope="col">Solde</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="compte" items="${comptes}">
                            <tr>
                                <th scope="row">${compte.numCompte}</th>
                                <td>${compte.libelle}</td>
                                <td>${compte.dateOuverture}</td>
                                <td>${compte.solde}</td>
                                <!--<c:choose>
                                    <c:when test="${compte.getClass().getSimpleName() == 'CompteCourant'}">
                                        <td>${compte.CB}</td>
                                    </c:when>
                                    <c:otherwise>
                                        <td>--</td>
                                    </c:otherwise>
                                </c:choose>-->

                                <!--<c:choose>
                                    <c:when test="${compte.getClass().getSimpleName() == 'CompteEpargne'}">
                                        <td>${compte.chequier}</td>
                                    </c:when>
                                    <c:otherwise>
                                        <td>--</td>
                                    </c:otherwise>
                                </c:choose>-->
                                <!-- FIN A REVOIR -->
                           </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
            <!-- ACTIONS POSSIBLES -->
            <div class="col-md-4">
                <div class="list-group">
                    <h2 class="list-group-item bg-bank-light text-white">SERVICES</h2>
                    <a class="list-group-item waves-effect" href="<c:url value='/virement.html?id='/>${idClient}">Virement</a>
                    <a class="list-group-item waves-effect" href="<c:url value='/retraits/liquide.html?id='/>${idClient}" >Retirer de l'argent</a>
                    <a class="list-group-item waves-effect" href="<c:url value='/retraits/carte.html?id='/>${idClient}">Retrait CB</a>
                    <a class="list-group-item waves-effect" href="<c:url value='/retraits/chequier.html?id='/>${idClient}">Retrait Chequier</a>
                    <a class="list-group-item waves-effect" href="<c:url value='/'/>" >Se déconnecter</a>
                </div>
            </div>
        </div>
<%@ include file="footer.jsp"%> 