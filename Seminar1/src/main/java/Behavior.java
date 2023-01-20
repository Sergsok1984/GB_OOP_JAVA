import java.util.ArrayList;

public interface Behavior {
    void step(ArrayList<BaseHero> heroesList, BaseHero hero);

    String getInfo();
}


