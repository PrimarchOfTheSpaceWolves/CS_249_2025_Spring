package edu.realemj.exercises12;

import edu.realemj.exercises09.Matrix;

public class Shape {
    private Matrix pos = Matrix.makePoint2D(0,0);
    protected boolean filled = true;

    public Shape() {
    }

    public Shape(Matrix pos, boolean filled) {
        setPos(pos);
        setFilled(filled);
    }

    public Matrix getPos() {
        return new Matrix(pos);
    }

    public void setPos(Matrix pos) {
        this.pos = new Matrix(pos);
    }

    public boolean isFilled() { return filled; }
    public void setFilled(boolean filled) { this.filled = filled; }

    public String toString() {
        return "[(Shape) pos=" + pos.toPoint2DString()
                + ",filled=" + filled + "]";
    }

    public double getArea() {
        return 0;
    }
}
