package chars;

import java.util.ArrayList;

public class Crossbowman extends Ranged {
    public Crossbowman(ArrayList<UnitBase> heroesList, int x, int y) {
        super("Crossbowman", 12, 10, new int[]{8, 10}, 15, 4, 16, x, y);
    }

    @Override
    public String getInfo() {return "Арбалетчик " + '\t' + super.getInfo() + "        ";}
}