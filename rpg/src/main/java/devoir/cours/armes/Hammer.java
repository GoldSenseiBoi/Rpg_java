package devoir.cours.armes;


public class Hammer extends Weapon {
    public Hammer() {
        super("Marteau", 8, 12);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(
                "  ______\n" +
                " /      \\\n" +
                "|        |\n" +
                " \\______/\n" +
                "   ||||\n" +
                "   ||||\n" +
                "   ||||\n" +
                "   ||||\n" +
                "  ======");
    }
}

