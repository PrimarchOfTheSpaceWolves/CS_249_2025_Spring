package edu.realemj.exercises02;

public class NPC {
    private int health = 100;
    private String name = "";

    public NPC() {}

    public NPC(String n) {
        name = n;
    }

    public NPC(String n, int h) {
        name = n;
        //health = h;
        setHealth(h);
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int h) {
        h = Math.max(0, h);
        health = h;
    }

}
