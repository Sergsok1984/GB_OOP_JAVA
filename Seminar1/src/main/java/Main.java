import chars.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static final int GANG_SIZE = 10;
    public static ArrayList<UnitBase> whiteSide;
    public static ArrayList<UnitBase> darkSide;

    public static void main(String[] args) {
        init();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            ConsoleView.view();
            whiteSide.forEach(n -> n.step(darkSide));
            darkSide.forEach(n -> n.step(whiteSide));
            scanner.nextLine();
        }
    }

    private static void init() {
        whiteSide = new ArrayList<>();
        darkSide = new ArrayList<>();

        int x = 1;
        int y = 1;
        for (int i = 0; i < GANG_SIZE; i++) {
            var name = "Player_" + (i + 1);
            switch (new Random().nextInt(4)) {
                case 0 -> whiteSide.add(new Farmer(whiteSide, name, x, y++));
                case 1 -> whiteSide.add(new Rogue(whiteSide, name, x, y++));
                case 2 -> whiteSide.add(new Sniper(whiteSide, name, x, y++));
                default -> whiteSide.add(new Monk(whiteSide, name, x, y++));
            }
        }
        y = 1;
        Collections.sort(whiteSide);
        for (UnitBase o : whiteSide) {
            o.setPosition(new Vector2(x, y++));
        }


        x = GANG_SIZE;
        y = 1;
        for (int i = 0; i < GANG_SIZE; i++) {
            var name = "Player_" + (i + 11);
            switch (new Random().nextInt(4)) {
                case 0 -> darkSide.add(new Farmer(darkSide, name, x, y++));
                case 1 -> darkSide.add(new Spearman(darkSide, name, x, y++));
                case 2 -> darkSide.add(new Crossbowman(darkSide, name, x, y++));
                default -> darkSide.add(new Mage(darkSide, name, x, y++));
            }
        }
        y = 1;
        Collections.sort(darkSide);
        for (UnitBase o : darkSide) {
            o.setPosition(new Vector2(x, y++));
        }
    }
}



