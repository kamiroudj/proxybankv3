<<<<<<< HEAD
=======
/**
 * Controller qui gère les vues d'authentification en deux etapes par nom et/ou prenom puis par date de naissance
 * 
 */
>>>>>>> 7e64116a5d4deea17cbce038013be2bd691e7bb9
package fr.gtm.proxibanque.web;
/**
 * RetraitController est la classe représentant la vue de l'autentification des clients.

 * @author Mohammed, Kamir et Arnauld.
 * @version 3.0.
 */
import java.time.LocalDate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import fr.gtm.proxibanque.business.AuthentificationService;

@Controller
public class AuthentificationController {
	

	private static final Logger LOGGER = LoggerFactory.getLogger("fr.gtm.proxibanque");

	@Autowired
	AuthentificationService service;

	@RequestMapping("/login")
	public String login() {
		return "login";
	}

	@PostMapping("/login")
	public String chercher(@RequestParam String search, Model model)  {
		String result = null;
		/* final ModelAndView mav = new ModelAndView("verif-date"); */

		if (this.service.search(search) != null) {
			LOGGER.debug("----------CONTROLLER Search okok ----------- ");

			model.addAttribute("id", this.service.search(search));
			model.addAttribute("saisie", search);

			result = "redirect:/verif-date.html";
			// TODO envoi de l'id vers la vue verif date même page ou page differente?
		} else {
			LOGGER.debug("CONTROLLER Pas de client correspondant ");

			result = "erreur-conseiller";
		}

		return result;
	}

	@RequestMapping("/verif-date")
	public String verifDate(@RequestParam String saisie, @RequestParam Integer id, Model model) {

		model.addAttribute("saisie", saisie);
		model.addAttribute("id", id);

		return "verif-date";
	}

	@PostMapping("/verif-date")
	public String getDate(@RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate date,
			@RequestParam Integer id, Model model) {
		LOGGER.debug("-------------CONTROLLER verifDate okok-------------- ");
		String result = null;

		// vérifier la date
		if (this.service.verifierDate(date, id) != null) {
			LOGGER.debug("-------------CONTROLLER verifDate okok-------------- ");
			// je passe au dashboard l'id du client trouvé
			model.addAttribute("idClient", this.service.verifierDate(date, id));
			result = "redirect:/dashboard.html";
		} else {
			result = "erreur-conseiller";
		}

		return result;
	}

}
