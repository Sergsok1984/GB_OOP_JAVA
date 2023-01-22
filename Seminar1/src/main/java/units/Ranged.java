package units;

import java.util.ArrayList;

public class Ranged extends BaseHero {
    int shoots;

    public Ranged(String name, String role, int attack, int defence, int[] damage, int health, int speed, int shoots) {
        super(name, role, attack, defence, damage, health, speed);
        this.shoots = shoots;
    }

    @Override
    public void step(ArrayList<BaseHero> heroesList) {
        for (BaseHero baseHero : heroesList) {
            if (baseHero.getRole().equals("Farmer")) {
                if (((Farmer) baseHero).supply > 0) {
                    ((Farmer) baseHero).supply -= 1;
                    System.out.println();
                    System.out.println(this.getName() + " " + this.getRole() + " сделал 1 выстрел");
                    System.out.println("Осталось выстрелов: " + shoots);
                    return;
                }
            }
        }
        shoots -= 1;
        System.out.println();
        System.out.println(this.getName() + " " + this.getRole() + " сделал 1 выстрел");
        System.out.println("Осталось выстрелов: " + shoots);
    }


    @Override
    public String toString() {
        return super.toString() + ", Shoots: " + shoots;
    }
}