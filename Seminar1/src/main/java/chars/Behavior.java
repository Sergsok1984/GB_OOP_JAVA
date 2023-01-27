package chars;

import java.util.ArrayList;

public interface Behavior {
    void step(ArrayList<UnitBase> heroesList);

    String getInfo();

    String getHealthInfo();
}


