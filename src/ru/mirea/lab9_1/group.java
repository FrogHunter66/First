package ru.mirea.lab9_1;

public class group implements Nameable {
    private String name;
    public group() {
        name = "INBO-01-22";
    }
    public group(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }
}
