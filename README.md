# proxybankv3

# ===================================================

# Bienvenue sur ProxiBanqueV3-El Sisi-Kheznadji-Vallette
* Date : 06/07/2018
* Créateurs : Kamir El Sisi & Mohammed KHEZNADJI & Arnauld VALLETTE 

# Lancement de l'application

## Pré-requis : 
* Avoir télécharger TomCat 8.5.31
* Avoir télécharger Maven
* Avoir télécharger le fichier proxybankV2-mk-av.war

## Procédure d'installation :
* Récupérer proxyb.sql dans le dossier src/main/scripts
* créer une BDD "proxyb" MySQL en encodage UTF8 moteur InnoDB
* importer le fichier proxyb.sql
* Metrre le fichier .war dans le dossier webapps  
* Consulter le navigateur: localhost:8080/proxyb
# Fonctionnalitées présentes
* s'authentifier à l'application en saisant un login et un password valides.
* Consulter l'ensemble des clients d'un conseiller
* Pouvoir mettre à jour un client en modifiant ses informations: nom,prénom,email,adresse
* Consulter la liste des comptes disponibles d'un client : courant et épargne
# Fonctionnalitées en cours de développement de cette version
* Effectuer un virement entre deux comptes
* Page des erreurs
* Déconnexion de l'utilisateur
# Exemple d'utilisation
### 1- Une fois l'application lancée, identifiez vous avec l'un des 2 logins  et passwords:
* login 1: arnoV, password: password 
* ou login 2: momoK,  password: password
### 2- Vous pouvez consulter la liste des clients en accédant à la "base de donnée client"
### 3- Vous pouvez modifier les fiches clients "éditer les fiches client"
### 4- Vous pouvez connsulter les comptes de chaque client.

# ===================================================
