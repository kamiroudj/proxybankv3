--
-- Données Base de données :  `proxibanquejpa`
--

--
-- Déchargement des données de la table `personne`
--

INSERT INTO `client` (`id`, `nom`, `prenom`, `adresse`, `telephone`, `email`) VALUES
(1,'Durieux', 'Elocia', '20, avenue Gambetta, Paris', '0154859632', 'pre1.nom1@boitemail.fr'),
(2,'john', 'vanhertmann', '20, rue du jouet, Strasbourg', '0654858532', 'pre2.nom2@boitemail.fr'),
(3,'monsieur', 'conseiller', '14 bd saint georges, Paris', '0755556937', 'pre3.nom3@boitemail.fr'),
(4,'joiut', 'hermann', '30 rue lecourbe, Avignon', '0642421687', 'pre4.nom4@boitemail.fr'),
(5,'jojo', 'dudu', '158 avenue de france, 75006 Paris', '0785204612', 'pre5.nom5@boitemail.fr'),
(6,'franck', 'bonhomme', '75 rue saint jacques, Rosny', '0612457865', 'pre6.nom6@boitemail.fr'),
(7,'Roussel', 'Sylvain', '4 rue de la glacière,75014 Paris', '0616657835', 'pre7.nom7@boitemail.fr');



-- ---------------------------------------------------------------------

--
-- Déchargement des données de la table `client`
--

INSERT INTO `client` (`id`) VALUES
(1),
(4),
(6),
(7);

-- --------------------------------------------------------

--
-- Déchargement des données de la table `conseiller`
--

INSERT INTO `conseiller` (`id`, `login`, `password`) VALUES
(2, 'jvanher', 'mdp'),
(3, 'conseiller', 'secret'),
(5, 'jodudu', 'hello');


-- --------------------------------------------------------
--
-- Déchargement des données de la table `comptes`
--

INSERT INTO `compte` (`id`, `solde`, `dtype`, `decouvert`, `taux`) VALUES
(1, '5000.00', 'epargne', NULL, '0.12'),
(2, '7000.00', 'courant', '500.00', NULL),
(3, '2500.00', 'courant', '500.00', NULL),
(4, '3000.00', 'epargne', NULL, '0.06'),
(5, '600.00', 'courant', '300.00', NULL),
(6, '1000.00', 'courant', '300.00', NULL);


-- --------------------------------------------------------

--
-- Déchargement des données de la table `client_compte`
--

INSERT INTO `compte_client` (`idClient`, `idCompte`) VALUES
(1, 1),
(1, 2),
(4, 3),
(4, 4),
(6, 5),
(7, 6);

-- --------------------------------------------------------

--
-- Déchargement des données de la table `conseiller_clients`
--

INSERT INTO `client_conseiller` (`idConseiller`, `idClient`) VALUES
(2, 1),
(2, 4),
(2, 6),
(3, 7);

-- --------------------------------------------------------
