package edu.realemj.exercises15.strategy;

public abstract class Bear {
    protected Moveable moveBehavior;

    protected Bear(Moveable moveBehavior) {
        this.moveBehavior = moveBehavior;
    }

    public void performMove() {
        moveBehavior.move();
    }

    public void setMoveBehavior(Moveable m) {
        moveBehavior = m;
    }
}
