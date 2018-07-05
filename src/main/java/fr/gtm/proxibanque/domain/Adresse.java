package fr.gtm.proxibanque.domain;

public class Adresse {
	
	private Integer id;
	private String codePostal;
	private String ville;
	private String pays;
	private String lignePrincipale;
	private String ligneSecondaire;

	public Adresse() {
		super();
	}

	public Adresse(String codePostal, String ville, String pays, String lignePrincipale, String ligneSecondaire) {
		super();
		this.codePostal = codePostal;
		this.ville = ville;
		this.pays = pays;
		this.lignePrincipale = lignePrincipale;
		this.ligneSecondaire = ligneSecondaire;
	}

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public String getLignePrincipale() {
		return lignePrincipale;
	}

	public void setLignePrincipale(String lignePrincipale) {
		this.lignePrincipale = lignePrincipale;
	}

	public String getLigneSecondaire() {
		return ligneSecondaire;
	}

	public void setLigneSecondaire(String ligneSecondaire) {
		this.ligneSecondaire = ligneSecondaire;
	}

}
