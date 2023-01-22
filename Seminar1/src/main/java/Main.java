import units.*;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<BaseHero> heroesTeamOne = new ArrayList<>();
        ArrayList<BaseHero> heroesTeamTwo = new ArrayList<>();
        getHeroes(heroesTeamOne, 10, 1);
//        getHeroes(heroesTeamTwo, 10, 2);
        while (true) {
            System.out.println();
            System.out.println("Баланс здоровья игроков:");
            heroesTeamOne.forEach(n -> System.out.println(n.getInfo() + ", "));
            System.out.println();
            heroesTeamOne.forEach(n -> n.step(heroesTeamOne));
            scanner.nextLine();
        }
    }

    private static void getHeroes(ArrayList<BaseHero> heroesList, int count, int mode) {
        var random = new SecureRandom();
        if (mode == 1) {
            System.out.println("Состав первой команды:");
            for (int i = 0; i < count; i++) {
                var name = "Player_" + (i + 1);
                switch (random.nextInt(4)) {
                    case 0 -> heroesList.add(new Farmer(name));
                    case 1 -> heroesList.add(new Rogue(name));
                    case 2 -> heroesList.add(new Sniper(name));
                    case 3 -> heroesList.add(new Mage(name));
                }
            }
        } else {
            System.out.println("Состав второй команды:");
            for (int i = 0; i < count; i++) {
                var name = "Player_" + (i + 11);
                switch (random.nextInt(4)) {
                    case 0 -> heroesList.add(new Crossbowman(name));
                    case 1 -> heroesList.add(new Monk(name));
                    case 2 -> heroesList.add(new Spearman(name));
                    case 3 -> heroesList.add(new Farmer(name));
                }
            }
        }
        Collections.sort(heroesList);
        for (BaseHero o : heroesList)
            System.out.println(o);
    }
}



