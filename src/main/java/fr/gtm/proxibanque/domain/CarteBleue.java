package fr.gtm.proxibanque.domain;

import java.time.LocalDate;

public class CarteBleue {

	private Integer id;
	private Integer nCompte;
	private String type;
	private LocalDate dateExpiration;

	public CarteBleue() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CarteBleue(Integer id, Integer nCompte, String type, LocalDate dateExpiration) {
		super();
		this.id = id;
		this.nCompte = nCompte;
		this.type = type;
		this.dateExpiration = dateExpiration;
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

	public LocalDate getDateExpiration() {
		return dateExpiration;
	}

	public void setDateExpiration(LocalDate dateExpiration) {
		this.dateExpiration = dateExpiration;
	}

}
