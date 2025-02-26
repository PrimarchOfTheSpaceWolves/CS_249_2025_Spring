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
        this(radius, Matrix.makePoint2D(0,0));
        //this.radius = radius;
    }

    public Circle(double radius, Matrix pos) {
        this(radius, pos, true);
        //this.radius = radius;
        //this.pos = new Matrix(pos);
    }

    public Circle(double radius, Matrix pos, boolean filled) {
        //this.radius = radius;
        setRadius(radius);
        this.pos = new Matrix(pos);
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public Matrix getPos() {
        return new Matrix(pos);
    }

    public void setRadius(double radius) {
        if(radius >= 0.0) {
            this.radius = radius;
        }
    }

    public void setPos(Matrix pos) {
        this.pos = new Matrix(pos);
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString() {
        return "[r=" + radius
                + ",pos=" + pos.toPoint2DString()
                + ",filled=" + filled + "]";
    }

}
