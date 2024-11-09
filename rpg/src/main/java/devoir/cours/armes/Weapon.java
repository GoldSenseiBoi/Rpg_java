package devoir.cours.armes;


public class Weapon {
    private String name;
    private int damage;
    private int price;

    public Weapon(String name, int damage, int price) {
        this.name = name;
        this.damage = damage;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public int getPrice() {
        return price;
    }

    public void displayInfo() {
        System.out.println("Nom: " + name + ", Dégâts: " + damage + ", Prix: " + price);
    }
}