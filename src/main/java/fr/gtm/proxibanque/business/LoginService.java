package fr.gtm.proxibanque.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.gtm.proxibanque.dao.ConseillerRepository;
import fr.gtm.proxibanque.domain.Conseiller;

@Service
public class LoginService {
	
	@Autowired
	private ConseillerRepository dao;

	public Conseiller verifierLoginPassword(String login, String password) throws LoginException {

		Conseiller conseiller = null;
		if (login != null && password != null) {
			conseiller = dao.findByLogin(login);
		}
				
		if ((conseiller == null) || !conseiller.getPassword().equals(password))  throw new LoginException("Echec authentification Conseiller. Essayer à nouveau");
		
		return conseiller;

}

}