package fr.gtm.proxibanque.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import fr.gtm.proxibanque.business.ConseillerService;

@Controller
public class ListClientController {
	
	
	@Autowired
	private ConseillerService service;
	

	

}
