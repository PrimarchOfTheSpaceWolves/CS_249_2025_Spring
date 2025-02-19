package edu.realemj.exercises08;

import java.util.*;
public class OrganTrail {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        String [] names = new String[4];
        System.out.println("Enter names of party:");
        for(int i = 0; i < names.length; i++) {
            names[i] = input.nextLine();
        }

        System.out.println("PARTY:");
        for(String n: names) {
            System.out.println("* " + n);
        }

        String [] problems = {
                "has a broken leg",
                "got dysentery",
                "was run over by the wagon",
                "mauled by a bear"
        };

        int trials = 20;
        for(int i = 0; i < trials; i++) {
            int probChoice = (int)(Math.random()*problems.length);
            int nameChoice = (int)(Math.random()*names.length);

            System.out.println(names[nameChoice] + " " + problems[probChoice]);
        }
    }
}
