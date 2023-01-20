import java.security.SecureRandom;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<BaseHero> heroesTeamOne = new ArrayList<>();
        ArrayList<BaseHero> heroesTeamTwo = new ArrayList<>();
        getHeroes(heroesTeamOne, 10, 1);
        getHeroes(heroesTeamTwo, 10, 2);
        heroesTeamOne.forEach(n -> System.out.print(n.getInfo() + ", "));
        heroesTeamOne.forEach(n -> n.step(heroesTeamOne, n));
    }

    private static void getHeroes(ArrayList<BaseHero> heroesList, int count, int mode) {
        var random = new SecureRandom();

        for (int i = 0; i < count; i++) {
            var name = "Player_" + (i + 1);
            if (mode == 1) {
                switch (random.nextInt(4)) {
                    case 0 -> heroesList.add(new Farmer(name));
                    case 1 -> heroesList.add(new Rogue(name));
                    case 2 -> heroesList.add(new Sniper(name));
                    case 3 -> heroesList.add(new Mage(name));
                }

            } else {
                switch (random.nextInt(4)) {
                    case 0 -> heroesList.add(new Crossbowman(name));
                    case 1 -> heroesList.add(new Monk(name));
                    case 2 -> heroesList.add(new Spearman(name));
                    case 3 -> heroesList.add(new Farmer(name));
                }
            }
        }
    }
}

