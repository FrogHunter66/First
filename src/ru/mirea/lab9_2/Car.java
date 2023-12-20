package ru.mirea.lab9_2;

public class Car implements Priceable {
    private int price;
    public Car() {
        price = 10000000;
    }
    public Car(int price) {
        this.price = price;
    }
    @Override
    public int getPrice() {
        return price;
    }
}
