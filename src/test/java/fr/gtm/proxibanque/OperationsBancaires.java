package fr.gtm.proxibanque;

import java.time.LocalDate;
import java.time.Period;
import fr.gtm.proxibanque.business.CompteException;
import fr.gtm.proxibanque.domain.Compte;
import fr.gtm.proxibanque.domain.TypeCompte;


public class OperationsBancaires {

	
	public void retraitLiquide(Compte compteDebit, Double montant) throws CompteException {

		if (compteDebit.getLibelle().equals(TypeCompte.COMPTE_EPARGNE.name()))
			throw new CompteException("Vous ne pouvez pas retirer d'un compte epargne");
		if (montant > 300)
			throw new CompteException("Vous ne pouvez pas retirer plus de 300 euros");
		if (montant > compteDebit.getSolde()) {
			throw new CompteException("Votre solde est insuffisant");
		} else {
			compteDebit.setSolde(compteDebit.getSolde() - montant);
		}
	}

	
	public void retraitCarte(Compte compte, String type) throws CompteException {
		LocalDate today = LocalDate.now();
		if (compte.getLibelle().equals(TypeCompte.COMPTE_EPARGNE.name()))
			throw new CompteException("Vous ne pouvez pas retirer une carte pour un compte epargne");
		if (compte.getCarteBleue() != null) {
			if (compte.getCarteBleue().getDateExpiration().isAfter(today))
				throw new CompteException("Impossible d’effectuer le retrait, votre ancienne carte est encore valide");
		}
	}

	
	public void retraitChequier(Compte compte) throws CompteException {

		LocalDate today = LocalDate.now();
		if (compte.getChequier() != null) {
			LocalDate dateValide = compte.getChequier().getDateReception();
			Period p = Period.between(dateValide, today);
			if (p.toTotalMonths() < 3 && p.getDays() != 0) {
				throw new CompteException(
						"Impossible d’effectuer le retrait d’un nouveau chéquier pour ce compte avant le" + dateValide);
			}

		}
	}

}
