package fr.gtm.proxibanque.web;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.gtm.proxibanque.business.OperationsBancairesService;
import fr.gtm.proxibanque.domain.Client;
import fr.gtm.proxibanque.domain.Conseiller;

@Controller
public class ListClientController {
	
	
	@Autowired
	private OperationsBancairesService service;
	
	@RequestMapping("/listClient")
	public String listeClients(HttpSession session, Model model) {
		
		List<Client> clients;
		Conseiller conseiller= (Conseiller)(session.getAttribute("conseiller"));
		Integer idConseiller = conseiller.getId();
		//clients = service.findClients(idConseiller);
		//model.addAttribute("clients", clients);
		return "listeClients";
		
	}
	

	

}
