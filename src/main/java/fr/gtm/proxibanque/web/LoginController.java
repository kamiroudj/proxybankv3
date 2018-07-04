package fr.gtm.proxibanque.web;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.support.RequestContext;

import fr.gtm.proxibanque.business.LoginService;
import fr.gtm.proxibanque.domain.Conseiller;

@Controller
public class LoginController {
	
	@Autowired
	LoginService service;
	
	@RequestMapping("/auth")
	public String selogger() {
		return "/login";
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
			return "/listClient";
		} catch (fr.gtm.proxibanque.business.LoginException e) {
			String erreur = e.getMessage();
			session.setAttribute("conseiller",  null);
			model.addAttribute("erreur", erreur);
			return this.selogger();
		}
		
		//HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		
		
		//HttpSession session = request.getSession();
		
			
	/*	if (!erreur.isEmpty()) {
			session.setAttribute("conseiller",  null);
			request.setAttribute("erreur", erreur);
			return this.selogger();
		}else {
			session.setAttribute("conseiller",  conseiller);
			return "/listClient.html";
		}	*/	
	}
	
	

}
