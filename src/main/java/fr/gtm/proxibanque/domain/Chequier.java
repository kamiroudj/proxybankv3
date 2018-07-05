package fr.gtm.proxibanque.domain;

/**
 * Chequier est la classe représentant un chéquier d'un client 
 * @author Mohammed, Kamir et Arnauld.
 * @version 3.0.
 */
import java.time.LocalDate;

public class Chequier {

	private Integer id;
	private LocalDate dateEnvoi;
	private LocalDate dateReception;
<<<<<<< HEAD

=======
	
>>>>>>> b77395a6306df135877c84029b2acc600d8bc676
	public Chequier() {
		super();
	}
<<<<<<< HEAD

	/**
	 * Constructeur Chequier.
	 * 
	 * @param id
	 *            C'est l'id unique du chequier.
	 * @param dateEnvoi
	 *            La date d'envoi du chéquier.
	 * @param dateReception
	 *            La date de réception du chéquier.
	 */
	public Chequier(Integer id, LocalDate dateEnvoi, LocalDate dateReception) {
=======
	public Chequier(LocalDate dateEnvoi, LocalDate dateReception) {
>>>>>>> b77395a6306df135877c84029b2acc600d8bc676
		super();
		this.dateEnvoi = dateEnvoi;
		this.dateReception = dateReception;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDate getDateEnvoi() {
		return dateEnvoi;
	}

	public void setDateEnvoi(LocalDate dateEnvoi) {
		this.dateEnvoi = dateEnvoi;
	}

	public LocalDate getDateReception() {
		return dateReception;
	}

	public void setDateReception(LocalDate dateReception) {
		this.dateReception = dateReception;
	}

}
