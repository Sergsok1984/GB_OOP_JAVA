package chars;

import java.util.ArrayList;

public class Rogue extends Melee {
    public Rogue(ArrayList<UnitBase> heroesList, int x, int y) {
        super("Rogue", 8, 3, new int[]{2, 4}, 10, 6, x, y);
    }
    @Override
    public String getInfo() {
        return "Разбойник " + '\t' + super.getInfo() + "        ";
    }
}