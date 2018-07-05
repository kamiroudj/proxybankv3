package fr.gtm.proxibanque.domain;
/**
 * Client est la classe représentant un client de la banque Broxybanque.
 * @author 
 */
import java.time.LocalDate;
import java.util.List;

public class Client  {
	
	private Integer id; 
	private String nom; 
	private String prenom; 
	private LocalDate dateNaissance; 
	private Adresse adresse;
	private List<Client> clients; 
	
	
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Client(Integer id, String nom, String prenom, LocalDate dateNaissance, Adresse adresse,
			List<Client> clients) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.adresse = adresse;
		this.clients = clients;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
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


	public List<Client> getClients() {
		return clients;
	}


	public void setClients(List<Client> clients) {
		this.clients = clients;
	}


	
	
}
