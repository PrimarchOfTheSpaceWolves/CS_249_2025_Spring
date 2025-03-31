package edu.realemj.oregon;

import java.util.*;
public class PartyState {
    private Person [] party;

    public PartyState(String [] names) {
        party = new Person[names.length];
        for(int i = 0; i < party.length; i++) {
            party[i] = new Person(names[i]);
        }
    }

    public int getPartyCnt() {
        return party.length;
    }

    public int getAliveCnt() {
        int cnt = 0;
        for(Person p: party) {
            if(p.isAlive()) {
                cnt++;
            }
        }
        return cnt;
    }

    public boolean killRandom() {
        if(getAliveCnt() == 0) {
            return false;
        }

        ArrayList<Person> peopleAlive = new ArrayList<>();
        for(Person p: party) {
            if(p.isAlive()) {
                peopleAlive.add(p);
            }
        }

        int randomIndex = (int)(Math.random()*peopleAlive.size());
        Person poorFellow = peopleAlive.get(randomIndex);
        System.out.println(poorFellow + " has passed on.");
        poorFellow.kill();

        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PARTY:\n");
        for(Person p: party) {
            sb.append("* ");
            sb.append(p);
            sb.append("\n");
        }
        return sb.toString();
    }

    public static PartyState createParty(Scanner input) {
        System.out.println("Enter party cnt:");
        String cntStr = input.nextLine();
        int cnt = Integer.parseInt(cntStr);
        String [] names = new String[cnt];
        System.out.println("Enter names:");
        for(int i = 0; i < names.length; i++) {
            names[i] = input.nextLine();
        }
        PartyState party = new PartyState(names);
        return party;
    }



}
