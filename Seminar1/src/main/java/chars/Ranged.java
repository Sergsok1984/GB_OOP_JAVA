package chars;

import java.util.ArrayList;

public class Ranged extends UnitBase {
    int shoots;

    public Ranged(ArrayList<UnitBase> gang, String name, String role, int attack, int defence, int[] damage, int health, int speed, int shoots, int x, int y) {
        super(gang, name, role, attack, defence, damage, health, speed, x, y);
        this.shoots = shoots;
    }

    @Override
    public void step(ArrayList<UnitBase> heroesList) {
        for (UnitBase unitBase : gang) {
            if (unitBase.getRole().equals("Farmer")) {
                if (((Farmer) unitBase).supply > 0) {
                    ((Farmer) unitBase).supply -= 1;
//                    System.out.println();
//                    System.out.println(this.getName() + " " + this.getRole() + " сделал 1 выстрел");
//                    System.out.println("Осталось выстрелов: " + shoots);
                    return;
                }
            }
        }
        shoots -= 1;
//        System.out.println();
//        System.out.println(this.getName() + " " + this.getRole() + " сделал 1 выстрел");
//        System.out.println("Осталось выстрелов: " + shoots);
    }


    @Override
    public String toString() {
        return super.toString() + ", Shoots: " + shoots;
    }
}