package chars;

import java.util.ArrayList;

public class Farmer extends UnitBase {
    boolean supply;

    public Farmer(ArrayList<UnitBase> gang, String name, int x, int y) {
        super(gang, name, "Farmer", 1, 1, new int[]{1, 1}, 1, 3, x, y);
        this.supply = true;
    }

    public void step(ArrayList<UnitBase> heroesList) {
        supply = true;
    }

    @Override
    public String toString() {
        return super.toString() + ", Supply";
    }


    @Override
    public String getInfo() {
        return name + '\t' + "Крестьянин " + '\t' + super.getInfo() + "           ";
    }
}