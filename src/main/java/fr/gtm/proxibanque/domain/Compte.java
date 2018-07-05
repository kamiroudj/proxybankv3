package fr.gtm.proxibanque.domain;
/**
 * Compte est la classe représentant un compte bancaire chez Proxibanque 
 * @author Mohammed, Kamir et Arnauld
 * @version 3.0
 */
import java.time.LocalDate;

public class Compte {
	private Integer id;
	private Integer nCompte;
	private String type;
	private LocalDate dateOuverture;
	private Double solde;
	private String libelle;
	private Chequier chequier;
	private CarteBleue carteBleue;

	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Compte(Integer id, Integer nCompte, String type, LocalDate dateOuverture, Double solde, String libelle,
			Chequier chequier, CarteBleue carteBleue) {
		super();
		this.id = id;
		this.nCompte = nCompte;
		this.type = type;
		this.dateOuverture = dateOuverture;
		this.solde = solde;
		this.libelle = libelle;
		this.chequier = chequier;
		this.carteBleue = carteBleue;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getnCompte() {
		return nCompte;
	}

	public void setnCompte(Integer nCompte) {
		this.nCompte = nCompte;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
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

}