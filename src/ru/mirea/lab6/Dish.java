package ru.mirea.lab6;

public abstract class Dish {
    protected String shape, color;

    protected boolean dirtiness;

    public Dish(String shape, String color, boolean dirtiness) {
        this.shape = shape;
        this.color = color;
        this.dirtiness = dirtiness;
    }

    public void wash_dish(){
        this.dirtiness = false;
        System.out.println("now your dish is clean!");
    }

    @Override
    public String toString(){
        return "Shape - " + this.shape + ", color - " + this.color + ", dirtiness - " + this.dirtiness;
    }
}
