package fr.gtm.proxibanque.domain;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author Adminl
 * la classe Conseiller est hérité de la classe 'Personne' et représente le conseiller clientèle définit par un login, un password et un liste de clients qui lui sont rattachés.
 */
public class Conseiller extends Personne {
	
	private String login;
	private String password;
	private List<Client> clients = new ArrayList<Client>();
	
	/***************** Constructeur ********************************************/
	
	public Conseiller() {
		super();

	}
	
	
	public Conseiller(String login, String password) {
		this.login = login;
		this.password = password;
	}
	/**
	 * 
	 * @param login est nécessaire au conseiller afin de s'identifier sur l'application bancaire.
	 * @param password est nécessaire au conseiller afin de s'identifier sur l'application bancaire.
	 */
	public Conseiller(String nom, String prenom, String adresse, String telephone, String email, String login, String password) {
		super(nom, prenom, adresse, telephone, email);
		this.login = login;
		this.password = password;
	}
	
	/************************Getters et Setters********************************/
	
	public String getLogin() {
		return login;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	public List<Client> getClients() {
		return clients;
	}

	public void setClients(List<Client> clients) {
		this.clients = clients;
	}
			

}
