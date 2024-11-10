package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenue dans le RPG Text-Based !");

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
        DungeonMap dungeonMap = new DungeonMap(5, 5);

        // Boucle principale du jeu
        boolean playing = true;
        while (playing && player.isAlive()) {
            dungeonMap.displayMap();
            System.out.println("\nQue voulez-vous faire ? (haut/bas/gauche/droite/inventaire/quitter)");
            String action = scanner.nextLine();

            switch (action.toLowerCase()) {
                case "haut":
                case "bas":
                case "gauche":
                case "droite":
                    dungeonMap.movePlayer(action, player);
                    if (dungeonMap.hasEncounteredMonster()) {
                        Monster monster = dungeonMap.getCurrentMonster();
                        CombatSystem.combat(player, monster);
                        if (!monster.isAlive()) {
                            dungeonMap.clearCurrentMonster();
                        }
                    }
                    break;
                case "inventaire":
                    player.displayInventory();
                    break;
                case "quitter":
                    playing = false;
                    break;
                default:
                    System.out.println("Action invalide !");
                    break;
            }

            if (dungeonMap.hasReachedExit()) {
                System.out.println("Félicitations ! Vous avez trouvé la sortie du donjon et gagné le jeu !");
                break;
            }
        }

        System.out.println("Merci d'avoir joué au RPG Text-Based !");
    }
}
