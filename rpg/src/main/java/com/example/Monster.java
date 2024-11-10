package com.example;
public class Monster {
    private String name;
    private int health;
    private int damage;

    public Monster(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) health = 0;
        System.out.println(name + " a subi " + damage + " points de dégâts. Vie restante: " + health);
    }

    public void attack(Player player) {
        System.out.println(name + " attaque " + player.getName() + " et inflige " + damage + " points de dégâts.");
        player.takeDamage(damage);
    }

    public boolean isAlive() {
        return health > 0;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public int getHealth() {
        return health;
    }
}

