package edu.realemj.exercises03;

import java.util.*;

public class FoodRationer {
    public static void main(String [] args) {

        System.out.println("" + 4 + 5 + " dogs");

        long seed = 42;
        Random r1 = new Random(seed);
        Random r2 = new Random(seed);

        for(int i = 0; i < 5; i++) {
            int i1 = r1.nextInt();
            int i2 = r2.nextInt();
            System.out.println(i1 + " " + i2);
        }

        Scanner input = new Scanner(System.in);

        System.out.println("Enter total food:");
        double totalFood = input.nextDouble();
        System.out.println("Enter party count:");
        int partyCnt = input.nextInt();
        System.out.println("Enter rations:");
        int rations = input.nextInt();

        int foodPerDay = partyCnt*rations;
        int daysLeft = (int)(totalFood/foodPerDay);

        System.out.println("Day left: " + daysLeft);

        input.close();
    }
}
