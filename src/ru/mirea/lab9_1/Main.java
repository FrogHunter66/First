package ru.mirea.lab9_1;


public class Main {
    public static void main(String[] args) {
        group first = new group();
        student gosha = new student("gosha");
        System.out.println(gosha.getName());
        System.out.println(first.getName());
    }
}

