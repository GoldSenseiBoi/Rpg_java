package com.example;

// === Classe Player (Player.java) ===
import java.util.ArrayList;
import java.util.List;

import com.example.armes.Weapon;


public class Player {
    private String name;
    private String caste;
    private int health;
    private int mana;
    private int xp;
    private int gold;
    private List<Weapon> inventory;

    public Player(String name, String caste) {
        this.name = name;
        this.caste = caste;
        this.health = 100;
        this.mana = 50;
        this.xp = 0;
        this.gold = 100; // Le joueur commence avec 100 pièces d'or
        this.inventory = new ArrayList<>();
    }

    public void addWeaponToInventory(Weapon weapon) {
        inventory.add(weapon);
    }

    public void displayInventory() {
        System.out.println("Inventaire de " + name + " :");
        for (Weapon weapon : inventory) {
            weapon.displayInfo();
        }
        System.out.println("Or: " + gold);
        System.out.println("XP: " + xp);
        System.out.println("Mana: " + mana);
        System.out.println("Vie: " + health);
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) health = 0;
        System.out.println(name + " a subi " + damage + " points de dégâts. Vie restante: " + health);
    }

    public void attack(Monster monster) {
        int damage = 15; // Par défaut, chaque attaque inflige 15 points de dégâts
        System.out.println(name + " attaque " + monster.getName() + " et inflige " + damage + " points de dégâts.");
        monster.takeDamage(damage);
    }

    public int getHealth() {
        return health;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public void addXp(int amount) {
        xp += amount;
    }

    public String getName() {
        return name;
    }

    public int getGold() {
        return gold;
    }

    public void reduceGold(int amount) {
        gold -= amount;
    }

    public void increaseHealth(int amount) {
        health += amount;
        System.out.println(name + " récupère " + amount + " points de vie. Santé actuelle : " + health);
    }
}