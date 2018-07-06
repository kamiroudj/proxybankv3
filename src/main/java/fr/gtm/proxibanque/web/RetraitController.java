package fr.gtm.proxibanque.web;

/**
 * RetraitController est la classe représentant la vue des retraits.

 * @author Mohammed, Kamir et Arnauld.
 * @version 3.0.
 */
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.gtm.proxibanque.business.OperationsBancairesService;
import fr.gtm.proxibanque.business.CompteException;
import fr.gtm.proxibanque.domain.Compte;

@RequestMapping("/retraits")
@Controller
public class RetraitController {

	@Autowired
	private OperationsBancairesService service;

	/**
	 * Retrait du liquide.
	 * 
	 * @param idClient
	 *            L'id du client.
	 * @param model
	 *            Le modèle.
	 * @return Un retrait cash.
	 */
	@RequestMapping("/liquide")
	public String formRetraitLiquide(@RequestParam("id") Integer idClient, Model model) {

		model.addAttribute("idClient", idClient);
		List<Compte> comptes = service.findComptes(idClient);
		model.addAttribute("comptes", comptes);
		return "retrait-cash";

	}

	/**
	 * La validation d'un retrait liquide.
	 * 
	 * @param idClient
	 *            L'id du client.
	 * @param compteDebit
	 *            Le compte débiteur.
	 * @param montant
	 *            Le montant.
	 * @param model
	 *            Le modèle.
	 * @return Un retrait cash.
	 */
	@PostMapping("/liquide")

	public String validateRetraitLiquide(@RequestParam Integer idClient, @RequestParam Integer compteDebit, @RequestParam Double montant,  Model model) {
		String erreur = null;
		
		if(montant>0) {
		erreur = " retrait de "+montant+" validé";

		try {
			
				service.retraitLiquide(compteDebit, montant);
			
		} catch (CompteException e) {
			erreur = e.getMessage();
		}
		
		}else {
			erreur = "Merci de saisir un montant positif";
		}

		model.addAttribute("erreur", erreur);
		return this.formRetraitLiquide(idClient, model);

	}

	/**
	 * Retrait chèquier.
	 * 
	 * @param idClient
	 *            L'id du Client.
	 * @param model
	 *            Le modèle.
	 * @return Retrait chéquier.
	 */
	@RequestMapping("/chequier")
	public String formRetraitChequier(@RequestParam("id") Integer idClient, Model model) {

		model.addAttribute("idClient", idClient);
		List<Compte> comptes = service.findComptes(idClient);
		model.addAttribute("comptes", comptes);
		return "retrait-chequier";

	}

	/**
	 * La validation du retrait chéquier.
	 * 
	 * @param idClient
	 *            L'id du client.
	 * @param idCompte
	 *            L'id du compte.
	 * @param model
	 *            Le modèle.
	 * @return Retrait chéquier.
	 */
	@PostMapping("/chequier")
	public String validateRetraitChequier(@RequestParam Integer idClient, @RequestParam("compte") Integer idCompte,
			Model model) {

		String erreur = " retrait de chequier validé";

		try {
			service.retraitChequier(idCompte);
		} catch (CompteException e) {
			erreur = e.getMessage();
		}

		model.addAttribute("erreur", erreur);
		return this.formRetraitChequier(idClient, model);
	}

	/**
	 * Retrait carte bancaire
	 * 
	 * @param idClient
	 *            L'id du client .
	 * @param model
	 *            Le modèle.
	 * @return Retrait de la carte bancaire.
	 */
	@RequestMapping("/carte")
	public String formRetraitCarte(@RequestParam("id") Integer idClient, Model model) {

		model.addAttribute("idClient", idClient);
		List<Compte> comptes = service.findComptes(idClient);
		model.addAttribute("comptes", comptes);
		return "retrait-cb";

	}

	/**
	 * La validation du retrait de la carte bancaire.
	 * @param idClient L'id du client.
	 * @param idCompte L'id du compte.
	 * @param typeCB Le  type de la carte bancaire.
	 * @param model Le modèle.
	 * @return Retrait carte bancaire 
	 */
	@PostMapping("/carte")
	public String validateRetraitCarte(@RequestParam Integer idClient, @RequestParam("compte") Integer idCompte,
			@RequestParam String typeCB, Model model) {

		String erreur = " retrait de carte validé";

		try {
			service.retraitCarte(idCompte, typeCB);
		} catch (CompteException e) {
			erreur = e.getMessage();
		}

		model.addAttribute("erreur", erreur);
		return this.formRetraitCarte(idClient, model);
	}

}
