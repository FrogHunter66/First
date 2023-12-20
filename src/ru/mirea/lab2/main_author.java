package ru.mirea.lab2;

import ru.mirea.lab2.Author;

public class main_author {
    public static void main(String[] args){
        Author testAuthor = new Author("Naymov D.S.", "Kotopes1488@mail.ru", 'M');
        System.out.println(testAuthor.getName());
        System.out.println(testAuthor.getEmail());
        System.out.println(testAuthor.getGender());
        System.out.println(testAuthor);


    }
}
