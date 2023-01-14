public class Farmer extends BaseHero {
    int supply;

    public Farmer(String role, String name, int attack, int defence, int[] damage, int health, int speed, int supply) {
        super(role, name, attack, defence, damage, health, speed);
        this.supply = supply;
    }

    public Farmer(String name) {
        super("Farmer", name, 1, 1, new int[]{1, 1}, 1, 3);
        this.supply = 1;
    }

    @Override
    public String toString() {
        return super.toString() + ", Supply";
    }
}