package ru.mirea.lab1;

public class main_book {
    public static void main(String[] args) {
        book test = new book("Дзержинский Р.И.", "Теория графов", 110, 50000);
        test.close();
        test.open();
        test.next_page();
        String inf;
        inf = test.toString();
        System.out.println(inf);
    }
}
