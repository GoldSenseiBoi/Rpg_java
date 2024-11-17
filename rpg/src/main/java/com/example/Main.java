package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenue dans le RPG Hawkaria !");

        // Création du joueur
        System.out.print("Entrez le nom de votre personnage : ");
        String playerName = scanner.nextLine();
        Player player = new Player(playerName, "Guerrier");

        // Création du magasin d'armes
        WeaponStore weaponStore = new WeaponStore();

        // Visiter le magasin
        boolean shopping = true;
        while (shopping) {
            System.out.println("\nSouhaitez-vous visiter le magasin d'armes avant de partir à l'aventure ? (oui/non)");
            String visitStore = scanner.nextLine();
            if (visitStore.equalsIgnoreCase("oui")) {
                weaponStore.buyWeapon(player);
            } else {
                shopping = false;
            }
        }

        // Création de la carte du donjon
        DungeonMap dungeonMap = new DungeonMap(10, 20); // Créer une carte plus grande

        // Boucle principale du jeu
        boolean playing = true;
        while (playing && player.isAlive()) {
            dungeonMap.displayMap();
            System.out.println("\nUtilisez Z (haut), Q (gauche), S (bas), D (droite), ou T pour quitter : ");
            char command = scanner.nextLine().toLowerCase().charAt(0);

            switch (command) {
                case 'z':
                    dungeonMap.movePlayer("haut", player);
                    break;
                case 's':
                    dungeonMap.movePlayer("bas", player);
                    break;
                case 'q':
                    dungeonMap.movePlayer("gauche", player);
                    break;
                case 'd':
                    dungeonMap.movePlayer("droite", player);
                    break;
                case 't':
                    playing = false;
                    System.out.println("Vous avez quitté le donjon.");
                    break;
                default:
                    System.out.println("Commande invalide ! Utilisez Z, Q, S, D ou T.");
                    break;
            }

            if (dungeonMap.hasEncounteredMonster()) {
                Monster monster = dungeonMap.getCurrentMonster();
                CombatSystem.combat(player, monster);
                if (!monster.isAlive()) {
                    dungeonMap.clearCurrentMonster();
                }
            }

            if (dungeonMap.hasReachedExit()) {
                System.out.println("Félicitations ! Vous avez trouvé la sortie du donjon et gagné le jeu !");
                break;
            }
        }

        System.out.println("Merci d'avoir joué au RPG Hawkaria !");
    }
}
