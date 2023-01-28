package chars;

import java.util.ArrayList;

public class Sniper extends Ranged {
    public Sniper(ArrayList<UnitBase> gang, String name, int x, int y) {
        super(gang, name, "Sniper", 12, 10, new int[]{8, 10}, 15, 9, 32, x, y);
    }

    @Override
    public String getInfo() {
        return name + '\t' + "Снайпер " + '\t' + super.getInfo() + "🏹" + shoots + "       ";
    }
}
