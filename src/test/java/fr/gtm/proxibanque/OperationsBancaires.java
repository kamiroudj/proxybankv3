package fr.gtm.proxibanque;



import fr.gtm.proxibanque.business.CompteException;
import fr.gtm.proxibanque.domain.Compte;
import fr.gtm.proxibanque.domain.TypeCompte;

public class OperationsBancaires {
		
	public void retraitLiquide(Compte compteDebit, Double montant) throws CompteException {
		
		if (compteDebit.getLibelle().equals(TypeCompte.COMPTE_EPARGNE.name())) throw new CompteException("Vous ne pouvez pas retirer d'un compte epargne");
		if (montant > 300 ) throw new CompteException("Vous ne pouvez pas retirer plus de 300 euros");
		if (montant > compteDebit.getSolde()) {
			throw new CompteException("Votre solde est insuffisant");
		}else {
			compteDebit.setSolde(compteDebit.getSolde() - montant);
		}
}
	
}
