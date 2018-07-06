package fr.gtm.proxibanque.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.gtm.proxibanque.domain.Client;

/**
 * est l'interface permettant d'effectuer des requêtes en BDD sur cette entité.
 * 
 * @author Mohammed, Kamir et Arnauld.
 * @version 3.0.
 */
public interface ClientRepository extends JpaRepository<Client, Integer> {

	/**
	 * Recupère un client à partir de son Nom OU de son Prenom
	 * 
	 * @param prenom
	 *            Le prénom du client.
	 * @param nom
	 *            Le nom du client.
	 * @return Le client.
	 */
	public Client findByPrenomOrNom(String prenom, String nom);

	/**
	 * Recupère un client à partir de son Nom ET de son Prenom
	 * 
	 * @param prenom
	 *            Le prénom
	 * @param nom
	 *            Le nom
	 * @return Le client.
	 */
	public Client findByPrenomAndNom(String prenom, String nom);
}
