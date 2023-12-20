package ru.mirea.lab9_1;

public class student implements Nameable {
    private String name;
    public student() {
        name = "Nikita";
    }
    public student(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }
}