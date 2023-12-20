package ru.mirea.lab6;

public class main_dog {
    public static void main(String[] args) {
        bulldog bulldoggy = new bulldog("Lenya", "Statham", "bulldog", 123145123, true);
        System.out.println(bulldoggy.toString());
        bulldoggy.toString();
        bulldoggy.bark();
        bulldoggy.change_snils(64212342);
    }
}
