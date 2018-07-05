package fr.gtm.proxibanque.business;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.gtm.proxibanque.dao.ClientRepository;
import fr.gtm.proxibanque.dao.CompteRepository;
import fr.gtm.proxibanque.domain.Client;
import fr.gtm.proxibanque.domain.Compte;



@Service
public class OperationsBancairesService {
	
	@Autowired
	private ClientRepository daocl;
	
	@Autowired
	private CompteRepository daocp;


	public void retraitLiquide(Compte compte, Double montant) {
		
				
	}



	public void retraitCarte(Compte compte, String type) {

	}
	
	public void retraitChequier(Compte compte) {
		
	}


	public void virement(Integer idCompteDebit, Integer idCompteCredit, Double montant) throws SoldeException {
		
		Compte compteDebit = null;
		Compte compteCredit = null;
		//Compte compteDebit = daocp.findById(compDeb); //à modifier		
		//Compte compteCredit = daocp.findById(compCre); //à modifier
		
		/*if (compteDebit instanceof CompteCourant) {
			if (montant > (compteDebit.getSolde() + ((CompteCourant)compteDebit).getDecouvert())) throw new SoldeException("Solde insuffisant");
			compteDebit.setSolde(compteDebit.getSolde() -  montant);
			compteCredit.setSolde(compteCredit.getSolde() + montant);
			daocp.save(compteDebit);
			daocp.save(compteCredit);
		}else {			
			if (montant > compteDebit.getSolde()) throw new SoldeException("Solde insuffisant");
			compteDebit.setSolde(compteDebit.getSolde() -  montant);
			compteCredit.setSolde(compteCredit.getSolde() + montant);
			daocp.save(compteDebit);
			daocp.save(compteCredit);		
		}*/

	}	
	

}
