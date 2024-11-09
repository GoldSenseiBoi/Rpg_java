package devoir.cours.armes;


public class Mace extends Weapon {
    public Mace() {
        super("Masse", 11, 17);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(
                "    _\n" +
                "  /   \\\n" +
                " (_____)   \n" +
                "   |||\n" +
                "   |||\n" +
                "   |||\n" +
                "   |||");
    }
}

