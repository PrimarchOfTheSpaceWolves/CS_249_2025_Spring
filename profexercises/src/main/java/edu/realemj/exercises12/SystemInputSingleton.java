package edu.realemj.exercises12;

import java.util.*;
public class SystemInputSingleton {

    private static SystemInputSingleton instance; // = new SystemInputSingleton();

    public static SystemInputSingleton getInstance() {
        if(instance == null) {
            instance = new SystemInputSingleton();
        }
        return instance;
    }

    private Scanner input;

    private SystemInputSingleton() {
        input = new Scanner(System.in);
    }

    public Scanner getScanner() {
        return input;
    }
}
