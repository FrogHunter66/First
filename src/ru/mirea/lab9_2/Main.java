package ru.mirea.lab9_2;


public class Main {
    public static void main(String[] args) {
        Car lada = new Car(30000);
        Time day = new Time();
        System.out.println(lada.getPrice());
        System.out.println(day.getPrice());
    }
}
