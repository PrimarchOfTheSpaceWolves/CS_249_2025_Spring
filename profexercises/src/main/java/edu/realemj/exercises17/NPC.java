package edu.realemj.exercises17;

public class NPC {
    private String name = "";
    private int age = 0;

    public NPC() {}
    public NPC(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
