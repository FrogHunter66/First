package ru.mirea.lab6;

public class main_dish {
    public static void main(String[] args) {
        double_cup d = new double_cup(true, "cup", "purple", false);
        System.out.println(d.toString());
        d.drink();
        d.drink();
    }
}
