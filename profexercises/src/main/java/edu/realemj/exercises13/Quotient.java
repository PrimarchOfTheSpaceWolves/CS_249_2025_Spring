package edu.realemj.exercises13;
import java.util.*;
import java.io.*;
public class Quotient {
    public static void incrediblyStupidFunction() throws IOException {
        throw new IOException("WHOOPS");
    }
    public static int divide(int a, int b) {
        if(b == 0) {
            throw new ArithmeticException("THE FORBIDDEN MATH!!!");
        }

        return a / b;
    }

    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Enter two numbers:");
            int x = input.nextInt();
            int y = input.nextInt();
            int z = divide(x, y);
            System.out.println("Answer = " + z);
            incrediblyStupidFunction();
        }
        catch(ArithmeticException ae) {
            System.out.println("CAUGHT MATH ISSUES.");
            System.out.println(ae.getMessage());
            System.out.println(ae);
            ae.printStackTrace();
        }
        catch(Exception e) {
            System.out.println("SOMETHING ELSE BAD...");
        }
        /*
        catch(InputMismatchException ie) {
            System.out.println("WHAT KIND OF NUMBERS ARE THESE???");
        }*/

        System.out.println("PROGRAM OVER");
    }
}
