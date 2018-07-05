package fr.gtm.proxibanque.domain;
/**
 * Client est la classe représentant un client de la banque Broxybanque.
 * @author 
 */
import java.time.LocalDate;
import java.util.List;

public class Client  {
	
	private Integer id;
	private Integer numClient;
	private String nom; 
	private String prenom; 
	private LocalDate dateNaissance; 
	private Adresse adresse;
	private List<Compte> comptes; 
	
	
	public Client() {
		super();
	}


	public Client(Integer numClient, String nom, String prenom, LocalDate dateNaissance, Adresse adresse) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.adresse = adresse;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}

	

	public Integer getNumClient() {
		return numClient;
	}


	public void setNumClient(Integer numClient) {
		this.numClient = numClient;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public LocalDate getDateNaissance() {
		return dateNaissance;
	}


	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}


	public Adresse getAdresse() {
		return adresse;
	}


	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}


	public List<Compte> getComptes() {
		return comptes;
	}


	public void setComptes(List<Compte> comptes) {
		this.comptes = comptes;
	}


	
	
}
