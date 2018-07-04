package fr.gtm.proxibanque.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import fr.gtm.proxibanque.domain.Compte;

public interface CompteRepository extends JpaRepository<Compte, Integer>{

	@Query("select c from Compte as c where c.client.id =: idC")
	List<Compte> findAllComptesClient(@Param("idC") Integer idClient);

}
