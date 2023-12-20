package ru.mirea.lab6;

public abstract class Furniture {
    private int height, width, length;
    public Furniture() {
        this.height = 50;
        this.width = 50;
        this.length = 50;
    }
    public Furniture(int height, int length, int width) {
        this.height = height;
        this.width = width;
        this.length = length;
    }


    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }
    @Override
    public String toString() {
        return "Heigth: " + height + "\nWidth: " + width + "\nLength: "+length;
    }
}
