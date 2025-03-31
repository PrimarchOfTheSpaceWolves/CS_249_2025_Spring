package edu.realemj.oregon;
import edu.realemj.exercises12.SystemInputSingleton;
import java.util.*;
public class OregonTrail {
    public static void main(String [] args) {
        //Scanner input = new Scanner(System.in);

        Scanner input = SystemInputSingleton.getInstance().getScanner();

        PartyState party = PartyState.createParty(input);
        System.out.println(party);

        while(party.getAliveCnt() > 0) {
            party.killRandom();
            System.out.println(party);
        }

        Supplies supplies = new Supplies();
        supplies.setTotalMoney(300);
        GeneralStore store = new GeneralStore();

        store.enterStore(input, supplies);
        System.out.println(supplies);
    }
}
