package fr.gtm.proxibanque.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import fr.gtm.proxibanque.business.OperationsBancairesService;
import fr.gtm.proxibanque.domain.Compte;

@Controller
public class DashboardController {

	@Autowired
	private OperationsBancairesService service;

	@RequestMapping("/dashboard")
	public String listeClients(Model model) {
		Integer idClient = 1;
		List<Compte> comptes = service.findComptes(idClient);
		System.out.println("comptes " + comptes);
		model.addAttribute("comptes", comptes);
		model.addAttribute("idClient", idClient);
		return "dashboard-compte";

	}

}
