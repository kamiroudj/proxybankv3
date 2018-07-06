/**
 * Component permettant d'effectuer des recherches de clients et de stocker les clients trouvés en BDD
 * dans une liste.
 * 
 * @author Arnaud
 */
package fr.gtm.proxibanque.business;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import fr.gtm.proxibanque.dao.ClientRepository;
import fr.gtm.proxibanque.domain.Client;

public class SearchComponent {

	@Autowired
	private ClientRepository dao;

	private static final Logger LOGGER = LoggerFactory.getLogger("fr.gtm.proxibanque");

	/**
	 * Id en static qui s'incrémente à chaque fois que ce component est appelé par
	 * un service. Permet de le rappeler et d'accéder au client stockés par search()
	 */
	private static Integer compteurId = 0;

	/**
	 * Permet de stocker les clients trouvés par la méthode search()
	 */
	private List<Client> foundClient = new ArrayList<Client>();

	/**
	 * @return the foundClient
	 */
	public List<Client> getFoundClient() {
		return foundClient;
	}

	/**
	 * 
	 * @param foundClient
	 *            the foundClient to set
	 */
	public void setFoundClient(List<Client> foundClient) {
		this.foundClient = foundClient;
	}

	/**
	 * Méthode permettant de chercher un prenom ou un nom ou une association prenom
	 * nom à partir d'une saisie et de stocker les clients récupérés par cette
	 * requête.
	 * 
	 * Renvoi null si on a un resultat rien ou l'id de componentSearch.
	 * 
	 * 
	 * @param saisie La saisie 
	 * @return Integer
	 */
	public Integer search(String saisie) {
		Boolean result = false;
		Integer searchId = 0;
		LOGGER.debug("COMPONENT : Bien reçu " + saisie);
		// TODO test sur le contains de l'espace et ajout requete prenomAndNom

		if (saisie.contains(" ")) {
			String[] arraySearch = saisie.split(" ");

			// log pour vérifier le resulat split et de la requete
			LOGGER.debug("COMPONENT : La saisie comprend un espace ");
			LOGGER.debug("COMPONENT : array1search : " + arraySearch[0]);
			LOGGER.debug("COMPONENT : array1search : " + arraySearch[1]);
			LOGGER.debug(
					"COMPONENT : resultat : " + this.dao.findByPrenomAndNom(arraySearch[0], arraySearch[1]).getNom());

			if (this.dao.findByPrenomAndNom(arraySearch[0], arraySearch[1]) != null) {
				LOGGER.debug("COMPONENT : j'ai trouvé un client");
				foundClient.add(this.dao.findByPrenomAndNom(arraySearch[0], arraySearch[1]));
				result = true;
			}
		} else {
			LOGGER.debug("COMPONENT : La saisie comprend PAS d'espace ");
			if (this.dao.findByPrenomOrNom(saisie, saisie) != null) {
				foundClient.add(this.dao.findByPrenomOrNom(saisie, saisie));
				LOGGER.debug(
						"COMPONENT : J'ai inséré le client " + this.dao.findByPrenomOrNom(saisie, saisie).getNom());
				result = true;
			}
		}

		if (result == true) {
			searchId = SearchComponent.compteurId++;
			LOGGER.debug("COMPONENT : result ok je défini l'id " + searchId);
		}

		return searchId;
	}

}
