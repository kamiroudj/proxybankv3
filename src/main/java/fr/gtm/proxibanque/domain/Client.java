package fr.gtm.proxibanque.domain;

/**
 * Client est la classe représentant un client de la banque Broxybanque.
 * @author Mohammed, Kamir et Arnauld.
 * @version 3.0.
 */
import java.time.LocalDate;
import java.util.List;

<<<<<<< HEAD
public class Client {

	private Integer id;
	private String nom;
	private String prenom;
	private LocalDate dateNaissance;
	private Adresse adresse;
	private List<Client> clients;

=======
public class Client  {
	
	private Integer id;
	private Integer numClient;
	private String nom; 
	private String prenom; 
	private LocalDate dateNaissance; 
	private Adresse adresse;
	private List<Compte> comptes; 
	
	
>>>>>>> b77395a6306df135877c84029b2acc600d8bc676
	public Client() {
		super();
	}

<<<<<<< HEAD
	/**
	 * Constructeur Client.
	 * 
	 * @param id
	 *            C'est l'id unique du client .
	 * @param nom
	 *            Le nom du client.
	 * @param prenom
	 *            Le prénom du client.
	 * @param dateNaissance
	 *            La date de naissance du client.
	 * @param adresse
	 *            L'adresse du client;
	 * @param clients
	 *            La liste des clients d'une banque Broxibanque.
	 */
	public Client(Integer id, String nom, String prenom, LocalDate dateNaissance, Adresse adresse,
			List<Client> clients) {
=======

	public Client(Integer numClient, String nom, String prenom, LocalDate dateNaissance, Adresse adresse) {
>>>>>>> b77395a6306df135877c84029b2acc600d8bc676
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

<<<<<<< HEAD
=======
	

	public Integer getNumClient() {
		return numClient;
	}


	public void setNumClient(Integer numClient) {
		this.numClient = numClient;
	}


>>>>>>> b77395a6306df135877c84029b2acc600d8bc676
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

<<<<<<< HEAD
	public List<Client> getClients() {
		return clients;
	}

	public void setClients(List<Client> clients) {
		this.clients = clients;
=======

	public List<Compte> getComptes() {
		return comptes;
	}


	public void setComptes(List<Compte> comptes) {
		this.comptes = comptes;
>>>>>>> b77395a6306df135877c84029b2acc600d8bc676
	}

}
