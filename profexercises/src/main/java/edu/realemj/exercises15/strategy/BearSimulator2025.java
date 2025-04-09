package edu.realemj.exercises15.strategy;

public class BearSimulator2025 {
    public static void main(String [] args) {
        Bear griz = new GrizzlyBear();
        Bear pooh = new TeddyBear();

        griz.performMove();
        pooh.performMove();
        pooh.setMoveBehavior(new MoveWithTwoLegs());
        pooh.performMove();

    }
}
