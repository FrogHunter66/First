package ru.mirea.lab6;

public class FurnitureShop {
    private Furniture f1, f2;
    private int price1, price2;
    public FurnitureShop() {
        f1 = new bed();
        price1 = 200000;
        f2 = new wardrop();
        price2 = 21241;
    }
    public FurnitureShop(int price1, int price2) {
        f1 = new bed();
        this.price1 = price1;
        f2 = new wardrop();
        this.price2 = price2;
    }

    @Override
    public String toString() {
        return "bed price: " + price1 + "\nbed info:\n" + f1 +
                "\nwardrop price: " + price2 + "\nSofa info:\n" + f2;
    }
}