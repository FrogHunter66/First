package ru.mirea.lab3;

public class movablePoint implements movable{

    int x, y, xSpeed, ySpeed;

    movablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.ySpeed = ySpeed;
        this.xSpeed = xSpeed;
    }

    public String toString(){
        return "x " + this.x + "\ny " + this.y + "\nxSpeed " + this.xSpeed + "\nySpeed " + this.ySpeed;
    }

    public void moveUp(){
        this.y = y + 10;
    }

    public void moveDown(){
        this.y = y - 10;
    }

    public void moveLeft(){
        this.x = x - 10;
    }

    public void moveRight(){
        this.x = x + 10;
    }
}
