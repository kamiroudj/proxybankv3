package fr.gtm.proxibanque.domain;

import java.time.LocalDate;

/**
 * Compte est la classe représentant un compte bancaire chez Proxibanque
 * 
 * @author Mohammed, Kamir et Arnauld
 * @version 3.0
 */
public class CarteBleue {

	private Integer id;
	private Long numCarte;
	private String type;
	private LocalDate dateExpiration;

	public CarteBleue() {
		super();
	}

	/**
	 * Constructeur CarteBleue
	 * 
	 * @param numCarte
	 *            Le numéro de la carte Bleue.
	 * @param type
	 *            Le type de la carte bleue
	 * @param dateExpiration
	 *            La date d'expiration de la carte bancaire.
	 */
	public CarteBleue(Long numCarte, String type, LocalDate dateExpiration) {
		super();
		this.numCarte = numCarte;
		this.type = type;
		this.dateExpiration = dateExpiration;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Long getNumCarte() {
		return numCarte;
	}

	public void setNumCarte(Long numCarte) {
		this.numCarte = numCarte;
	}

	public String getType() {
		return TypeCarte.valueOf(type).name();
	}

	public void setType(String type) {
		this.type = TypeCarte.valueOf(type).name();
	}

	public LocalDate getDateExpiration() {
		return dateExpiration;
	}

	public void setDateExpiration(LocalDate dateExpiration) {
		this.dateExpiration = dateExpiration;
	}

}
