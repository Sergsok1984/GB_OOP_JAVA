package chars;

import java.util.ArrayList;
import java.util.Random;

public abstract class UnitBase implements Behavior, Comparable<UnitBase> {
    protected String role;


    //    protected String name;
    protected int attack, defence, health, maxHealth, speed;
    protected int[] damage;
    protected Vector2 position;

    public UnitBase(String role, int attack, int defence, int[] damage, int health, int speed, int x, int y) {


        this.position = new Vector2(x, y);
//        this.name = name;
        this.role = role;
        this.attack = attack;
        this.defence = defence;
        this.damage = damage;
        this.maxHealth = health;
        this.health = maxHealth - new Random().nextInt(maxHealth);
        this.speed = speed;

    }

    @Override
    public void step(ArrayList<UnitBase> heroesList) {
    }

    @Override
    public String getHealthInfo() {
        return role + " " + (health * 100 / maxHealth) + " " + "%";
    }

    public String getRole() {
        return role;
    }

//    public String getName() {
//        return name;
//    }

    public Vector2 getPosition() {
        return position;
    }

    //    @Override
//    public String toString() {
//        return "Name: " + name + ", Role: " + role + ", Attack: " + attack + ", Defence: " + defence + ", Damage: " + Arrays.toString(damage) + ", Health: " + health + ", Speed: " + speed;
//    }
    public String getInfo() {
        return String.format("⚔ %d\t\uD83D\uDEE1 %d\t♥%d\t☠%d\t\uD83C\uDFC3%d", attack, defence, health, (damage[0] + damage[1]) / 2, speed);

    }

    @Override
    public int compareTo(UnitBase hero) {
        return (hero.getClass().equals(Farmer.class)) ? -1 : 0;
    }
}