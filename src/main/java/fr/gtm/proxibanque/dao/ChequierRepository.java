package fr.gtm.proxibanque.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.gtm.proxibanque.domain.Chequier;

public interface ChequierRepository extends JpaRepository<Chequier, Integer> {

}
