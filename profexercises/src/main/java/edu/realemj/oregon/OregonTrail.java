package edu.realemj.oregon;

import java.util.*;
public class OregonTrail {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        PartyState party = PartyState.createParty(input);
        System.out.println(party);

        Supplies supplies = new Supplies();
        supplies.setTotalMoney(300);
        GeneralStore store = new GeneralStore();

        store.enterStore(input, supplies);
        System.out.println(supplies);
    }
}
