package chars;


import java.util.ArrayList;
import java.util.Random;

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
        int index = getIndexMinHealth(gang);
        if (gang.get(index).health == 0) {
            switch (new Random().nextInt(4)) {
                case (0) ->
                        gang.set(index, new Mage(gang, getName(), gang.get(index).position.x, gang.get(index).position.y));
                case (1) ->
                        gang.set(index, new Rogue(gang, getName(), gang.get(index).position.x, gang.get(index).position.y));
                case (2) ->
                        gang.set(index, new Farmer(gang, getName(), gang.get(index).position.x, gang.get(index).position.y));
                case (3) ->
                        gang.set(index, new Sniper(gang, getName(), gang.get(index).position.x, gang.get(index).position.y));
            }

        }

        if ((gang.get(index).health - damage[0]) > gang.get(index).maxHealth) {
            gang.get(index).health = gang.get(index).maxHealth;
        } else {
            gang.get(index).health -= damage[0];
        }
    }
}

