package edu.realemj.exercises09;

public class MathLand {
    public static void main(String [] args) {
        Matrix I = Matrix.makeIdentity(4);
        System.out.println(I);

        Matrix v = Matrix.makePoint2D(8, 3);
        System.out.println(v);

        Matrix T = Matrix.makeTranslation2D(5,-7);
        System.out.println(T);


    }
}
