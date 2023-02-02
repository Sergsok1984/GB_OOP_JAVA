package chars;

import java.util.ArrayList;
import java.util.Random;

public class Melee extends UnitBase {
    public Melee(ArrayList<UnitBase> gang, String name, String role, int attack, int defence, int[] damage, int health, int speed, int x, int y) {
        super(gang, name, role, attack, defence, damage, health, speed, x, y);
    }

    @Override
    public void step(ArrayList<UnitBase> heroesList) {
        if (health == 0) {
            return;
        }
        Vector2 target = getTarget(heroesList);
        if (target.x == 100) {
            return;
        }
        int targetX = heroesList.get(target.y).getPosition().x;
        int targetY = heroesList.get(target.y).getPosition().y;
        boolean targetLeft = targetX < getPosition().x;
        boolean targetRight = targetX > getPosition().x;
        boolean targetUp = targetY > getPosition().y;
        boolean targetDown = targetY < getPosition().y;
        float attackPower = new Random().nextInt(damage[0], damage[1] + 1);

        if (target.x < 2) {
            heroesList.get(target.y).getDamage(attackPower);
        } else if (targetRight) {
            setPosition(++getPosition().x, getPosition().y);
        } else if (targetLeft) {
            setPosition(--getPosition().x, getPosition().y);
        } else if (targetX == getPosition().x) {
            if (targetUp) {
                setPosition(getPosition().x, ++getPosition().y);
            } else if (targetDown) {
                setPosition(getPosition().x, --getPosition().y);
            }
        }
    }
}