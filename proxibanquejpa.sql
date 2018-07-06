--
-- Déchargement des données de la table `adresse`
--

INSERT INTO `adresse` (`id`, `codePostal`, `lignePrincipale`, `ligneSecondaire`, `pays`, `ville`) VALUES
(1, '75001', '01 Rue Raymond Losserand', ' 2eme Etage gauche', 'France', 'Paris'),
(2, '75001', '02 Rue Raymond Losserand', ' 1eme Etage gauche', 'France', 'Paris'),
(3, '75001', '03 Rue Raymond Losserand', ' 2eme Etage gauche', 'France', 'Paris'),
(4, '75001', '04 Rue Raymond Losserand', ' 7eme Etage gauche', 'France', 'Paris'),
(5, '75001', '05 Rue Raymond Losserand', ' 3eme Etage droite', 'France', 'Paris');

-- -------------------------------------------------------

--
-- Déchargement des données de la table `cartebleue`
--

INSERT INTO `cartebleue` (`id`, `dateExpiration`, `numCarte`, `type`) VALUES
(1, '2018-07-01', 2147483647, 'VISA_ELECTRON'),
(2, '2020-07-02', 2147483647, 'VISA_PREMIER'),
(3, '2020-07-03', 2147483647, 'VISA_ELECTRON'),
(4, '2020-07-04', 2147483647, 'VISA_ELECTRON'),
(5, '2020-07-05', 2147483647, 'VISA_PREMIER');

-- --------------------------------------------------------

--
-- Déchargement des données de la table `chequier`
--

INSERT INTO `chequier` (`id`, `dateEnvoi`, `dateReception`) VALUES
(1, '2018-01-01', '2018-01-03'),
(2, '2018-07-02', '2018-07-04'),
(3, '2018-07-03', '2018-07-05'),
(4, '2018-07-04', '2018-07-06'),
(5, '2017-01-05', '2017-01-07');

-- --------------------------------------------------------

--
-- Déchargement des données de la table `client`
--

INSERT INTO `client` (`id`, `dateNaissance`, `nom`, `numClient`, `prenom`, `id_adresse`) VALUES
(1, '1985-04-01', 'LOLO', 20180010, 'Lamine', 3),
(2, '1985-04-02', 'ZOZO', 20180024, 'Zidane', 1),
(3, '1985-04-03', 'FOFO', 20180035, 'Fabien', 5),
(4, '1985-04-04', 'SOSO', 20180048, 'Steven', 2),
(5, '1985-04-05', 'NINA', 20180057, 'Nathalie', 4);

-- --------------------------------------------------------

--
-- Déchargement des données de la table `compte`
--

INSERT INTO `compte` (`id`, `dateOuverture`, `libelle`, `numCompte`, `solde`, `id_carte`, `id_chequier`) VALUES
(1, '2018-01-01', 'COMPTE_COURANT', 2147483647, 7520, 2, 3),
(2, '2018-01-02', 'COMPTE_COURANT', 2147483647, 75, 3, 4),
(3, '2018-01-03', 'COMPTE_COURANT', 2147483647, 42, 4, 5),
(4, '2018-01-04', 'COMPTE_EPARGNE', 2147483647, 75209, NULL, 1),
(5, '2018-01-05', 'COMPTE_COURANT', 2147483647, 752094, 1, 2);

-- --------------------------------------------------------

--
-- Déchargement des données de la table `compte_client`
--

INSERT INTO `compte_client` (`id_client`, `id_compte`) VALUES
(1, 3),
(1, 4),
(1, 5),
(3, 2),
(4, 1);

--
-- Index pour les tables déchargées
--
