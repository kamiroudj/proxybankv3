/**
 * 
 * 
 */
package fr.gtm.proxibanque.business;

import org.springframework.beans.factory.annotation.Autowired;

import fr.gtm.proxibanque.dao.ClientRepository;

/**
 * @author Adminl
 *
 */
public class SearchComponent {
	
	@Autowired
	private ClientRepository dao;
	
	private Integer idSearch;
	
	private String searchContent;
	
	//
	public boolean search(String saisie) {
		Boolean result = false;
		
		// 1 découper la saisie en deux String si le noms et prénoms sont saisis
//		String[] resultArray = saisie.split(" ");

		// 2 vérifier si un de ces strings est en BDD dans les prénoms
		
//		this.dao.findByPrenom(resultArray[1]);
//		this.dao.findByPrenom(resultArray[0]);
		

		// 3 vérifier si un des deux strings est en BDD dans les noms
//		this.dao.findByNom(resultArray[1]);
//		this.dao.findByNom(resultArray[0]);
		
		return result;
	}
	
	
}
