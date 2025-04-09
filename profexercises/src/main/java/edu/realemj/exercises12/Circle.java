package edu.realemj.exercises12;

import edu.realemj.exercises09.Matrix;
import edu.realemj.exercises13.InvalidRadiusException;
import edu.realemj.exercises14.*;

public class Circle extends Shape implements Comparable<Circle>, Drawable, Loadable {
    private double radius = 1.0;

    public Circle() {
        // super();
    }
    public Circle(double radius) throws InvalidRadiusException {
        setRadius(radius);
    }

    public Circle(double radius, Matrix pos, boolean filled)
        throws InvalidRadiusException {

        super(pos, filled);
        setRadius(radius);
        //setPos(pos);
        //setFilled(filled);
        //this.filled = filled;
    }

    public double getRadius() { return radius; }
    public void setRadius(double radius) throws InvalidRadiusException {
        if(radius < 0.0) {
            throw new InvalidRadiusException("Bad radius: " + radius);
        }

        this.radius = radius;
    }

    @Override
    public String toString() {

        return "[(Circle) radius=" + radius + " " + super.toString() + "]";
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public boolean equals(Object other) {
        if(other instanceof Circle cother) {
            return Math.abs(this.radius - cother.radius) < 1e-6;
        }
        else {
            return false;
        }
    }

    public int compareTo(Circle other) {
        if (this.equals(other)) {
            return 0;
        }
        else if(this.radius < other.radius) {
            return -1;
        }
        else {
            return +1;
        }
    }

    public void draw() {
        System.out.println("DRAW A CIRCLE");
    }

    public void load(String filename) {}
    public void save(String filename) {}
}
