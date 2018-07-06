package fr.gtm.proxibanque.web;

/**
 * DashboardController est la classe représentant la vue des comptes.

 * @author Mohammed, Kamir et Arnauld.
 * @version 3.0.
 */
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import fr.gtm.proxibanque.business.OperationsBancairesService;
import fr.gtm.proxibanque.domain.Compte;

@Controller
public class DashboardController {

	@Autowired
	private OperationsBancairesService service;

	/**
	 * Permet de générer la liste des comptes d'un client.
	 * 
	 * @param idClient
	 *            L'id du client.
	 * @param model
	 *            Le modèle.
	 * @return La liste des comptes.
	 */
	@RequestMapping("/dashboard")
	public String listeComptes(@RequestParam Integer idClient, Model model) {
		List<Compte> comptes = service.findComptes(idClient);
		model.addAttribute("comptes", comptes);
		model.addAttribute("idClient", idClient);
		return "dashboard-compte";

	}

}
