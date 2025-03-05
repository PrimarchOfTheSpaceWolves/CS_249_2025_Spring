package edu.realemj.exercises12;

import edu.realemj.exercises09.Matrix;

public class ShapeLand {
    public static void main(String [] args) {
        Shape s1 = new Shape();
        Shape s2 = new Shape(Matrix.makePoint2D(5,-7), false);

        Circle c1 = new Circle();
        c1.setFilled(false);
        System.out.println(c1.getPos());

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(c1);
    }
}
