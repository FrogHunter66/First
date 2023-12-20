package ru.mirea.lab6;

public abstract class Dog {
    protected String first_name, second_name, breed;
    protected long snils;
    protected boolean man;

    public Dog(String first_name, String second_name, String breed, long snils, boolean man) {
        this.first_name = first_name;
        this.second_name = second_name;
        this.snils = snils;
        this.man = man;
        this.breed = breed;
    }

    public void bark(){
        System.out.println("Meow :3");
    }

    @Override
    public String toString(){
        return "first name - " + this.first_name + ", second name - " + this.second_name +
                ", snils - " + this.snils + ", man? - " + this.man + ", breed - " + this.breed;
    }
}
