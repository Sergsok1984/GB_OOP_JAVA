package chars;

import java.util.ArrayList;

public class Healers extends UnitBase {
    int mana;

    public Healers(String role, int attack, int defence, int[] damage, int health, int speed, int mana, int x, int y) {
        super(role, attack, defence, damage, health, speed, x, y);
        this.mana = mana;
    }

    @Override
    public String toString() {return super.toString() + ", Mana ";}

    @Override
    public void step(ArrayList<UnitBase> heroesList) {
        int minHealth = 100;
        int minIndex = 0;
        for (int i = 0; i < heroesList.size(); i++) {
            String[] params = heroesList.get(i).getHealthInfo().split(" ");
            if (Integer.parseInt(params[1]) < 100) {
                int temp = Integer.parseInt(params[1]);
                if (temp < minHealth) {
                    minHealth = temp;
                    minIndex = i;
                }
            }
        }
        if ((heroesList.get(minIndex).health - damage[0]) > heroesList.get(minIndex).maxHealth) {
            heroesList.get(minIndex).health = heroesList.get(minIndex).maxHealth;
        } else {heroesList.get(minIndex).health -= damage[0];}
    }
}
