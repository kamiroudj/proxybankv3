package fr.gtm.proxibanque;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;


import fr.gtm.proxibanque.business.CompteException;
import fr.gtm.proxibanque.domain.Compte;

public class OperationsBancairesServiceTest {
	
	private OperationsBancaires app ;
	
	@Before
	public void initializeApp() {
		this.app = new OperationsBancaires();
		
	}

	
	@Test
	public void testRetraitLiquideSupSolde() {
		
		Compte cp = new Compte(1222222L, LocalDate.parse("2018-01-02"), 250d, "COMPTE_COURANT");		
		try {
			app.retraitLiquide(cp, 300d);
			fail("Votre solde est suffisant");
		} catch (CompteException e) {
			assert(e.getMessage().contains("Votre solde est insuffisant"));
		}
		
	}
	
	@Test
	public void testRetraitLiquideSup300() {
		
		Compte cp = new Compte(1222222L, LocalDate.parse("2018-01-02"), 250d, "COMPTE_COURANT");		
		try {
			app.retraitLiquide(cp, 400d);
			fail("Vous retirez moins de 300 euros");
		} catch (CompteException e) {
			assert(e.getMessage().contains("Vous ne pouvez pas retirer plus de 300 euros"));
		}		
	}

	@Test
	public void testRetraitChequier() {
		fail("Not yet implemented");
	}

	@Test
	public void testRetraitCarte() {
		fail("Not yet implemented");
	}

}
