package chars;

import java.util.ArrayList;

public class Mage extends Healers {
    public Mage(ArrayList<UnitBase> gang, String name, int x, int y) {
        super(gang, name, "Mage", 17, 12, new int[]{-5, -5}, 30, 9, 1, x, y);
    }

    @Override
    public String getInfo() {
        return name + '\t' + "Маг        " + '\t' + super.getInfo() + "\uD83E\uDE84" + mana + "         ";
    }

}
