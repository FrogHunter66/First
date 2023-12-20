package ru.mirea.lab3;

public class Square extends Rectangle {
    public Square(){

    }

    public Square(double side){
        this.width = side;
        this.length = side;
    }

    public Square(double side, String color, boolean filled){
        this.width = side;
        this.length = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide(){
        return this.length;
    }

    public void setSide(double side){
        this.length = side;
        this.width = side;
    }

    public double getArea(){
        return this.length * this.length;
    }

    public double getPerimeter(){
        return 2 * this.length;
    }

    @Override
    public String toString() {
        return "Params of this Square: side - " + this.width + "" ;
    }
}
