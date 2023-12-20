package ru.mirea.lab4;

public class human{

    public head head;
    public leg leg;
    public hand hand;

    public human(int size_of_hair, boolean status_of_run, int power_of_hand) {
        this.head = new head(size_of_hair);
        this.leg = new leg(status_of_run);
        this.hand = new hand(power_of_hand);
    }
}
