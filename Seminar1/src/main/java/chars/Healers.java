package chars;

import java.util.ArrayList;

public class Healers extends UnitBase {
    int mana;

    public Healers(ArrayList<UnitBase> gang, String name, String role, int attack, int defence, int[] damage, int health, int speed, int mana, int x, int y) {
        super(gang, name, role, attack, defence, damage, health, speed, x, y);
        this.mana = mana;
    }

    @Override
    public String toString() {
        return super.toString() + ", Mana ";
    }

    @Override
    public void step(ArrayList<UnitBase> heroesList) {
        if (health == 0) {
            return;
        }
        int minHealth = 100;
        int minIndex = 0;
        for (int i = 0; i < gang.size(); i++) {
            if (gang.get(i).getHealthInfo() == 0)
            {
                continue;
            }
            if (gang.get(i).getHealthInfo() < 100) {
                int temp = gang.get(i).getHealthInfo();
                if (temp < minHealth) {
                    minHealth = temp;
                    minIndex = i;
                }
            }
        }
        if ((gang.get(minIndex).health - damage[0]) > gang.get(minIndex).maxHealth) {
            gang.get(minIndex).health = gang.get(minIndex).maxHealth;
        } else {
            gang.get(minIndex).health -= damage[0];
        }
    }
}
