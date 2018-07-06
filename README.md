# ===================================================

# Bienvenue sur ProxiBanqueV3-El Sisi-Kheznadji-Vallette
* Date : 06/07/2018
* Créateurs : Kamir El Sisi & Mohammed KHEZNADJI & Arnauld VALLETTE 

# Lancement de l'application

## Pré-requis :

* Avoir télécharger TomCat 8.5.31
* Avoir télécharger Maven
* Avoir télécharger le fichier **proxybankV3-elsisi-kheznadji-vallette.war**

## Procédure d'installation :

* Récupérer **proxibanquejpa.sql** à la racine du dossier du projet
* créer une BDD **proxibanquejpa** MySQL en encodage UTF8 moteur InnoDB
* déployer une première fois l'application sur TomCat, le schéma de BDD sera créé automatiquement.
* importer le fichier proxibanquejpa.sql dans la BDD
* Consulter le navigateur: localhost:8080/proxibanquev3/

# Exemple d'utilisation
### 1- Une fois l'application lancée, vous pouvez consulter des comptes :
Lamine ou Lamine LOLO - Zidane ou Zidane ZOZO

### 2- Une fois connecté vous pouvez consulter le solde des différents comptes de ce client

### 3- Vous pouvez effectuer des opérations retrait argent, carte bancaire ou chequier
    * test de retrait CB possible sur le compte client Lamine sur le compte courant ayant un solde de plus de 750000 €.
    * test de retrait CHEQUIER possible sur le compte courant ayant un solde de 842€.
    
### 4- Vous pouvez vous deconnecter pour tester un autre compte client.

# ===================================================
