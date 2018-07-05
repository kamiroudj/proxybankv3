package fr.gtm.proxibanque.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import fr.gtm.proxibanque.domain.Conseiller;

public interface ConseillerRepository extends JpaRepository<Conseiller, Integer> {

	public Conseiller findByLogin(String login);

}
