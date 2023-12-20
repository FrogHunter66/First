package ru.mirea.lab3;

public class main_movableRectangle {
    public static void main(String[] args) {
        Movable_rectangle rectangle1 = new Movable_rectangle(10, 20, 3, 4, 15, 13);
        System.out.println(rectangle1);
        rectangle1.moveLeft();
        rectangle1.moveLeft();
        rectangle1.moveDown();
        System.out.println(rectangle1);

    }
}
