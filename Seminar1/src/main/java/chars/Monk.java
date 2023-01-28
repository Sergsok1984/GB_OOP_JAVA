package chars;

import java.util.ArrayList;

public class Monk extends Healers {
    public Monk(ArrayList<UnitBase> gang, String name, int x, int y) {
        super(gang, name, "Monk", 12, 7, new int[]{-4, -4}, 30, 5, 1, x, y);
    }

    @Override
    public String getInfo() {
        return name + '\t' + "Монах    " + '\t' + super.getInfo() + "\uD83E\uDE84" + mana + "        ";
    }
}

