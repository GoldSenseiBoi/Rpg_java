package com.example.armes;

public class Club extends Weapon {
    public Club() {
        super("Massue", 9, 13);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(
                "   _______\n" +
                "  /       \\\n" +
                " |         |\n" +
                " \\_________/\n" +
                "     |||\n" +
                "     |||\n" +
                "     |||\n" +
                "     |||");
    }
}

