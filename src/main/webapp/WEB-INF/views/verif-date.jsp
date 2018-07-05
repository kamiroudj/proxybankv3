<%@ include file="head.jsp"%>

	<div class="row flex-center flex-column full-screen">
            <div class="col-md-4 text-center">
                <form action="" method="post">
                    <h2>Bonjour <span class="text-bank-light">${saisie.name}</span> Veuillez saisir votre date de naissance</h2>
                    <div class="md-form active-pink active-pink-2 mb-3">
                        <input class="form-control" type="date" name="dateNaissance" placeholder="Veuillez saisir votre date de naissance">
                    </div>
                </form>
            </div>
        </div>
	
<%@ include file="footer.jsp"%>	