package fr.gtm.proxibanque.web;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.gtm.proxibanque.business.OperationsBancairesService;



@RequestMapping("/retraits")
@Controller
public class RetraitLiquideController {
	
	@Autowired
	private OperationsBancairesService service;
	
	
	
	@RequestMapping("/liquide")
	public String formRetraitLiquide() {
		
	/*	List<Client> clients;
		Conseiller conseiller= (Conseiller)(session.getAttribute("conseiller"));
		Integer idConseiller = conseiller.getId();
		//clients = service.findClients(idConseiller);
		//model.addAttribute("clients", clients);
		return "listeClients";*/
		return "retrait-cash";
		
	}
		
	
	@PostMapping("/liquide")
	public String validateRetraitLiquide(@RequestParam Integer compteDebit, @RequestParam Integer montant,  Model model) {
		
	/*	List<Client> clients;
		Conseiller conseiller= (Conseiller)(session.getAttribute("conseiller"));
		Integer idConseiller = conseiller.getId();
		//clients = service.findClients(idConseiller);
		//model.addAttribute("clients", clients);
		return "listeClients";*/
		return "retrait-cash";
		
	}
}
