package edu.realemj.oregon;

import java.util.*;
public class GeneralStore {

    public void enterStore(Scanner input, Supplies supplies) {
        printGreeting();
        boolean isDone = false;

        do {
            printStock();
            String line = getUserInput(input);
            isDone = processUserPurchase(line, supplies);
            System.out.println(supplies);
        }while(!isDone);

        printGoodbye();
    }

    private void printGreeting() {
        System.out.println("Welcome to Dr. Do-While's Store!");
    }

    private void printStock() {
        System.out.println("Current stock:");
        System.out.println("- Food");
    }

    private String getUserInput(Scanner input) {
        System.out.println("What do you want to buy/sell?");
        return input.nextLine();
    }

    private boolean processUserPurchase(String line, Supplies supplies) {
        // Format: <cnt> <item>
        // Parse line
        Scanner lineParse = new Scanner(line);
        int cnt = lineParse.nextInt();
        String item = lineParse.next();
        item = item.toLowerCase();

        if(cnt == 0) {
            System.out.println("Nothing to your tastes, eh?");
            return true;
        }

        // Figure out which item needs to be updated
        boolean isDone = false;

        switch(item) {
            case "food" -> {
                double current = supplies.getTotalFood();
                current += cnt;
                if(current >= 0) {
                    supplies.setTotalFood(current);
                }
                else {
                    System.out.println("Cannot sell that much food!");
                }
            }
            default -> {
                System.out.println("We don't sell that!");
                isDone = true;
            }
        }

        // Either 0 for cnt OR bad item, return true
        // Otherwise, return false

        return isDone;
    }

    private void printGoodbye() {
        System.out.println("Have a safe journey...");
    }
}
