package com.example;

// === Classe CombatSystem (CombatSystem.java) ===
import java.util.Scanner;

public class CombatSystem {
    public static void combat(Player player, Monster monster) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nVous avez rencontré un " + monster.getName() + "!");

        while (player.isAlive() && monster.isAlive()) {
            System.out.println("\nQue voulez-vous faire ?");
            System.out.println("1. Attaquer");
            System.out.println("2. Fuir");
            System.out.print("Votre choix: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                player.attack(monster);
                if (monster.isAlive()) {
                    monster.attack(player);
                } else {
                    System.out.println("Vous avez vaincu " + monster.getName() + " !");
                    player.addXp(20);
                    System.out.println("Vous gagnez 20 XP !");
                }
            } else if (choice == 2) {
                System.out.println("Vous avez décidé de fuir !");
                break;
            } else {
                System.out.println("Choix invalide !");
            }
        }

        if (!player.isAlive()) {
            System.out.println("Vous êtes mort ! Le jeu est terminé.");
        } else if (!monster.isAlive()) {
            System.out.println("Vous avez survécu au combat !");
        }
    }
}
