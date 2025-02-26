package edu.realemj.oregon;

public class Person {
    private String name;
    private boolean alive = true;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAlive() {
        return alive;
    }

    public void kill() {
        alive = false;
    }

    public String toString() {
        String s = name;
        if(!alive) {
            s += " (Deceased)";
        }
        return s;
    }
}
