package chars;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class UnitBase implements Behavior, Comparable<UnitBase> {
    protected String role;
    protected ArrayList<UnitBase> gang;


    protected String name;
    protected int attack, defence, health, maxHealth, speed;
    protected int[] damage;
    protected Vector2 position;

    public UnitBase(ArrayList<UnitBase> gang, String name, String role, int attack, int defence, int[] damage, int health, int speed, int x, int y) {

        this.gang = gang;
        this.name = name;
        this.role = role;
        this.attack = attack;
        this.defence = defence;
        this.damage = damage;
        this.maxHealth = health;
        this.health = maxHealth;
        this.speed = speed;
        this.position = new Vector2(x, y);
    }

    @Override
    public void step(ArrayList<UnitBase> heroesList) {
    }

    @Override
    public int getHealthInfo() {
        return health * 100 / maxHealth;
    }

    public String getName() {
        return role;
    }

    public void setPos(Vector2 position) {
        this.position = position;
    }

    public Vector2 getPosition() {
        return position;
    }

    public void setPosition(int x, int y) {
        this.position = new Vector2(x, y);
    }


    //    @Override
    public String toString() {
        return "Name: " + name + ", Role: " + role + ", Attack: " + attack + ", Defence: " + defence + ", Damage: " + Arrays.toString(damage) + ", Health: " + health + ", Speed: " + speed;
    }

    public String getInfo() {
        return String.format("⚔%3d\t\uD83D\uDEE1%3d\t♥%3d\t☠%3d\t\uD83C\uDFC3%3d\t", attack, defence, health, (damage[0] + damage[1]) / 2, speed);

    }

    protected void getDamage(float attackPower) {
        this.health -= attackPower;
        if (this.health < 0) {
            this.health = 0;
        } else if (this.health > maxHealth) {
            this.health = maxHealth;
        }
    }

    protected Vector2 getTarget(ArrayList<UnitBase> heroesList) {
        float minDistance = 100;
        int minIndex = 0;
        for (int i = 0; i < heroesList.size(); i++) {
            float temp = getPosition().getDistance(heroesList.get(0).getPosition().x, heroesList.get(0).getPosition().y);
            if (temp < minDistance && heroesList.get(i).health > 0) {
                minDistance = temp;
                minIndex = i;
            }
        }
        return new Vector2((int) minDistance, minIndex);
    }

    public float getHeroHealth() {
        return health;
    }

    @Override
    public int compareTo(UnitBase hero) {
        return (hero.getClass().equals(Farmer.class)) ? -1 : 0;
    }
}