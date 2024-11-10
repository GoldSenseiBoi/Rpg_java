package com.example.armes;


public class Axe extends Weapon {
    public Axe() {
        super("Hache", 10, 15);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(
                "  ,  /\\  .\n" +
                " //`-||-'\\\\\n" +
                "(| -=||=- |)\n" +
                " \\\\,-||-.//\n" +
                "  `  ||  '\n" +
                "     ||\n" +
                "     ||\n" +
                "     XX\n" +
                "     XX");
    }
}

