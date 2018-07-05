<%@ include file="head.jsp"%>
        <div class="row flex-center full-screen my-4">
            <div class="col-md-6">
                <!-- Card -->
                <div class="card">
                    <div class="card-body">
                        <form method="POST">
                        
                            <p class="h4 text-bank-light text-center py-4">Retrait</p>

                            <label for="compte" class="font-weight-light">Choix du compte à  débiter :</label>
                            <select class="form-control" id="exampleFormControlSelect1" name="compteDebit">
                                <option value="${compte1}">Compte 1</option>
                                <option value="${compte2}">Compte 2</option>
                            </select>

                            <div class="md-form">
                                <i class="fa fa-euro prefix grey-text"></i>
                                <input type="text" id="montant" class="form-control" name="montant" required>
                                <label for="montant" class="font-weight-light">Montant maximum 300â‚¬</label>
                            </div>

                            <div class="text-center py-4 mt-3">
                                <button class="btn btn-success" type="submit">Valider</button>
                            </div>
                            
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
<%@ include file="footer.jsp"%>   