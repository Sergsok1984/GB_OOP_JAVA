import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<BaseHero> heroes = new ArrayList<>();
        getHeroes(heroes, 50);
        chooseHero(heroes, "Sniper");
    }

    private static void getHeroes(ArrayList<BaseHero> heroesList, int count) {
        var random = new SecureRandom();
        var listNames = List.of("Андрей", "Сергей", "Петр", "Александр", "Алексей",
                "Игорь", "Валентин", "Владимир", "Артем", "Роман", "Илья", "Игорь", "Денис", "Иван", "Константин");

        for (int i = 0; i < count; i++) {
            var randomName = listNames.get(random.nextInt(listNames.size()));
            switch (random.nextInt(7)) {
                case 0 -> heroesList.add(new Crossbowman(randomName));
                case 1 -> heroesList.add(new Farmer(randomName));
                case 2 -> heroesList.add(new Mage(randomName));
                case 3 -> heroesList.add(new Monk(randomName));
                case 4 -> heroesList.add(new Rogue(randomName));
                case 5 -> heroesList.add(new Sniper(randomName));
                case 6 -> heroesList.add(new Spearman(randomName));
            }

        }
        System.out.println("Список всех персонажей:" + heroesList.toString().replaceAll("^\\[|]$", ""));
    }

    private static void chooseHero(ArrayList<BaseHero> heroesList, String role) {
        System.out.printf("Список персонажей %s:", role);
        for (BaseHero hero : heroesList) {
            if (hero.toString().contains(role)) {
                System.out.print(hero);
            }
        }
    }
}