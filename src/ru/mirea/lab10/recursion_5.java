package ru.mirea.lab10;

public class recursion_5 {
    public static void main(String[] args) {
        int number = 135;
        int sum = sumofDigits(number);
        System.out.println("Сумма цифр числа " + number + " равна " + sum);
    }

    public static int sumofDigits(int n) {
        if (n < 10) {
            return n;
        } else {
            return n % 10 + sumofDigits(n / 10);
        }
    }
}
