package chars;

import java.util.ArrayList;

public class Rogue extends Melee {
    public Rogue(ArrayList<UnitBase> gang, String name, int x, int y) {
        super(gang, name, "Rogue", 8, 3, new int[]{2, 4}, 10, 6, x, y);
    }

    @Override
    public String getInfo() {
        return name + '\t' + "Разбойник " + '\t' + super.getInfo() + "           ";
    }
}