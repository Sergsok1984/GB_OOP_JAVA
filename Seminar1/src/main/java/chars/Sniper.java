package chars;

import java.util.ArrayList;

public class Sniper extends Ranged {
    public Sniper(ArrayList<UnitBase> heroesList, int x, int y) {
        super("Sniper", 12, 10, new int[]{8, 10}, 15, 9, 32, x, y);
    }

    @Override
    public String getInfo() {
        return "Снайпер " + '\t' + super.getInfo() + "        ";
    }
}
