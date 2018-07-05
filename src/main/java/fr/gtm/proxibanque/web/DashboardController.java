package fr.gtm.proxibanque.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import fr.gtm.proxibanque.business.OperationsBancairesService;



@Controller
public class DashboardController {

	@Autowired
	private OperationsBancairesService service;
	
	
	
	
	
	
	
	@RequestMapping("/dashboard")
	public String listeClients() {
		
		return "dashboard-compte";
		
	}
	
	
	
	
}
