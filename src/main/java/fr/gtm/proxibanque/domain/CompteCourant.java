package fr.gtm.proxibanque.domain;
/**
 * 
 * @author Adminl
 *CompteCourant est une classe héritée de Compte elle a pour attribut supplémentaire un plafond d'autorisation de découvert
 */
public class CompteCourant extends Compte{
	
	private Double decouvert;

	public CompteCourant() {
		super();
	}
/**
 * 
 * @param solde contenu du compte, paramètre utilisé lors des opérations type virement.
 * @param numeroCompte identifiant unique permettant l'indexation du compte sans erreur.
 */
	public CompteCourant(Double solde, Integer id) {
		super(solde, id);
	}

	public Double getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(Double decouvert) {
		this.decouvert = decouvert;
	}
	
	
	
	
	


}
