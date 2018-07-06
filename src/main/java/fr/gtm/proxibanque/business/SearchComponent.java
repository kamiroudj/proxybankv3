/**
 * 
 * 
 */
package fr.gtm.proxibanque.business;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import fr.gtm.proxibanque.dao.ClientRepository;
import fr.gtm.proxibanque.domain.Client;

/**
 * @author Adminl
 *
 */
public class SearchComponent {
	
	@Autowired
	private ClientRepository dao;
	
	private static final Logger LOGGER = LoggerFactory.getLogger("fr.gtm.proxibanque");
	
	private static Integer searchId=0;

	private List<Client> foundClient = new ArrayList<Client>();
	
	
	
	
	/**
	 * @return the idSearch
	 */
	public Integer getsearchId() {
		return searchId;
	}



	/**
	 * @param idSearch the idSearch to set
	 */
	public void setsearchId(Integer searchId) {
		this.searchId = searchId;
	}



	/**
	 * @return the foundClient
	 */
	public List<Client> getFoundClient() {
		return foundClient;
	}



	/**
	 * @param foundClient the foundClient to set
	 */
	public void setFoundClient(List<Client> foundClient) {
		this.foundClient = foundClient;
	}


	/**
	 * Méthode permettant de chercher un prenom ou un nom ou une association prenom nom
	 * à partir d'une saisie et de stocker les clients récupérés par cette requête.
	 * 
	 * Renvoi null si on a un resultat rien ou l'id de componentSearch.
	 * 
	 * 
	 * @param saisie
	 * @return String
	 */
	public Integer search(String saisie) {
		Boolean result = false;
		LOGGER.debug("COMPONENT : Bien reçu "+saisie);
		// TODO test sur le contains de l'espace et ajout requete prenomAndNom
		
		if(saisie.contains(" ")) {
			LOGGER.debug("COMPONENT : La saisie comprend un espace ");
			String[] arraySearch = saisie.split(" ");
			LOGGER.debug("COMPONENT : array1search : "+arraySearch[0]);
			LOGGER.debug("COMPONENT : array1search : "+arraySearch[1]);
			LOGGER.debug("COMPONENT : resultat : "+this.dao.findByPrenomAndNom(arraySearch[0], arraySearch[1]).getNom());
			//verification de la première partie de la saisie
				if(this.dao.findByPrenomAndNom(arraySearch[0], arraySearch[1]) !=null){
					LOGGER.debug("COMPONENT : j'ai trouvé un client");
					foundClient.add(this.dao.findByPrenomAndNom(arraySearch[0], arraySearch[1]));
					result = true;
			}
		}else {
			if(this.dao.findByPrenomOrNom(saisie, saisie) !=null){
			LOGGER.debug("COMPONENT : La saisie comprend PAS d'espace ");
			foundClient.add(this.dao.findByPrenomOrNom(saisie, saisie));
			LOGGER.debug("COMPONENT : J'ai inséré le client " + this.dao.findByPrenomOrNom(saisie, saisie).getNom());
			result= true;
			}
		}
		
		
		if(result==true) {
			SearchComponent.searchId++;
			LOGGER.debug("COMPONENT : result ok je défini l'id "+searchId);
		}
		
		
		return searchId;
	}
	
	
}

