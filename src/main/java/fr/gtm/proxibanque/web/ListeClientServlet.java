package fr.gtm.proxibanque.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import fr.gtm.proxibanque.business.ConseillerService;
import fr.gtm.proxibanque.domain.Client;
import fr.gtm.proxibanque.domain.Conseiller;


/**
 * Servlet implementation class ListeClientServlet
 * Affiche la vue 'listeClients' 
 */
public class ListeClientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private ConseillerService service;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/views/listeClients.jsp").forward(request, response);
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		List<Client> clients = new ArrayList<Client>();
		Conseiller conseiller= (Conseiller)(req.getSession().getAttribute("conseiller"));
		int idConseiller = conseiller.getId();
		
		clients = service.findClients(idConseiller);
		req.getSession().setAttribute("clients", clients);
		doGet(req, resp);
		
	}



}
