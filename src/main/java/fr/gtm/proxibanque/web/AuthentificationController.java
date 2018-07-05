/**
 * 
 */
package fr.gtm.proxibanque.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.gtm.proxibanque.business.AuthentificationService;

/**
 * @author Adminl
 *
 */
@Controller
public class AuthentificationController {
	
	@Autowired
	AuthentificationService service;
	
	@RequestMapping("/")
	public String login() {
		return "login";
	}
	
	
}
