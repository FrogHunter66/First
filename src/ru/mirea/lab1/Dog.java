package ru.mirea.lab1;

public class Dog {

    String name, type, color;
    int height, weight;
    public Dog(String name, String type, String color, int height, int weight){
            this.name = name;
            this.color = color;
            this.type = type;
            this.height = height;
            this.weight = weight;

    }
    public void voice(){
        System.out.println("MeOw :3");
    }

    public void eat(){
        System.out.println("Thx owner, now i am full");
    }

    public void swich_type(String new_type){
        this.type = new_type;
        System.out.println("You switched type of dog!");
    }

    @Override
    public String toString(){
        return "You create a dog, and his name is " + this.name + " type " + this.type +
                " color " + this.color + " height " + this.height + " weight " + this.weight;
    }
}
