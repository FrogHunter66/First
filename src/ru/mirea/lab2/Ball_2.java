package ru.mirea.lab2;

public class Ball_2 {

    private double x, y;

    public Ball_2(double x, double y){
        this.x = x;
        this.y = y;
    }

    public Ball_2(){
        this.x = 0.0;
        this.y = 0.0;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public void setX(double x){
        this.x = x;
    }

    public void setY(double y){
        this.y = y;
    }

    public void setXY(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void move(double xDisp, double yDisp){
        this.x += xDisp;
        this.y += yDisp;
    }

    @Override
    public String toString() {
        return "x - " + x + ", y - " + y;
    }
}