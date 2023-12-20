package ru.mirea.lab4;

public class hand {
    private int power_of_hand;

    public hand(int power_of_hand){
        this.power_of_hand = power_of_hand;
    }

    public void setPower_of_hand(int power_of_hand){
        this.power_of_hand = power_of_hand;
    }

    public String toString(){
        return "The power of hand is equals of " + power_of_hand;
    }

}
