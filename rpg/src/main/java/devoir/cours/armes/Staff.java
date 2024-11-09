package devoir.cours.armes;


public class Staff extends Weapon {
    public Staff() {
        super("Bâton", 5, 7);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(
                "    ()\n" +
                "    ||\n" +
                "    ||\n" +
                "    ||\n" +
                "    ||\n" +
                "    ||");
    }
}

