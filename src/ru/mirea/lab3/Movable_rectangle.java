package ru.mirea.lab3;

public class Movable_rectangle {
    private movablePoint topLeft;
    private movablePoint bottomRight;

    Movable_rectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
        this.topLeft = new movablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new movablePoint(x2, y2, xSpeed, ySpeed);
    }

    public void moveUp(){
        this.topLeft.moveUp();
        this.bottomRight.moveUp();
    }

    public void moveDown(){
        this.topLeft.moveDown();
        this.bottomRight.moveDown();
    }

    public void moveRight(){
        this.topLeft.moveRight();
        this.bottomRight.moveRight();
    }

    public void moveLeft(){
        this.topLeft.moveLeft();
        this.bottomRight.moveLeft();
    }

    public String toString(){
        return "TopLeft is " + this.topLeft.toString() + "\n\nbottomRight is " + this.bottomRight.toString();
    }
}
