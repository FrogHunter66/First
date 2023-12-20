package ru.mirea.lab1;

import ru.mirea.lab1.Ball;

public class main_ball {
    public static void main(String[] args) {
        Ball test = new Ball("concrete", "red", 9, true);
        test.punch();
        test.switch_status();
        test.switch_status();
        String inf;
        inf = test.toString();
        System.out.println(inf);
    }
}
