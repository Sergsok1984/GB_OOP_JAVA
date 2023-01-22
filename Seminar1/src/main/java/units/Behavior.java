package units;

import java.util.ArrayList;

public interface Behavior {
    void step(ArrayList<BaseHero> heroesList);

    String getInfo();
}


