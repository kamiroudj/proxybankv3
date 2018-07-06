package fr.gtm.proxibanque.dao;


import org.springframework.data.jpa.repository.JpaRepository;


import fr.gtm.proxibanque.domain.Client;

public interface ClientRepository extends JpaRepository<Client, Integer> {

	/**
	 * Recupère un client à partir de son Nom OU de son Prenom
	 * 
	 * @param prenom
	 * @param nom
	 * @return Client
	 */
	public Client findByPrenomOrNom(String prenom, String nom);

	/**
	 * Recupère un client à partir de son Nom ET de son Prenom
	 * 
	 * @param prenom
	 * @param nom
	 * @return Client
	 */
	public Client findByPrenomAndNom(String prenom, String nom);
}
