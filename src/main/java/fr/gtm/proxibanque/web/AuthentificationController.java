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
	public String verifSaisie(@RequestParam String search) {
		
		
		//NOM ou/et PRENOM ok
		
			//renvoie la jsp date
			return "";
		
		//SERVICE FAIL
		//renvoie la jsp erreur si le service n'a rien
//		return "redirect:/appel-conseiller.html";
	}
	
	
	
	
}
