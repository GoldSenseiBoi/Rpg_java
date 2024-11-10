package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.example.armes.Axe;
import com.example.armes.Bow;
import com.example.armes.Club;
import com.example.armes.Crossbow;
import com.example.armes.Dagger;
import com.example.armes.Hammer;
import com.example.armes.Mace;
import com.example.armes.Spear;
import com.example.armes.Staff;
import com.example.armes.Sword;
import com.example.armes.Weapon;

public class WeaponStore {
    private List<Weapon> weapons;

    public WeaponStore() {
        weapons = new ArrayList<>();
        weapons.add(new Sword());
        weapons.add(new Spear());
        weapons.add(new Bow());
        weapons.add(new Hammer());
        weapons.add(new Axe());
        weapons.add(new Dagger());
        weapons.add(new Club());
        weapons.add(new Mace());
        weapons.add(new Staff());
        weapons.add(new Crossbow());
    }

    public void displayWeapons() {
        System.out.println("Bienvenue au magasin d'armes ! Voici ce que nous avons :");
        for (int i = 0; i < weapons.size(); i++) {
            System.out.print((i + 1) + ". ");
            weapons.get(i).displayInfo();
        }
    }

    public void buyWeapon(Player player) {
        Scanner scanner = new Scanner(System.in);
        displayWeapons();
        System.out.println("Choisissez une arme à acheter (entrez le numéro) : ");
        int choice = scanner.nextInt();

        if (choice > 0 && choice <= weapons.size()) {
            Weapon selectedWeapon = weapons.get(choice - 1);
            System.out.println("Vous avez acheté : " + selectedWeapon.getName());
            // Ici, on pourrait éventuellement déduire l'argent du joueur.
        } else {
            System.out.println("Choix invalide !");
        }
    }
}

