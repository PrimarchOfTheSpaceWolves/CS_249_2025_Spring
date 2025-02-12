package edu.realemj.oregon;

import java.util.*;
public class OregonTrail {
    public static void main(String [] args) {

        Supplies supplies = new Supplies();
        supplies.setTotalMoney(300);
        GeneralStore store = new GeneralStore();
        Scanner input = new Scanner(System.in);
        store.enterStore(input, supplies);
        System.out.println(supplies);
    }
}
