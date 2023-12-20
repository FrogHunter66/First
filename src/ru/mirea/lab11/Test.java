package ru.mirea.lab11;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Student[] students = new Student[5];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            System.out.println("InputID ");
            students[i].setiDNumber(in.nextInt());
            System.out.println("InputTestRes ");
            students[i].setTestResults(in.nextInt());
        }
        sorts_for_students.insertionSort(students);
        for (int i = 0; i < students.length; i++) {
            System.out.print(students[i]);
        }
        System.out.println("____________________");
        sorts_for_students.quickSort(students, 0, students.length - 1);
        for (int i = 0; i < students.length; i++) {
            System.out.print(students[i]);
        }
        Student[] students2 = new Student[5];
        for (int i = 0; i < students2.length; i++) {
            students2[i] = new Student();
            students2[i].setiDNumber(in.nextInt());
            students2[i].setTestResults(in.nextInt());
        }
        students = sorts_for_students.mergeSort(students);
        students2 = sorts_for_students.mergeSort(students2);
        students = sorts_for_students.merge(students, students2);
        System.out.println("____________________");
        for (int i = 0; i < students.length; i++) {
            System.out.print(students[i]);
        }
    }
}


