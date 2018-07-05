package fr.gtm.proxibanque.web;


import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import fr.gtm.proxibanque.business.AuthentificationService;
import fr.gtm.proxibanque.domain.Conseiller;

@Controller
public class LoginController {
	
	@Autowired
	AuthentificationService service;
	
	@RequestMapping("/auth")
	public String selogger() {
		return "login";
	}
	
	
	
	@PostMapping("/auth")
	public String verifierLogin(HttpSession session, 
			@RequestParam("login") String login,
			@RequestParam("password") String password,
			Model model) {
		
		Conseiller conseiller = new Conseiller(login, password);
				
		try {
			conseiller = service.verifierLoginPassword(login, password);
			session.setAttribute("conseiller", conseiller);
			return "redirect:/listClient.html";
		} catch (fr.gtm.proxibanque.business.LoginException e) {
			String erreur = e.getMessage();
			session.setAttribute("conseiller",  null);
			model.addAttribute("erreur", erreur);
			return this.selogger();
		}
	}
	
	

}
