

INSERT INTO `adresse` (`id`, `codePostal`, `lignePrincipale`, `ligneSecondaire`, `pays`, `ville`) VALUES
(1, '75001', '01 Rue Raymond Losserand', ' 2eme Etage gauche', 'France', 'Paris'),
(2, '75001', '02 Rue Raymond Losserand', ' 1eme Etage gauche', 'France', 'Paris'),
(3, '75001', '03 Rue Raymond Losserand', ' 2eme Etage gauche', 'France', 'Paris'),
(4, '75001', '04 Rue Raymond Losserand', ' 7eme Etage gauche', 'France', 'Paris'),
(5, '75001', '05 Rue Raymond Losserand', ' 3eme Etage droite', 'France', 'Paris');



INSERT INTO `cartebleue` (`id`, `dateExpiration`, `numCarte`, `type`) VALUES
(1, '2020-07-01', 2147483647, 'Visa electron'),
(2, '2020-07-02', 2147483647, 'Visa premier'),
(3, '2020-07-03', 2147483647, 'Visa electron'),
(4, '2020-07-04', 2147483647, 'Visa electron'),
(5, '2020-07-05', 2147483647, 'Visa premier');


INSERT INTO `chequier` (`id`, `dateEnvoi`, `dateReception`) VALUES
(1, '2018-07-01', '2018-07-03'),
(2, '2018-07-02', '2018-07-04'),
(3, '2018-07-03', '2018-07-05'),
(4, '2018-07-04', '2018-07-06'),
(5, '2018-07-05', '2018-07-07');



INSERT INTO `client` (`id`, `dateNaissance`, `nom`, `numClient`, `prenom`, `id_adresse`) VALUES
(1, '1985-04-01', 'LOLO', 2018001, 'Lamine', 3),
(2, '1985-04-02', 'ZOZO', 2018002, 'Zidane', 1),
(3, '1985-04-03', 'FOFO', 2018003, 'Fabien', 5),
(4, '1985-04-04', 'SOSO', 2018004, 'Steven', 2),
(5, '1985-04-05', 'NINA', 2018005, 'Nathalie', 4);



INSERT INTO `compte` (`id`, `dateOuverture`, `libelle`, `numCompte`, `solde`, `id_carte`, `id_chequier`) VALUES
(1, '2018-01-01', 'compte courant', 2147483647, 7520, 2, 3),
(2, '2018-01-02', 'compte courant', 2147483647, 75, 3, 4),
(3, '2018-01-03', 'compte courant', 2147483647, 752, 4, 5),
(4, '2018-01-04', 'compte épargne', 2147483647, 75209, 5, 1),
(5, '2018-01-05', 'compte courant', 2147483647, 752094, 1, 2);



INSERT INTO `compte_client` (`id_client`, `id_compte`) VALUES
(1, 3),
(2, 5),
(3, 2),
(4, 1),
(5, 4);

