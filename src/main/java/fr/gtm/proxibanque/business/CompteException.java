package fr.gtm.proxibanque.business;

public class CompteException extends Exception {

	/**
	 * Serialize
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Classe de génération de message d'exception métier sur la manipulation de
	 * compte.
	 * 
	 * @param message
	 */
	public CompteException(String message) {

		super(message);

	}

}
