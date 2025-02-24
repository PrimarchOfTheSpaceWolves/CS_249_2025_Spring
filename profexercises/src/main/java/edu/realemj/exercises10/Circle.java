package edu.realemj.exercises10;

import edu.realemj.exercises09.Matrix;

public class Circle {
    private double radius = 1.0;
    //private int x, y;
    //private int [] pos;
    private Matrix pos = Matrix.makePoint2D(0,0);

    boolean filled = true;

    public Circle() {}

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, Matrix pos) {
        this.radius = radius;
        this.pos = new Matrix(pos);
    }

}
