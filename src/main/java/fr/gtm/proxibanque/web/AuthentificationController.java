/**
 * 
 */
package fr.gtm.proxibanque.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import fr.gtm.proxibanque.business.AuthentificationService;
import fr.gtm.proxibanque.business.LoginException;

/**
 * @author Adminl
 *
 */
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
	public String chercher(@RequestParam String search) throws LoginException {
		String result;
		
		if(this.service.chercher(search)==2) {
			
			LOGGER.debug("CONTROLLER Je suis dans le IF " + search);
			//NOM ou/et PRENOM ok
			//renvoie la jsp date avec l'id de la recherche
			result = "verif-date?id=";
		}else {
			LOGGER.debug("CONTROLLER Pas de client correspondant ");
			result = "erreur-conseiller";
		}
		
		return result;
		//SERVICE FAIL
		//renvoie la jsp erreur si le service n'a rien
//		return "redirect:/appel-conseiller.html";
	}
	
	
	
}

