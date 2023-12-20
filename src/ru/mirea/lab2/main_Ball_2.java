package ru.mirea.lab2;

import ru.mirea.lab2.Ball_2;

public class main_Ball_2 {
    public static void main(String[] args){
        Ball_2 test_ball = new Ball_2();
        System.out.println(test_ball.getX() + " " + test_ball.getY());
        test_ball.setX(12.1);
        System.out.println(test_ball);
        test_ball.setY(12.2);
        System.out.println(test_ball);
        test_ball.setXY(6.1, 1.9);
        System.out.println(test_ball);
        test_ball.move(10, 10);
        System.out.println(test_ball);
    }
}
