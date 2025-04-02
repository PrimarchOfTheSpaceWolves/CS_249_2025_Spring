package edu.realemj.exercises12;

import edu.realemj.exercises09.Matrix;
import edu.realemj.exercises13.InvalidRadiusException;

import java.util.*;

public class ShapeLand {
    public static void printShape(Shape s) {
        System.out.println("*********************************");
        System.out.println(s.toString());
        System.out.println("AREA: " + s.getArea());

        if(s instanceof Circle c) {
            //Circle c = (Circle) s;
            System.out.println("Radius: " + c.getRadius());
        }
        System.out.println("*********************************");
    }
    public static void main(String [] args) {
        Shape s1 = new Shape();
        Shape s2 = new Shape(Matrix.makePoint2D(5,-7), false);

        //Circle c2 = new Circle(Matrix.makePoint2D(5,-7), false);

        Circle c1 = new Circle();
        c1.setFilled(false);
        System.out.println(c1.getPos());

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(c1);

        printShape(s2);
        printShape(c1);

        ArrayList<Circle> circleList = new ArrayList<>();

        try {
            circleList.add(new Circle(6.3));
            circleList.add(new Circle(-9.0));
            circleList.add(new Circle(2.3));
        }
        catch(InvalidRadiusException e) {
            System.err.println("Wrong radius!");
            System.err.println(e.getMessage());
        }

        System.out.println("MY CIRCLES:");
        for(Circle c: circleList) {
            System.out.println(c);
        }
    }
}
