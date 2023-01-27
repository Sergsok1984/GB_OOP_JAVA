package chars;

import java.util.ArrayList;

public class Mage extends Healers {
    public Mage(ArrayList<UnitBase> heroesList, int x, int y) {
        super("Mage", 17, 12, new int[]{-5, -5}, 30, 9, 1, x, y);
    }
    @Override
    public String getInfo() {
        return "Маг " + '\t' + super.getInfo() + "        ";
    }

}
