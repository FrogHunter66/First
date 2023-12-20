package ru.mirea.lab24;

public class IllegalTableNumber extends RuntimeException {
    public IllegalTableNumber(String errormessage) {
        super(errormessage);
    }
}
