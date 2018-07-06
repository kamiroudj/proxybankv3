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


	private static final Logger LOGGER = LoggerFactory.getLogger("fr.gtm.proxibanque");

	/**
	 * permet de stocker les components de recherche dans le cas d'un résultat
	 * positif de search() et pour une réutilisation des résultats stockés dans les
	 * components par les autres méthode du service.
	 */
	private Map<Integer, SearchComponent> searchCompoCollec = new HashMap<Integer, SearchComponent>();

	/**
	 * Permet d'utiliser le component search pour et de récupérer l'id de ce
	 * component et de le stocker dans une Map si une correspondance est trouvée.
	 * L'id retournée permet de retrouver le component et les resultats de recherche
	 * stocké à l'intérieur.
	 * 
	 * @param saisie
	 * @return
	 * @throws LoginException
	 */
	public Integer search(String saisie) {
		Integer searchId = null;
		SearchComponent myCompo = this.facto.getObject();

		// COMPONENT OK
		if (myCompo.search(saisie) != 0) {

			searchId = myCompo.search(saisie);

			this.searchCompoCollec.put(searchId, myCompo);

			LOGGER.debug("SERVICE : search component à renvoyé  id :" + searchId.toString() + "et ma collection est "
					+ searchCompoCollec.get(searchId));

		} else {
			// COMPONENT PAS OK = rien
			LOGGER.debug("SERVICE : component ne renvoi rien");
		}

		return searchId;

	}

	/**
	 * Permet de vérifier si la date de naissance saisie par l'utilisateur
	 * (verif-date.jsp) correspond à celle de l'un des clients trouvé et stocké par
	 * le componentSearch lors de la première étape (login.jsp).
	 * 
	 * @param date
	 * @param id
	 * @return
	 */
	public Integer verifierDate(LocalDate date, Integer id) {
		Integer idClient = null;

		LOGGER.debug("---------- Verifier date lancé et verifie la date " + date + " ----------");
		SearchComponent savedSearch = searchCompoCollec.get(id);

		// récupérer les clients
		for (Integer i = 0; i < savedSearch.getFoundClient().size(); i++) {
			LocalDate dateClient = savedSearch.getFoundClient().iterator().next().getDateNaissance();
			LOGGER.debug("--------je parcours les clients et j'ai trouvé la date" + dateClient);
			if (date.equals(dateClient)) {
				LOGGER.debug("--------date correspond je renvoi l'id----");
				idClient = savedSearch.getFoundClient().iterator().next().getId();
			}
		}

		LOGGER.debug("SERVICE : valeur id client = " + idClient);
		return idClient;
	}

}
