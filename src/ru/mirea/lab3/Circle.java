package ru.mirea.lab3;

import ru.mirea.lab3.Shape;

public class Circle extends Shape {

    protected  double radius;

    public Circle(){

    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return 3.14 * this.radius * this.radius;
    }

    public double getPerimeter(){
        return 2 * 3.14 * this.radius;
    }

    @Override
    public String toString() {
        return "Params of this Circle: Radius - " + radius + ", area - " + getArea() + ", Color - " + getColor() + ", perimeter - " + getPerimeter();
    }
}
