package fr.gtm.proxibanque.web;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.gtm.proxibanque.business.OperationsBancairesService;
import fr.gtm.proxibanque.business.RetraitException;
import fr.gtm.proxibanque.domain.Compte;



@RequestMapping("/retraits")
@Controller
public class RetraitController {
	
	@Autowired
	private OperationsBancairesService service;
	
	
	
	@RequestMapping("/liquide")
	public String formRetraitLiquide(@RequestParam("id") Integer idClient, Model model) {
	
		model.addAttribute("idClient", idClient);
		List<Compte> comptes = service.findComptes(idClient);
		model.addAttribute("comptes", comptes);
		return "retrait-cash";
		
	}
			
	@PostMapping("/liquide")
	public String validateRetraitLiquide(@RequestParam Integer idClient, @RequestParam Integer compteDebit, @RequestParam Double montant,  Model model) {
		
		
		String erreur = " retrait de "+montant+" validé";
		
		try {
			service.retraitLiquide(compteDebit, montant);
		} catch (RetraitException e) {
			erreur = e.getMessage();			
		}
		
		model.addAttribute("erreur", erreur);
		return this.formRetraitLiquide(idClient, model);
		
	}
	
	@RequestMapping("/chequier")
	public String formRetraitChequier(@RequestParam("id") Integer idClient, Model model) {
	
		model.addAttribute("idClient", idClient);
		List<Compte> comptes = service.findComptes(idClient);
		model.addAttribute("comptes", comptes);
		return "retrait-chequier";
		
	}
	
	
	@PostMapping("/chequier")
	public String validateRetraitLiquide(@RequestParam Integer idClient, @RequestParam("compte") Integer idCompte,  Model model) {
		
		
		String erreur = " retrait de chequier validé";
		
		try {
			service.retraitChequier(idCompte);
		} catch (RetraitException e) {
			erreur = e.getMessage();
		}
		
		model.addAttribute("erreur", erreur);
		return this.formRetraitChequier(idClient, model);		
	}
	
	@RequestMapping("/carte")
	public String formRetraitCarte(@RequestParam("id") Integer idClient, Model model) {
	
		model.addAttribute("idClient", idClient);
		List<Compte> comptes = service.findComptes(idClient);
		model.addAttribute("comptes", comptes);
		return "retrait-cb";
		
	}
	
	@PostMapping("/carte")
	public String validateRetraitLiquide(@RequestParam Integer idClient, @RequestParam("compte") Integer idCompte,  @RequestParam String typeCB, Model model) {
		
		
		String erreur = " retrait de carte validé";
		
		try {
			service.retraitCarte(idCompte, typeCB);
		} catch (RetraitException e) {
			erreur = e.getMessage();
		}
		
		model.addAttribute("erreur", erreur);
		return this.formRetraitCarte(idClient, model);		
	}
	
	
}
