/**
 * Class de service regroupant les méthodes permettant d'authentifier le client
 * lors de son accès au système
 */
package fr.gtm.proxibanque.business;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;





@Service
public class AuthentificationService {
	
	@Autowired
	private ObjectFactory<SearchComponent> facto;
	
	private static final Logger LOGGER = LoggerFactory.getLogger("fr.gtm.proxibanque");
	
	private Integer searchId;	
	
	/**
	 * @return the searchId
	 */
	public Integer getSearchId() {
		return searchId;
	}
	/**
	 * @param searchId the searchId to set
	 */
	public void setSearchId(Integer searchId) {
		this.searchId = searchId;
	}
	private Map<Integer, SearchComponent> searchCompoCollec;

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
		SearchComponent myCompo = this.facto.getObject();
		//j'envoie le String de saisie à mon composant
//		if(myCompo.search(saisie)==true) {
//			searchId = 2;
//		}
		
		//si je reçois un id depuis le component
		
		//si le component renvoi message d'erreur
		
		
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
	
	/**
	 * Permet d'utiliser le component search pour et de récupérer l'id de ce component
	 * si une correspondance est trouvée.
	 * @param saisie
	 * @return
	 * @throws LoginException
	 */
	public Integer search(String saisie) throws LoginException {
		Integer searchId = null;
		SearchComponent myCompo = this.facto.getObject();
		
		//COMPONENT OK
		if(myCompo.search(saisie)!=null) {
	
			searchId = myCompo.getsearchId();
			//je stocke l'id du composant pour le passer au controller
			this.setSearchId(searchId);
			//TODO je mets le component dans la collection
			//this.searchCompoCollec.put(myCompo.getsearchId(), myCompo);
			
			LOGGER.debug("SERVICE : search component à renvoyé  id :"+searchId.toString());
			
		}else {
			//COMPONENT PAS OK = rien 
			LOGGER.debug("SERVICE : component ne renvoi rien");
		}
		
		return searchId;
		
	}
	

}

