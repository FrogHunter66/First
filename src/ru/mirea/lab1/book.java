package ru.mirea.lab1;

public class book {
    String author, name;
    int current_page, price;
    public book(String author, String name, int current_page, int price){
        this.author = author;
        this.name = name;
        this.current_page = current_page;
        this.price = price;
    }

    public void open(){
        System.out.println("The book is open");
    }

    public void close(){
        System.out.println("The book is closed");
    }

    public void next_page(){
        current_page += 1;
        System.out.println("Your current page is " + current_page);
    }

    @Override
    public String toString() {
        return "Вы читаете книгу от " + author + ", название - " + name + ", текущая страница - " + current_page + ", по цене " + price;
    }
}
