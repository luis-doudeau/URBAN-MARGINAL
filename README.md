# URBAN-MARGINAL
 

## À propos du jeu
Urban Marginal est un jeu de combat multijoueur en 2D développé en Java. Dans ce jeu, les joueurs se retrouvent dans un espace de jeu carré de taille réduite, où ils peuvent choisir leur personnage pour combattre d'autres joueurs présents sur le même serveur. Fonctionnalités
Graphismes en 2D: Profitez d'un environnement urbain rendu en 2D pour des combats rapides et stratégiques.
Choix de Personnage: Sélectionnez parmi différents personnages, chacun avec ses propres compétences.
Combat Multijoueur en Espace Restreint: Affrontez d'autres joueurs dans un espace de jeu compact, rendant les combats plus intenses.
Système de Vie: Démarrez avec 10 vies et usez de stratégie pour survivre.
Interface Simple et Intuitive: Profitez d'une expérience de jeu fluide grâce à une interface utilisateur facile à comprendre.

## Configuration Requise
Java 8 ou supérieur.
Vous pouvez également modifier l'apparence du jeu en modifiant les textures et certaines constantes.
Vous trouverez les textures dans le dossier média.
Pour les constantes globales, telles que les ports, les chemins d'accès aux fichiers média, et les tailles des éléments du jeu, sont modifiables dans le fichier Global.java.

## Installation et Lancement
Clonez le projet GitHub à l'adresse : [https://github.com/luis-doudeau/URBAN-MARGINAL](https://github.com/luis-doudeau/URBAN-MARGINAL.git).
Ouvrez le dossier URBAN-MARGINAL dans votre environnement de développement Java.
Compilez le projet : javac -d bin -sourcepath UrbanMarginal/src UrbanMarginal/src/**/*.java
Lancez le projet depuis le dossier src.
Avec la commande suivante : java -cp bin/ urbanmarginal.UrbanMarginal

## Comment Jouer
Vous devez au lancement du jeu choisir de démarrer un serveur pour pouvoir y connecter les clients.
Ensuite, une fois qu'un serveur est lancé, vous pouvez le rejoindre en tant que client, vous aurez besoin de saisir l'adresse IP du serveur pour vous y connecter.
Choisissez votre personnage.
Vous pouvez vous déplacer avec les flèches du clavier et attaquer les autres joueurs avec la touche espace.
Surveillez votre jauge de vie et celle des adversaires.

## Paradigmes de Conception
1. Architecture MVC (Modèle/Vue/Contrôleur)
L'architecture MVC est au cœur de la conception du projet Urban Marginal. Elle divise l'application en trois composants principaux :
Modèle : Représente les données et la logique métier de l'application. Les modifications apportées au modèle sont reflétées dans la vue.

Vue : Gère l'interface utilisateur et l'affichage des données. Elle reflète l'état actuel du modèle.

Contrôleur : Gère les interactions de l'utilisateur et les actions à effectuer en réponse. Il met à jour le modèle et la vue en conséquence.

L'utilisation efficace de l'architecture MVC facilite la séparation des préoccupations et rend le code plus évolutif.
2. Modèles de Conception
Outre l'architecture MVC, le projet Urban Marginal utilise d'autres modèles de conception pour résoudre des problèmes spécifiques. Parmi les modèles de conception couramment utilisés, on trouve :
Singleton : Utilisé pour garantir qu'une classe n'a qu'une seule instance.

Observateur : Permet aux objets d'observer les changements d'état d'un autre objet et d'y réagir.

Stratégie : Permet de définir une famille d'algorithmes, de les encapsuler et de les rendre interchangeables.

Factory Method : Utilisé pour créer des objets sans spécifier explicitement leur classe, ce qui favorise la flexibilité.

## Liste des technologies :
Java
Modèle-Vue-Contrôleur (MVC)
Swing (Bibliothèque graphique pour Java, utilisée pour construire des interfaces graphiques interactives)
JUnit (Framework de test unitaire pour Java)
Sockets (Permet la communication réseau entre machines en Java)
GitHub (Plateforme de gestion de développement collaboratif et de contrôle de version basée sur Git)

## Contributors : 
DOUDEAU Luis
DE NARDI Lenny
JORY Jonathan
Groupe 31A
