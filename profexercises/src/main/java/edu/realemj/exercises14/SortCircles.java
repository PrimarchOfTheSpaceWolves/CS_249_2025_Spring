package edu.realemj.exercises14;

import edu.realemj.exercises12.Circle;
import java.util.*;
public class SortCircles {
    public static void main(String [] args) {
        try {
            Circle[] allCircles = new Circle[3];
            allCircles[0] = new Circle(5.0);
            allCircles[1] = new Circle(3.0);
            allCircles[2] = new Circle(4.0);
            Arrays.sort(allCircles);

            for(Circle c: allCircles) {
                System.out.println(c);
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }

    }
}
