package chars;

import java.util.ArrayList;

public class Melee extends UnitBase {
    public Melee(ArrayList<UnitBase> gang, String name, String role, int attack, int defence, int[] damage, int health, int speed, int x, int y) {
        super(gang, name, role, attack, defence, damage, health, speed, x, y);
    }
}