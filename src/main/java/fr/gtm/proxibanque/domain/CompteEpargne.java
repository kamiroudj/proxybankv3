package fr.gtm.proxibanque.domain;
/**
 * 
 * @author Adminl
 *CompteCourant est une classe héritée de Compte elle a pour attribut supplémentaire un taux d'intérêts
 */
public class CompteEpargne extends Compte{
	
	private Double taux;

	public CompteEpargne() {
		super();
	}
/**
 * 
 * @param solde contenu du compte, paramètre utilisé lors des opérations type virement.
 * @param numeroCompte identifiant unique permettant l'indexation du compte sans erreur.
 */
	public CompteEpargne(Double solde, Integer id) {
		super(solde, id);
	}

	public double getTaux() {
		return taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}
	

}
