package ru.mirea.lab6;

public class double_cup extends Dish {

    private boolean liqid;

    public double_cup(boolean liqid, String shape, String color, boolean dirtiness) {
        super(shape, color, dirtiness);
        this.liqid = liqid;
    }

    public void drink(){
        if (this.liqid != false){
            this.liqid = false;
            System.out.println("Your liquid is drunk");
        }
        else{
            System.out.println("Double cup is empty(");
        }
    }


}
