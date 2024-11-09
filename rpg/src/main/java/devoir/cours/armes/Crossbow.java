package devoir.cours.armes;


public class Crossbow extends Weapon {
    public Crossbow() {
        super("Arbalète", 14, 22);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(
                "    _______\n" +
                "   / _____ \\\n" +
                "  //       \\\\\n" +
                " ||  ____   ||\n" +
                "  \\\\_____  //\n" +
                "   \\______/ ");
    }
}

