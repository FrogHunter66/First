package ru.mirea.lab4;

public class head {
    private int size_of_hair;


    head(int size_of_hair){
        this.size_of_hair = size_of_hair;
    }

    public void set_cool_hair(){
        this.size_of_hair = 0;
        System.out.println("Bro, now you loking fantastic!!!");
    }



    public String toString(){
        return "You have " +this.size_of_hair + " cm long hair";
    }

}
