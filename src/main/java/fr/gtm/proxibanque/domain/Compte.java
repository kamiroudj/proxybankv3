package fr.gtm.proxibanque.domain;
/**
 * 
 * @author Adminl
 * classe Compte possède un solde ainsi qu'un identifiant unique "numeroCompte" un compte est associé à un client
 *
 */
public class Compte {
	
	private Double solde;
	private Integer id;
	private Client client;
	

	public Compte() {
		
	}

/**
 * 
 * @param solde contenu du compte, paramètre utilisé lors des opérations type virement.
 * @param numeroCompte identifiant unique permettant l'indexation du compte sans erreur.
 */
	public Compte(Double solde, Integer id) {
		
		this.solde = solde;
		this.id = id;
	}


	public Double getSolde() {
		return solde;
	}


	public void setSolde(Double solde) {
		this.solde = solde;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	
	
		
	

}
