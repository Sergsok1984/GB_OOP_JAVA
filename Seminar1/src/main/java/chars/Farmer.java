package chars;

import java.util.ArrayList;

public class Farmer extends UnitBase {
    int supply;

    public Farmer(ArrayList<UnitBase> heroesList, int x, int y) {
        super("Farmer", 1, 1, new int[]{1, 1}, 1, 3, x, y);
        this.supply = 1;
    }

    @Override
    public String toString() {
        return super.toString() + ", Supply";
    }


    @Override
    public String getInfo() {
        return "Крестьянин " + '\t' + super.getInfo() + "        ";
    }
}