package fr.gtm.proxibanque.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.gtm.proxibanque.dao.ClientRepository;
import fr.gtm.proxibanque.dao.CompteRepository;
import fr.gtm.proxibanque.domain.Client;
import fr.gtm.proxibanque.domain.Compte;
import fr.gtm.proxibanque.domain.CompteCourant;



@Service
public class ConseillerService {
	
	@Autowired
	private ClientRepository daocl;
	
	@Autowired
	private CompteRepository daocp;


	public List<Client> findClients(Integer idConseiller) {
		
		return daocl.findAllClientsConseiller(idConseiller);
				
	}


	public Client findClientById(Integer id) {		
		//return daocl.findById(id);
		return daocl.findById(id).get();
	}


	public void updateClient(Client client) {
	
		daocl.save(client);
	}


	public List<Compte> findComptesClient(Integer idClient) {
		
		return daocp.findAllComptesClient(idClient);
		//return null;
	}


	public List<Compte> findComptes() {
		
		return daocp.findAll();
	}
	


	public void effectuerVirement(int compDeb, int compCre, double montant) throws SoldeException {
		
		Compte compteDebit = null;
		Compte compteCredit = null;
		//Compte compteDebit = daocp.findById(compDeb); //à modifier
		
		//Compte compteCredit = daocp.findById(compCre); //à modifier
		
		if (compteDebit instanceof CompteCourant) {
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
	}
		
	}	
	

}
