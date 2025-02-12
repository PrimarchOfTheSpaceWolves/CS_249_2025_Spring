package edu.realemj.exercises06;

import java.util.*;
public class L33tSpeak {
    public static void main(String [] args) {
        Scanner myInput = new Scanner(System.in);
        String line = "";
        do {
            System.out.println("Enter line of text:");
            line = myInput.nextLine();
            //if(line.length() > 0) {
            if(!line.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                for(int i = 0; i < line.length(); i++) {
                    char c = line.charAt(i);
                    char nc = switch(c) {
                        case 'a','A' -> '4';
                        case 'e','E' -> '3';
                        case 'i','I' -> '1';
                        case 'o','O' -> '0';
                        default -> c;
                    };
                    sb.append(nc);
                }
                String l33tLine = sb.toString();
                System.out.println(l33tLine);
            }
        } while(!line.isEmpty());
    }
}
