package fr.gtm.proxibanque.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.gtm.proxibanque.domain.CarteBleue;

/**
 * est l'interface permettant d'effectuer des requêtes en BDD
 * sur cette entité.
 * 
 * @author Mohammed, Kamir et Arnauld.
 * @version 3.0.
 */
public interface CarteBleueRepository extends JpaRepository<CarteBleue, Integer> {

}
