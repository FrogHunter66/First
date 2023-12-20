package ru.mirea.lab2_update;

import java.util.Arrays;
import java.util.Random;

public class Mama {
    public static void summa() {
        int []mass = new int[]{3,4, 12, 32, 123};
        int summ = 0;
        for(int i = 0; i < mass.length; i++){
            summ += mass[i];
        }
        System.out.println("sum of mass elements = " + summ);
        summ = 0;
    }

    public static void garmonic() {
        double summ = 1;
        for(int i = 1; i < 9; i++){
            summ+= 1/i;
        }
        System.out.println("garmonic ryad sum = " + summ);
    }

    public static void sort_arr() {
        int[] arr = generate_arandom(100);
        System.out.println("Random array" + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Sorted array" + Arrays.toString(arr));
    }

    public static int[] generate_arandom(int size) {
        int[] arr = new int[size];
        Random func = new Random();
        for (int i = 0; i < size; i++){
            arr[i] = func.nextInt(100);
        }
        return arr;
    }

    public static void factorial(int num) {
        int res = 1;
        for (int i = 1; i < num; i++){
            res *= i;
        }
        System.out.println("Factorial: " + res);
    }

    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("argument " + (i+1) + ": " + args[i]);
        }
        summa();
        garmonic();
        sort_arr();
        factorial(12);


    }
}
