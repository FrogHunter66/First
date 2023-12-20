package ru.mirea.lab10;



public class recursion_3 {
    public static void main(String args[]) {
        int A = 12;
        int B = 15;
        printNumbers(A, B);
    }
    public static void printNumbers(int A, int B) {
        if (A < B) {
            System.out.println(A);
            printNumbers(A + 1, B);
        }
        else if (A == B) return;

        else {
             System.out.println(A);
             printNumbers(A - 1, B);
        }
    }

}


