# Urban Marginal

## À propos du jeu

Urban Marginal est un jeu de combat multijoueur en 2D développé en Java. Dans ce jeu, les joueurs se retrouvent dans un espace de jeu carré de taille réduite, où ils peuvent choisir leur personnage pour combattre d'autres joueurs présents sur le même serveur.
Fonctionnalités

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

    Vous devez au lencement du jeu choissir de démarrer un serveur pour pouvoir y connecter les clients.
    Ensuite, une fois qu'un serveur est lancé, vous pouvez le rejoindre en tant que client, vous aurez besoin de saisir l'adresse IP du serveur pour vous y connecter.
    Choisissez votre personnage.
    Vous pouvez vous déplacer avec les fleches du clavier et attaquer les autres joueurs avec la touche espace.
    Surveillez votre jauge de vie et celle des adversaires.


