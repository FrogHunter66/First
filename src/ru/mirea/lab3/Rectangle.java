package ru.mirea.lab3;

import ru.mirea.lab3.Shape;

public class Rectangle extends Shape {

    protected  double width, length;

    public Rectangle(){

    }

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled){
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){
        return this.length * this.width;
    }

    public double getPerimeter(){
        return 2 * (this.length + this.width);
    }

    @Override
    public String toString() {
        return "Params of this Rectangle: width - " + this.width + ", area - " + this.length + ", area - " + getArea() + ", Color - " + getColor() + ", perimeter - " + getPerimeter();
    }


}
