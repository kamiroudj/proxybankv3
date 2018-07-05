package fr.gtm.proxibanque.web;

import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import fr.gtm.proxibanque.business.ConseillerService;
import fr.gtm.proxibanque.domain.Compte;

@Controller
public class ListCompteController {
	
	@Autowired
	private ConseillerService service;
	
	
	@RequestMapping("/listComptes")
	public String listeComptes(HttpSession session, Model model, @RequestParam Integer idClient) {
		
		System.out.println("idClient  "+idClient);
		
		List<Compte> comptes = service.findComptesClient(idClient);
		System.out.println("comptes "+comptes);
		
		model.addAttribute("comptes", comptes);
		return "listeComptes";
		
	}

}
