/**
 * Class de service regroupant les méthodes permettant d'authentifier le client
 * lors de son accès au système
 */
package fr.gtm.proxibanque.business;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import fr.gtm.proxibanque.dao.ClientRepository;





@Service
public class AuthentificationService {
	
	@Autowired
	private ObjectFactory<SearchComponent> facto;
	
	@Autowired
	private ClientRepository dao;
	
	private static final Logger LOGGER = LoggerFactory.getLogger("fr.gtm.proxibanque");
	
	private Map<Integer, SearchComponent> searchCompoCollec = new HashMap<Integer, SearchComponent>();

	
	/**
	 * Permet d'utiliser le component search pour et de récupérer l'id de ce component
	 * si une correspondance est trouvée.
	 * @param saisie
	 * @return
	 * @throws LoginException
	 */
	public Integer search(String saisie) {
		Integer searchId = null;
		SearchComponent myCompo = this.facto.getObject();
		
		//COMPONENT OK
		if(myCompo.search(saisie)!=0) {
	
			searchId = myCompo.getsearchId();
			
			this.searchCompoCollec.put(searchId, myCompo);
			
			LOGGER.debug("SERVICE : search component à renvoyé  id :"+searchId.toString() + "et ma collection est " + searchCompoCollec.get(searchId));
			
		}else {
			//COMPONENT PAS OK = rien 
			LOGGER.debug("SERVICE : component ne renvoi rien");
		}
		
		return searchId;
		
	}
	
	public Integer verifierDate(LocalDate date, Integer id) {
		Integer idClient = null;
		
		LOGGER.debug("---------- Verifier date lancé et verifie la date "+date+" ----------");
		SearchComponent savedSearch = searchCompoCollec.get(id);
		
		//récupérer les clients
		for(Integer i = 0; i<savedSearch.getFoundClient().size();i++) {
			LocalDate dateClient = savedSearch.getFoundClient().iterator().next().getDateNaissance();
			LOGGER.debug("--------je parcours les clients et j'ai trouvé la date"+ dateClient);
			if(date.equals(dateClient)) {
				LOGGER.debug("--------date correspond je renvoi l'id----");
				idClient = savedSearch.getFoundClient().iterator().next().getId();
			}
		}
		
		LOGGER.debug("SERVICE : valeur id client = "+idClient);
		return idClient;
	}

}

