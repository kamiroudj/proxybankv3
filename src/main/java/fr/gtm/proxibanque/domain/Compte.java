package fr.gtm.proxibanque.domain;

/**
 * Compte est la classe représentant un compte bancaire chez Proxibanque 

 * @author Mohammed, Kamir et Arnauld
 * @version 3.0
 */
import java.time.LocalDate;

public class Compte {
	
	private Integer id;
	private Integer numCompte;
	private LocalDate dateOuverture;
	private Double solde;
	private String libelle;
	private Chequier chequier;
	private CarteBleue carteBleue;
	private Client client;

	public Compte() {
		super();
	}

	/**
	 * Compte constructeur.
	 * 
	 * @param numCompte
	 *            Le numéro de compte
	 * @param dateOuverture
	 *            La date d'ouverture du compte bancaire.
	 * @param solde
	 *            Le solde du compte.
	 * @param libelle
	 *            Le libelle.
	 */
	public Compte(Integer numCompte, LocalDate dateOuverture, Double solde, String libelle) {
		super();
		this.numCompte = numCompte;
		this.dateOuverture = dateOuverture;
		this.solde = solde;
		this.libelle = libelle;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNumCompte() {
		return numCompte;
	}

	public void setNumCompte(Integer numCompte) {
		this.numCompte = numCompte;
	}

	public String getLibelle() {
		return TypeCompte.valueOf(this.libelle).name();
	}

	public void setLibelle(TypeCompte type) {
		this.libelle = type.name();
	}

	public LocalDate getDateOuverture() {
		return dateOuverture;
	}

	public void setDateOuverture(LocalDate dateOuverture) {
		this.dateOuverture = dateOuverture;
	}

	public Double getSolde() {
		return solde;
	}

	public void setSolde(Double solde) {
		this.solde = solde;
	}

	public Chequier getChequier() {
		return chequier;
	}

	public void setChequier(Chequier chequier) {
		this.chequier = chequier;
	}

	public CarteBleue getCarteBleue() {
		return carteBleue;
	}

	public void setCarteBleue(CarteBleue carteBleue) {
		this.carteBleue = carteBleue;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	

}