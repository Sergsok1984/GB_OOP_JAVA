package chars;

import java.util.ArrayList;

public class Monk extends Healers {
    public Monk(ArrayList<UnitBase> heroesList, int x, int y) {
        super("Monk", 12, 7, new int[]{-4, -4}, 30, 5, 1, x, y);
    }
    @Override
    public String getInfo() {return "Монах " + '\t' + super.getInfo() + "        ";}
}

