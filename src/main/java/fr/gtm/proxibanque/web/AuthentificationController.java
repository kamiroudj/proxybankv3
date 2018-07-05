/**
 * 
 */
package fr.gtm.proxibanque.web;

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
	
	@Autowired
	AuthentificationService service;
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	@PostMapping("/login")
	public String chercher(@RequestParam String search) throws LoginException {
		String result = null;
		
		if(this.service.search(search)!=null) {
			//NOM ou/et PRENOM ok
			Integer searchId = this.service.getSearchId();
			//renvoie la jsp date avec l'id de la recherche
			result = "verif-date";
			//TODO envoi de l'id vers la vue verif date même page ou page differente?
		}else {
			
			result = "erreur-conseiller";
		}
		
		return result;
	}
	
	@RequestMapping("/verif-date")
	public String verifDate() {
		return "verif-date";
	}
	
	
	
}

