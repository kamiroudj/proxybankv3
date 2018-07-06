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



	public Integer search(String saisie) {
		Boolean result = false;
		LOGGER.debug("COMPONENT : Bien reçu "+saisie);
		// TODO test sur le contains de l'espace et ajout requete prenomAndNom
		String[] arraySearch = saisie.split(" ");
		
		//verification de la première partie de la saisie
		for(Integer i=0; i<arraySearch.length; i++) {
			if(this.dao.findByPrenomOrNom(arraySearch[i], arraySearch[i]) !=null){
				LOGGER.debug("COMPONENT : j'ai trouvé un client champs "+i);
				foundClient.add(this.dao.findByPrenomOrNom(arraySearch[i], arraySearch[i]));
				result = true;
			}
		}
		
		
		if(result==true) {
			SearchComponent.searchId++;
			LOGGER.debug("COMPONENT : result ok je défini l'id "+searchId);
		}
		
		
		return searchId;
	}
	
	
}

