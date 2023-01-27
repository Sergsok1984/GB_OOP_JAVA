package chars;

import java.util.ArrayList;

public class Spearman extends Melee {
    public Spearman(ArrayList<UnitBase> heroesList, int x, int y){
        super("Spearman", 4, 5, new int[] {1, 3}, 10, 4, x, y);
    }
    @Override
    public String getInfo() {
        return "Копейщик " + '\t' + super.getInfo() + "        ";
    }
}
