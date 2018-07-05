

<div class=content >      
        <form method="post" id="authentification" action="<c:url value="/updateClient" />">
            <span><h3>Modification client</h3></span>
            <span class="alert alert-danger" role="alert">${erreur}</span>
            
            <div class="form-group">
            	<input type="hidden" name="id" value="${client.id}">
                <label for="InputNom">Nom</label>
                <input type="text" class="form-control" id="InputNom"  name="nom" value="${client.nom}">
            </div>
            <div class="form-group">
                <label for="InputPrenom">Prenom</label>
                <input type="text" class="form-control" id="InputPrenom" name="prenom" value="${client.prenom}">
            </div>
             <div class="form-group">
                <label for="InputAdresse">Adresse</label>
                <input type="text" class="form-control" id="InputAdresse" name="adresse" value="${client.adresse}">
            </div>
            <div class="form-group">
                <label for="InputTelephone">Telephone</label>
                <input type="text" class="form-control" id="InputTel" name="telephone" value="${client.telephone}">
            </div>
            <div class="form-group">
                <label for="InputEmail">Email</label>
                <input type="text" class="form-control" id="InputMail" name="email" value="${client.email}">
            </div>
            <button class="valForm">Valider</button>
        </form>

    </div>
</body>
</html>