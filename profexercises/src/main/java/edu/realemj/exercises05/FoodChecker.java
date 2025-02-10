package edu.realemj.exercises05;

public class FoodChecker {
    public static void main(String [] args) {
        int totalFood = 100;

        boolean isStarving = (totalFood <= 0);

        while(!isStarving) {
            totalFood--;
            System.out.println("TOTAL FOOD: " + totalFood);
            isStarving = (totalFood <= 0);
        }
    }
}
