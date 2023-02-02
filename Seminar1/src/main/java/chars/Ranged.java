package chars;

import java.util.ArrayList;

public class Ranged extends UnitBase {
    int shoots;

    public Ranged(ArrayList<UnitBase> gang, String name, String role, int attack, int defence, int[] damage, int health, int speed, int shoots, int x, int y) {
        super(gang, name, role, attack, defence, damage, health, speed, x, y);
        this.shoots = shoots;
    }

    @Override
    public void step(ArrayList<UnitBase> heroesList) {
        if (health == 0) {
            return;
        }
        Vector2 target = getTarget(heroesList);
        float constMin = 12;
        float constMax = 4;

        float attackPower;
        if (target.x <= constMax) {
            attackPower = damage[1];
        } else if (target.x >= constMin) {
            attackPower = damage[0];
        } else {
            attackPower = damage[0] + ((target.x - constMax) / (constMin - constMax)) * (damage[1] - damage[0]);
        }

        boolean doShoot = true;
        for (UnitBase unitBase : gang) {
            if (unitBase.getName().equals("Farmer")) {
                if (((Farmer) unitBase).supply) {
                    heroesList.get(target.y).getDamage(attackPower);
                    ((Farmer) unitBase).supply = false;
                    doShoot = false;
                    break;
                }
            }
        }
        if (doShoot) {
            if (shoots > 0) {
                heroesList.get(target.y).getDamage(attackPower);
            }
        }
    }


    @Override
    public String toString() {
        return super.toString() + ", Shoots: " + shoots;
    }
}
