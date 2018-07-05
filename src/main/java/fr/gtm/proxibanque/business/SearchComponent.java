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
	
	private Integer idSearch;
	
	private List<Client> foundClient;
	
	
	
	
	/**
	 * @return the idSearch
	 */
	public Integer getIdSearch() {
		return idSearch;
	}




	/**
	 * @param idSearch the idSearch to set
	 */
	public void setIdSearch(Integer idSearch) {
		this.idSearch = idSearch;
	}




	public Integer search(String saisie) {
		Boolean result = false;
		Integer searchId = null;
		LOGGER.debug("COMPONENT : Bien reçu "+saisie);
		String[] arraySearch = saisie.split(" ");
		
		//verification de la première partie de la saisie
		if(this.dao.findByNom(arraySearch[0]) !=null || this.dao.findByPrenom(arraySearch[0]) != null){
			LOGGER.debug("COMPONENT : j'ai trouvé un client");
			result = true;
		}
		
		return searchId;
	}
	
	
}

