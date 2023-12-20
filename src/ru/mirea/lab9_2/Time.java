package ru.mirea.lab9_2;

public class Time implements Priceable{
    private int price;
    public Time() {
        price = 9000;
    }
    public Time(int price) {
        this.price = price;
    }
    @Override
    public int getPrice() {
        return price;
    }
}
