-- phpMyAdmin SQL Dump
-- version 4.8.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le :  ven. 06 juil. 2018 à 02:00
-- Version du serveur :  10.1.33-MariaDB
-- Version de PHP :  7.2.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `proxibanquejpa`
--

-- --------------------------------------------------------

--
-- Structure de la table `adresse`
--

CREATE TABLE `adresse` (
  `id` int(11) NOT NULL,
  `codePostal` varchar(255) DEFAULT NULL,
  `lignePrincipale` varchar(255) DEFAULT NULL,
  `ligneSecondaire` varchar(255) DEFAULT NULL,
  `pays` varchar(255) DEFAULT NULL,
  `ville` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `adresse`
--

INSERT INTO `adresse` (`id`, `codePostal`, `lignePrincipale`, `ligneSecondaire`, `pays`, `ville`) VALUES
(1, '75001', '01 Rue Raymond Losserand', ' 2eme Etage gauche', 'France', 'Paris'),
(2, '75001', '02 Rue Raymond Losserand', ' 1eme Etage gauche', 'France', 'Paris'),
(3, '75001', '03 Rue Raymond Losserand', ' 2eme Etage gauche', 'France', 'Paris'),
(4, '75001', '04 Rue Raymond Losserand', ' 7eme Etage gauche', 'France', 'Paris'),
(5, '75001', '05 Rue Raymond Losserand', ' 3eme Etage droite', 'France', 'Paris');

-- --------------------------------------------------------

--
-- Structure de la table `cartebleue`
--

CREATE TABLE `cartebleue` (
  `id` int(11) NOT NULL,
  `dateExpiration` date DEFAULT NULL,
  `numCarte` int(11) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `cartebleue`
--

INSERT INTO `cartebleue` (`id`, `dateExpiration`, `numCarte`, `type`) VALUES
(1, '2020-07-01', 2147483647, 'VISA_ELECTRON'),
(2, '2020-07-02', 2147483647, 'VISA_PREMIER'),
(3, '2020-07-03', 2147483647, 'VISA_ELECTRON'),
(4, '2020-07-04', 2147483647, 'VISA_ELECTRON'),
(5, '2020-07-05', 2147483647, 'VISA_PREMIER');

-- --------------------------------------------------------

--
-- Structure de la table `chequier`
--

CREATE TABLE `chequier` (
  `id` int(11) NOT NULL,
  `dateEnvoi` date DEFAULT NULL,
  `dateReception` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

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
-- Structure de la table `client`
--

CREATE TABLE `client` (
  `id` int(11) NOT NULL,
  `dateNaissance` date DEFAULT NULL,
  `nom` varchar(255) DEFAULT NULL,
  `numClient` int(11) DEFAULT NULL,
  `prenom` varchar(255) DEFAULT NULL,
  `id_adresse` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `client`
--

INSERT INTO `client` (`id`, `dateNaissance`, `nom`, `numClient`, `prenom`, `id_adresse`) VALUES
(1, '1985-04-01', 'LOLO', 2018001, 'Lamine', 3),
(2, '1985-04-02', 'ZOZO', 2018002, 'Zidane', 1),
(3, '1985-04-03', 'FOFO', 2018003, 'Fabien', 5),
(4, '1985-04-04', 'SOSO', 2018004, 'Steven', 2),
(5, '1985-04-05', 'NINA', 2018005, 'Nathalie', 4);

-- --------------------------------------------------------

--
-- Structure de la table `compte`
--

CREATE TABLE `compte` (
  `id` int(11) NOT NULL,
  `dateOuverture` date DEFAULT NULL,
  `libelle` varchar(255) DEFAULT NULL,
  `numCompte` int(11) DEFAULT NULL,
  `solde` double DEFAULT NULL,
  `id_carte` int(11) DEFAULT NULL,
  `id_chequier` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `compte`
--

INSERT INTO `compte` (`id`, `dateOuverture`, `libelle`, `numCompte`, `solde`, `id_carte`, `id_chequier`) VALUES
(1, '2018-01-01', 'COMPTE_COURANT', 2147483647, 7520, 2, 3),
(2, '2018-01-02', 'COMPTE_COURANT', 2147483647, 75, 3, 4),
(3, '2018-01-03', 'COMPTE_COURANT', 2147483647, 52, 4, 5),
(4, '2018-01-04', 'COMPTE_EPARGNE', 2147483647, 75209, NULL, 1),
(5, '2018-01-05', 'COMPTE_COURANT', 2147483647, 752094, 1, 2);

-- --------------------------------------------------------

--
-- Structure de la table `compte_client`
--

CREATE TABLE `compte_client` (
  `id_client` int(11) DEFAULT NULL,
  `id_compte` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

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

--
-- Index pour la table `adresse`
--
ALTER TABLE `adresse`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `cartebleue`
--
ALTER TABLE `cartebleue`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `chequier`
--
ALTER TABLE `chequier`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `client`
--
ALTER TABLE `client`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK8odebyncp0w80y5o946hwq2lb` (`id_adresse`);

--
-- Index pour la table `compte`
--
ALTER TABLE `compte`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK4tndwc5efb19gbk276q5vx57g` (`id_carte`),
  ADD KEY `FKcer4ke9g7p89xihpv775pmbrw` (`id_chequier`);

--
-- Index pour la table `compte_client`
--
ALTER TABLE `compte_client`
  ADD PRIMARY KEY (`id_compte`),
  ADD KEY `FKau7h9lujpibyp7vkgijfi097e` (`id_client`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `adresse`
--
ALTER TABLE `adresse`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT pour la table `cartebleue`
--
ALTER TABLE `cartebleue`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT pour la table `chequier`
--
ALTER TABLE `chequier`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT pour la table `client`
--
ALTER TABLE `client`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT pour la table `compte`
--
ALTER TABLE `compte`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `client`
--
ALTER TABLE `client`
  ADD CONSTRAINT `FK8odebyncp0w80y5o946hwq2lb` FOREIGN KEY (`id_adresse`) REFERENCES `adresse` (`id`);

--
-- Contraintes pour la table `compte`
--
ALTER TABLE `compte`
  ADD CONSTRAINT `FK4tndwc5efb19gbk276q5vx57g` FOREIGN KEY (`id_carte`) REFERENCES `cartebleue` (`id`),
  ADD CONSTRAINT `FKcer4ke9g7p89xihpv775pmbrw` FOREIGN KEY (`id_chequier`) REFERENCES `chequier` (`id`);

--
-- Contraintes pour la table `compte_client`
--
ALTER TABLE `compte_client`
  ADD CONSTRAINT `FK2dn9p21s6845hwhl1h8rqe95w` FOREIGN KEY (`id_compte`) REFERENCES `compte` (`id`),
  ADD CONSTRAINT `FKau7h9lujpibyp7vkgijfi097e` FOREIGN KEY (`id_client`) REFERENCES `client` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
