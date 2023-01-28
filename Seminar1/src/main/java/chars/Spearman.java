package chars;

import java.util.ArrayList;

public class Spearman extends Melee {
    public Spearman(ArrayList<UnitBase> gang, String name, int x, int y) {
        super(gang, name, "Spearman", 4, 5, new int[]{1, 3}, 10, 4, x, y);
    }

    @Override
    public String getInfo() {
        return name + '\t' + "Копейщик " + '\t' + super.getInfo() + "        ";
    }
}
