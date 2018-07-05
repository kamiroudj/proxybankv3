package fr.gtm.proxibanque.domain;

import java.time.LocalDate;

public class CarteBleue {

	private Integer id;
	private Integer numCarte;
	private String type;
	private LocalDate dateExpiration;

	public CarteBleue() {
		super();
	}

	public CarteBleue(Integer id, Integer numCarte, String type, LocalDate dateExpiration) {
		super();
		this.id = id;
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

	public Integer getNumCarte() {
		return numCarte;
	}

	public void setNumCarte(Integer numCarte) {
		this.numCarte = numCarte;
	}

	public String getType() {
		return TypeCarte.valueOf(type).name();
	}

	public void setType(TypeCarte type) {
		this.type = type.name();
	}

	public LocalDate getDateExpiration() {
		return dateExpiration;
	}

	public void setDateExpiration(LocalDate dateExpiration) {
		this.dateExpiration = dateExpiration;
	}

}
