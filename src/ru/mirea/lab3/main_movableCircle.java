package ru.mirea.lab3;

public class main_movableCircle {
    public static void main(String[] args) {
        MovableCircle circle1 = new MovableCircle(10, 20, 3, 4, 15);
        System.out.println(circle1);
        circle1.MoveLeft();
        circle1.MoveLeft();
        circle1.MoveDown();
        circle1.MoveDown();
        circle1.MoveDown();
        System.out.println(circle1);

    }

}
