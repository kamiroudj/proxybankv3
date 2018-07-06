package fr.gtm.proxibanque.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.gtm.proxibanque.domain.Adresse;

public interface AdresseRepository extends JpaRepository<Adresse, Integer> {

}
