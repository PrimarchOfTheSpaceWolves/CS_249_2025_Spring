package edu.realemj.exercises02;

public class Wasteland {
    public static void main(String [] args) {
        System.out.println("WELCOME TO THE SURFACE.");

        NPC bob = new NPC();

        bob.setName("Bob Robertson");
        System.out.println(bob.getName());
        bob.setName("Robert");
        System.out.println(bob.getName());

        bob.setHealth(-200000);

        System.out.println("Bob's health: " + bob.getHealth());

        NPC sue = new NPC("Susan");
        System.out.println(sue.getName());

        NPC harold = new NPC("Harold", -200);


    }
}
