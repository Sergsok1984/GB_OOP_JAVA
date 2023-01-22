package units;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public abstract class BaseHero implements Behavior, Comparable<BaseHero> {
    public String role;
    protected String name;
    protected int attack, defence, health, maxHealth, speed;
    protected int[] damage;

    public BaseHero(String name, String role, int attack, int defence, int[] damage, int health, int speed) {

        this.name = name;
        this.role = role;
        this.attack = attack;
        this.defence = defence;
        this.damage = damage;
        this.maxHealth = health;
        this.health = maxHealth - new Random().nextInt(maxHealth);
        this.speed = speed;
    }

    @Override
    public void step(ArrayList<BaseHero> heroList) {}

    @Override
    public String getInfo() {
        return name + " " + role + " " + (health * 100 / maxHealth) + " " + "%";
    }

    public String getRole() {
        return role;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Role: " + role + ", Attack: " + attack + ", Defence: " + defence + ", Damage: " + Arrays.toString(damage) + ", Health: " + health + ", Speed: " + speed;
    }

    @Override
    public int compareTo(BaseHero hero) {return (hero.getClass().equals(Farmer.class)) ? - 1 : 0;}
}