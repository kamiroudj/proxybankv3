package fr.gtm.proxibanque.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import fr.gtm.proxibanque.domain.Compte;
/**
 * est l'interface permettant d'effectuer des requêtes en BDD Compte
 * 
 * @author Mohammed, Kamir et Arnauld.
 * @version 3.0.
 */
public interface CompteRepository extends JpaRepository<Compte, Integer>{

	@Query("select c from Compte as c where c.client.id =:id")
	public List<Compte> findComptesUnClient(@Param("id") Integer idClient);

}
