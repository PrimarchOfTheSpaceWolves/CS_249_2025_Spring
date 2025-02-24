package edu.realemj.exercises09;

import edu.realemj.exercises10.*;
public class MathLand {
    public static void main(String [] args) {
        Matrix I = Matrix.makeIdentity(4);
        System.out.println(I);

        Matrix v = Matrix.makePoint2D(8, 3);
        System.out.println(v);

        Matrix T = Matrix.makeTranslation2D(5,-7);
        System.out.println(T);

        Matrix A = Matrix.makeTranslation2D(2, 3);

        T = T.multiply(A);

        Matrix r = T.multiply(v);
        System.out.println(r);

        Matrix p = Matrix.makePoint2D(5,7);
        Circle c = new Circle(2.3, p);
        p.set(0,0,12);

    }
}
