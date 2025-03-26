package edu.realemj.exercises12;

import edu.realemj.exercises09.Matrix;

public class Circle extends Shape {
    private double radius = 1.0;

    public Circle() {
        // super();
    }
    public Circle(double radius) {
        setRadius(radius);
    }

    public Circle(double radius, Matrix pos, boolean filled) {
        super(pos, filled);
        setRadius(radius);
        //setPos(pos);
        //setFilled(filled);
        //this.filled = filled;
    }

    public double getRadius() { return radius; }
    public void setRadius(double radius) { this.radius = radius; }

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
}
