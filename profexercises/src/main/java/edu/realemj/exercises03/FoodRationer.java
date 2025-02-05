package edu.realemj.exercises03;

import java.util.Scanner;

public class FoodRationer {
    public static void main(String [] args) {

        System.out.println("" + 4 + 5 + " dogs");

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
