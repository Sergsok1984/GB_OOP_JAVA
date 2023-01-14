public class Healers extends BaseHero {
    int mana;

    public Healers(String role, String name, int attack, int defence, int[] damage, int health, int speed, int mana) {
        super(role, name, attack, defence, damage, health, speed);
        this.mana = mana;
    }

    @Override
    public String toString() {
        return super.toString() + ", Mana ";
    }
}
