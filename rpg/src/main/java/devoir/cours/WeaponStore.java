package devoir.cours;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import devoir.cours.armes.Axe;
import devoir.cours.armes.Bow;
import devoir.cours.armes.Club;
import devoir.cours.armes.Crossbow;
import devoir.cours.armes.Dagger;
import devoir.cours.armes.Hammer;
import devoir.cours.armes.Mace;
import devoir.cours.armes.Spear;
import devoir.cours.armes.Staff;
import devoir.cours.armes.Sword;
import devoir.cours.armes.Weapon;

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

    public void buyWeapon() {
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

