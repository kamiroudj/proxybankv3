/**
 * Class de service regroupant les méthodes permettant d'authentifier le client
 * lors de son accès au système
 */
package fr.gtm.proxibanque.business;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;





@Service
public class AuthentificationService {
	
	@Autowired
	private ObjectFactory<SearchComponent> facto;
	
	private Integer id;


	/*public Conseiller verifierLoginPassword(String login, String password) throws LoginException {
>>>>>>> a1fbc038db14de182674a0ec2e54e2a2feb78ec2

	/**
	 * Méthode permerttant de retrouver les utilisateurs correspondants à la saisie
	 * du nom ou du prenom de l'utilisateur.
	 * 
	 * @return Integer
	 * @param String saisie
	 *
	 */
	public Integer chercher(String saisie) throws LoginException {
		
		Integer searchId = null;
		
		//j'envoie le String de saisie à me composant
		
		//
		
		
		
		
		return searchId;
//		Conseiller conseiller = null;
//		if (login != null && password != null) {
//			// conseiller = dao.findByLogin(login);
//		}
//
//		if ((conseiller == null) || !conseiller.getPassword().equals(password))
//			throw new LoginException("Echec authentification Conseiller. Essayer à nouveau");
//
//		return conseiller;

	}

}
