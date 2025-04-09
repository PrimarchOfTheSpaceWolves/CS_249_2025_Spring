package edu.realemj.exercises15.observer;

public class Gotham {
    public static void main(String [] args) {
        Batsignal signal = new Batsignal();

        Batperson bruce = new Batperson("Batman");
        Batperson dick = new Batperson("Nightwing");
        Batperson barbara = new Batperson("Batgirl");
        Batperson tim = new Batperson("Robin");

        signal.registerObserver(bruce);
        signal.registerObserver(dick);
        signal.registerObserver(barbara);
        signal.registerObserver(tim);

        signal.setActiveCrime("a robbery");

        signal.removeObserver(dick);

        Superperson clark = new Superperson("Superman");
        signal.registerObserver(clark);

        signal.setActiveCrime("a kidnapping");

    }
}
