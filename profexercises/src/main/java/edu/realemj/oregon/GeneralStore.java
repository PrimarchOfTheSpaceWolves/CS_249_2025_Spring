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
        // TODO
        return true;
    }

    private void printGoodbye() {
        System.out.println("Have a safe journey...");
    }
}
