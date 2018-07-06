package fr.gtm.proxibanque.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.gtm.proxibanque.business.OperationsBancairesService;
import fr.gtm.proxibanque.business.CompteException;
import fr.gtm.proxibanque.domain.Compte;

@Controller
public class VirementController {
	
	@Autowired
	private OperationsBancairesService service;
	
	
	@RequestMapping("/virement")
	public String effectuerVirement(@RequestParam("id") Integer idClient, Model model) {
		
		model.addAttribute("idClient", idClient);
		List<Compte> comptes = service.findComptes(idClient);
		model.addAttribute("comptes", comptes);
		return "virement";
		
	}
	
	
	@PostMapping("/virement")
	public String validateVirement(@RequestParam Integer idClient, @RequestParam Integer compteDebit, @RequestParam Integer compteCredit ,@RequestParam Double montant,  Model model) throws CompteException {
		
		
		String erreur = " virement de "+montant+" validé";
		
		if (compteDebit.equals(compteCredit)) {
			erreur =" Veuillez saisir deux comptes différents";
			model.addAttribute("erreur", erreur);
			return this.effectuerVirement(idClient, model);
		}
		
		try {
			service.virement(compteDebit, compteCredit, montant);
		} catch (CompteException e) {
			erreur = e.getMessage();			
		}
		
		model.addAttribute("erreur", erreur);
		return this.effectuerVirement(idClient, model);
		
	}
	

}
