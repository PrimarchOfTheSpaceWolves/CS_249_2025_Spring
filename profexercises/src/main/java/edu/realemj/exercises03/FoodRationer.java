package edu.realemj.exercises03;

public class FoodRationer {
    public static void main(String [] args) {
        double totalFood = 100;
        int partyCnt = 5;
        int rations = 2;

        int foodPerDay = partyCnt*rations;
        int daysLeft = (int)(totalFood/foodPerDay);

        System.out.println("Day left: " + daysLeft);
    }
}
