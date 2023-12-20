package ru.mirea.lab4;

import ru.mirea.lab3.Movable_rectangle;

public class main_human {
    public static void main(String[] args) {
        human h1 = new human(15, false, 500);
        System.out.println(h1.head.toString());
        h1.head.set_cool_hair();
        System.out.println(h1.head.toString());
        h1.hand.setPower_of_hand(40);
        System.out.println(h1.hand.toString());
        h1.leg.switch_status();
    }
}
