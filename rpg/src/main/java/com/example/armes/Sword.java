package com.example.armes;

public class Sword extends Weapon {
    public Sword() {
        super("Épée", 12, 20);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(
                "    />\n" +
                "   /<\n" +
                "  /<\n" +
                " /<\n" +
                " ||\n" +
                " ||\n" +
                " ||\n" +
                " ||\n" +
                " ||\n" +
                "/__\\");
    }
}

