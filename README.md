
# 🗡️ RPG Hawkaria 🎲

Bienvenue dans le **RPG Hawkaria** ! Un jeu d'aventure interactif où vous affrontez des monstres, trouvez des potions et atteignez la sortie pour remporter la victoire. 🏆

---

## 🎮 Comment jouer ?

1. **Déplacement** :
   - Utilisez les touches :
     - `Z` pour **monter** ⬆️
     - `S` pour **descendre** ⬇️
     - `Q` pour **aller à gauche** ⬅️
     - `D` pour **aller à droite** ➡️

2. **Actions possibles** :
   - **Affrontez les monstres** 🐉 qui apparaissent sur votre chemin.
   - **Récupérez des potions magiques** 🧪 pour soigner votre personnage.

3. **Objectif** :
   - Trouvez la sortie (`E`) pour gagner la partie ! 🚪

---

## 📜 Histoire

Vous êtes un **guerrier intrépide** 🛡️ perdu dans un donjon mystérieux. Votre mission est simple :
- Échapper au donjon
- Survivre aux monstres redoutables comme les **Gobelins**, les **Ogres**, et les **Dragons** 🐲.

Seules votre bravoure et votre stratégie vous permettront de triompher.

---

## ⚔️ Éléments du jeu

- **Carte du donjon** :
  - `P` : Votre position actuelle 🧍
  - `G`, `O`, `D` : Des monstres (Gobelin, Ogre, Dragon) 🐉
  - `H` : Potion magique 🧪
  - `E` : La sortie du donjon 🚪
  - `.` : Terrain vide

---

## 🛠️ Instructions pour exécuter le jeu

1. **Téléchargez le projet** :
   - Assurez-vous d'avoir tous les fichiers du projet.

2. **Importez le projet dans un IDE Java** :
   - Exemple : IntelliJ IDEA, Eclipse, ou VS Code.

3. **Compilez et exécutez le fichier `Main.java`** :
   - Le jeu commencera automatiquement dans la console.

4. **Amusez-vous bien !** 🎉

---

## 🧑‍💻 Structure du projet et description des fichiers

### Fichiers principaux :
- **`Main.java`** :  
  Le point d'entrée du jeu. Il initialise le joueur, la carte du donjon et contrôle la boucle principale du jeu où le joueur peut se déplacer et interagir avec l'environnement.

- **`DungeonMap.java`** :  
  Gère la carte du donjon. Ce fichier s'occupe de :  
  - Générer la carte aléatoire.  
  - Gérer la position du joueur.  
  - Afficher la carte dans la console.  
  - Placer les monstres, potions, et la sortie.

- **`Player.java`** :  
  Représente le personnage du joueur. Ce fichier définit les propriétés du joueur comme :  
  - Santé.  
  - Mana.  
  - XP et or.  
  - Inventaire des armes.  
  Il contient aussi des méthodes pour attaquer les monstres et récupérer des potions.

- **`Monster.java`** :  
  Définit les monstres présents sur la carte. Chaque monstre possède :  
  - Un nom (Gobelin, Ogre, Dragon).  
  - Des points de vie.  
  - Une capacité d'attaque.  
  Les interactions avec les monstres sont gérées dans ce fichier.

- **`CombatSystem.java`** :  
  Gère les combats entre le joueur et les monstres. Ce fichier inclut :  
  - Les attaques du joueur.  
  - Les ripostes des monstres.  
  - La vérification de la santé des participants après chaque tour.

- **`WeaponStore.java`** :  
  Permet au joueur d'acheter des armes avant d'entrer dans le donjon.

### Dossier d'armes (`armes`) :
- **`Weapon.java`** : Classe mère pour toutes les armes.  
- Sous-classes spécifiques :  
  - `Axe.java` 🪓 : Définit une hache comme arme.  
  - `Bow.java` 🏹 : Définit un arc comme arme.  
  - `Club.java` 🪵 : Définit une massue.  
  - `Crossbow.java` : Définit une arbalète.  
  - `Dagger.java` 🗡️ : Définit une dague.  
  - `Hammer.java` 🔨 : Définit un marteau.  
  - `Mace.java` : Définit une masse d'armes.  
  - `Spear.java` : Définit une lance.  
  - `Staff.java` : Définit un bâton magique.  
  - `Sword.java` ⚔️ : Définit une épée.

---

## 🌟 Auteur

Créé par : **GoldSenseiBoi**  
Un jeu Java textuel pour les amateurs de RPG ! 🎮
