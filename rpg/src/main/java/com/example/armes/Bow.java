package com.example.armes;


public class Bow extends Weapon {
    public Bow() {
        super("Arc", 7, 10);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(
                "   )\n" +
                "  /\\\n" +
                " /__\\\n" +
                " \\  /\n" +
                "  \\/\n" +
                "   )");
    }
}

