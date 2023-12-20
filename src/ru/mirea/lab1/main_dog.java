package ru.mirea.lab1;

public class main_dog {
    public static void main(String[] args) {
        Dog test = new Dog("Kiril", "pinguin", "white-blue", 120, 4);
        test.voice();
        test.eat();
        test.swich_type("Chinese");
        String inf;
        inf = test.toString();
        System.out.println(inf);
    }
}
