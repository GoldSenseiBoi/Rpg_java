package devoir.cours.armes;


public class Dagger extends Weapon {
    public Dagger() {
        super("Dague", 6, 8);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(
                "  |\n" +
                " / \\\n" +
                "/___\\\n" +
                "\\   /\n" +
                " \\ /\n" +
                "  |");
    }
}

