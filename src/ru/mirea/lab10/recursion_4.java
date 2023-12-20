package ru.mirea.lab10;

public class recursion_4 {
    public static void main(String[] args) {
        int k = 2; // Кол-во разрядов
        int s = 10; // Сумма разрядов
        int count = countNumbers(k, s, 0, 0);
        System.out.println("Количество чисел: " + count);
    }

    public static int countNumbers(int k, int s, int currentSum, int position) {
//        System.out.println("Pos " + position);
//        System.out.println("currentsum " + currentSum);
//        System.out.println("\n");
        if (position == k) {
            return (currentSum == s) ? 1 : 0;
        }
        int count = 0;
        int start = (position == 0) ? 1 : 0;
        for (int i = start; i <= 9; i++) {
            if (currentSum + i <= s) {
                count += countNumbers(k, s, currentSum + i, position + 1);
            }
        }

        return count;
    }
}
