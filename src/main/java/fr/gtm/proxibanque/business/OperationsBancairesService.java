package fr.gtm.proxibanque.business;

import java.time.LocalDate;

import java.time.Period;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import fr.gtm.proxibanque.dao.CompteRepository;
import fr.gtm.proxibanque.domain.Compte;
import fr.gtm.proxibanque.domain.TypeCompte;



@Service
public class OperationsBancairesService {
	
	@Autowired
	private CompteRepository daocp;


	public void retraitLiquide(Integer compteDebit, Double montant) throws CompteException {
		
		Optional<Compte> cp = daocp.findById(compteDebit);
		Compte aDebiter = null;	
		
		if (cp.isPresent()) aDebiter = cp.get();
		
		if (aDebiter.getLibelle().equals(TypeCompte.COMPTE_EPARGNE.name())) throw new CompteException("Vous ne pouvez pas retirer d'un compte epargne");
		if (montant > 300 ) throw new CompteException("Vous ne pouvez pas retirer plus de 300 euros");
		if (montant > aDebiter.getSolde()) {
			throw new CompteException("Votre solde est insuffisant");
		}else {
			aDebiter.setSolde(aDebiter.getSolde() - montant);
			daocp.save(aDebiter);
		}
		
		
	}


	
	public void retraitChequier(Integer idCompte) throws CompteException {
		
		Optional<Compte> cp = daocp.findById(idCompte);
		Compte cpCheque = null;	
		if (cp.isPresent()) cpCheque = cp.get();
		
		LocalDate today = LocalDate.now();			
		
		if (cpCheque.getChequier() != null) {
			Period p = Period.between(cpCheque.getChequier().getDateReception(), today);
			if (p.toTotalMonths() < 3 && p.getDays() != 0) {
				throw new CompteException("Vous ne pouvez pas retirer un chequier à moins de 3 mois");		
			}
		
		}
				
	}
	
	
	public void retraitCarte(Integer idCompte, String type) throws CompteException {
		
		Optional<Compte> cp = daocp.findById(idCompte);
		Compte cpCB = null;	
		if (cp.isPresent()) cpCB = cp.get();
		LocalDate today = LocalDate.now();
		if (cpCB.getLibelle().equals(TypeCompte.COMPTE_EPARGNE.name())) throw new CompteException("Vous ne pouvez pas retirer une carte pour un compte epargne");
		if (cpCB.getCarteBleue() != null) {					
			if(cpCB.getCarteBleue().getDateExpiration().isAfter(today)) throw new CompteException("Vous ne pouvez pas retirer une carte avant son expiration");
		}		
	}


	public void virement(Integer idCompteDebit, Integer idCompteCredit, Double montant) throws CompteException {
		
		Compte compteDebit = null;
		Compte compteCredit = null;
		
		Optional<Compte> cd = daocp.findById(idCompteDebit);
		Optional<Compte> cc = daocp.findById(idCompteCredit);
		if (cd.isPresent()) compteDebit = cd.get();
		if (cc.isPresent()) compteCredit = cc.get();
		if (montant > 900 ) throw new CompteException("Vous ne pouvez pas faire un virement de plus de 900 euros");	
		if (montant > compteDebit.getSolde()) throw new CompteException("Solde insuffisant");
		
		compteDebit.setSolde(compteDebit.getSolde() -  montant);
		compteCredit.setSolde(compteCredit.getSolde() + montant);
		daocp.save(compteDebit);
		daocp.save(compteCredit);		

	}

	public List<Compte> findComptes(Integer idClient) {

		return daocp.findComptesUnClient(idClient);
	}	
	

}
