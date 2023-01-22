package units;

import java.util.ArrayList;

public class Healers extends BaseHero {
    int mana;

    public Healers(String name, String role, int attack, int defence, int[] damage, int health, int speed, int mana) {
        super(name, role, attack, defence, damage, health, speed);
        this.mana = mana;
    }

    @Override
    public String toString() {return super.toString() + ", Mana ";}

    @Override
    public void step(ArrayList<BaseHero> heroesList) {
        int minHealth = 100;
        int minIndex = 0;
        for (int i = 0; i < heroesList.size(); i++) {
            String[] params = heroesList.get(i).getInfo().split(" ");
            if (Integer.parseInt(params[2]) < 100) {
                int temp = Integer.parseInt(params[2]);
                if (temp < minHealth) {
                    minHealth = temp;
                    minIndex = i;
                }
            }
        }
        if ((heroesList.get(minIndex).health - damage[0]) > heroesList.get(minIndex).maxHealth) {
            heroesList.get(minIndex).health = heroesList.get(minIndex).maxHealth;
        } else {heroesList.get(minIndex).health -= damage[0];}
        System.out.println("\nВылечен:\n" + heroesList.get(minIndex));
    }
}
