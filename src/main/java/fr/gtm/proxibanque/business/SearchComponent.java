/**
 * 
 * 
 */
package fr.gtm.proxibanque.business;

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
	
	private static Integer searchId = 0;

	private List<Client> foundClient;
	
	
	
	
	/**
	 * @return the idSearch
	 */
	public Integer getsearchId() {
		return searchId;
	}



	/**
	 * @param idSearch the idSearch to set
	 */
	public void setsearchId() {
		SearchComponent.searchId = searchId++;
	}




	public Integer search(String saisie) {
		Boolean result = false;
		Integer searchId = null;
		LOGGER.debug("COMPONENT : Bien reçu "+saisie);
		String[] arraySearch = saisie.split(" ");
		
		//verification de la première partie de la saisie
		if(this.dao.findByNom(arraySearch[0]) !=null || this.dao.findByPrenom(arraySearch[0]) != null){
			LOGGER.debug("COMPONENT : j'ai trouvé un client champs 1");
			result = true;
			
		}else if(this.dao.findByNom(arraySearch[1]) !=null || this.dao.findByPrenom(arraySearch[1]) != null) {
			LOGGER.debug("COMPONENT : j'ai trouvé un client champs 2");
			result = true;
		}
		
		if(result==true) {
			
			// TODO vérifier si incrémenté?
			this.setsearchId();
			searchId = this.getsearchId();
			LOGGER.debug("COMPONENT : result ok je défini l'id"+searchId);
		}
		
		return searchId;
	}
	
	
}

