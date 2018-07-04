package fr.gtm.proxibanque.domain;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author ElSisi-Ussunet
 * Classe client hérite de 'Personne' identifié par un nom, prenom, adresse, tel, email chaque client a une liste de comptes.
 *
 */
public class Client extends Personne {
	
	private List<Compte> comptes = new ArrayList<Compte>();
	private Conseiller conseiller;
	
	
	/***************** constructeur *******************************************/
	
	public Client() {
		super();
	}

	
	/*********************** getters et setters *******************************/
	
	public Client(String nom, String prenom, String adresse, String telephone, String email) {
		super(nom, prenom, adresse, telephone, email);
	}


	public List<Compte> getComptes() {
		return comptes;
	}


	public void setComptes(List<Compte> comptes) {
		this.comptes = comptes;
	}


	public Conseiller getConseiller() {
		return conseiller;
	}


	public void setConseiller(Conseiller conseiller) {
		this.conseiller = conseiller;
	}
	
	

	
	
	
	
	
}
