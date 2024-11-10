package com.example.armes;


public class Spear extends Weapon {
    public Spear() {
        super("Lance", 10, 15);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(
                "    /\n" +
                "   /\\\n" +
                "  /__\\\n" +
                "   ||\n" +
                "   ||\n" +
                "   ||\n" +
                "   ||\n" +
                "   ||\n" +
                "   ||");
    }
}

