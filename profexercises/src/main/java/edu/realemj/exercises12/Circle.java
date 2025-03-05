package edu.realemj.exercises12;

import edu.realemj.exercises09.Matrix;

public class Circle extends Shape {
    private double radius = 1.0;

    public Circle() {}
    public Circle(double radius) {
        setRadius(radius);
    }

    public Circle(double radius, Matrix pos, boolean filled) {
        setRadius(radius);
        setPos(pos);
        //setFilled(filled);
        this.filled = filled;
    }

    public double getRadius() { return radius; }
    public void setRadius(double radius) { this.radius = radius; }
}
