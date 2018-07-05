package fr.gtm.proxibanque.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import fr.gtm.proxibanque.domain.Client;

public interface ClientRepository extends JpaRepository<Client, Integer>{

	 
}
