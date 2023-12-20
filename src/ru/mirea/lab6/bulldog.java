package ru.mirea.lab6;

public class bulldog extends Dog{


    public bulldog(String first_name, String second_name, String breed, long snils, boolean man) {
        super(first_name, second_name, breed, snils, man);
    }

    public void change_snils(long snils){
        this.snils = snils;
        System.out.println("Your current snils is " + this.snils);
    }


}
