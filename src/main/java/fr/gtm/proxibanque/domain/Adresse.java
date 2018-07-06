package fr.gtm.proxibanque.domain;

/**
 * Adresse est la classe représentant l'adresse d'un client de la banque
 * Broxibanque.
 * 
 * @author Mohammed, Kamir et Arnauld.
 * @version 3.0.
 */
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

	/**
	 * Constructeur Adresse.
	 * 
	 * @param codePostal
	 *            Le code postal de la ville du client.
	 * @param ville
	 *            La ville où habite client.
	 * @param pays
	 *            Le pays du client.
	 * @param lignePrincipale
	 *            La ligne principale de l'adresse du client qui comprend le numéro
	 *            de la rue et son nom.
	 * @param ligneSecondaire
	 *            La ligne secondaire de l'adresse du client qui comprend des
	 *            informations supplémentaires sur l'adresse.
	 */
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
