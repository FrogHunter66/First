package ru.mirea.lab3;

public class MovableCircle{
    private int radius;
    private movablePoint center;
    MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        this.radius = radius;
        this.center = new movablePoint(x, y, xSpeed, ySpeed);
    }

    public String toString(){
        return "Center of the circle is - y: " + this.center.y + ", x: " + this.center.x + ", xSpeed - " + this.center.xSpeed + ", ySpeed - " + this.center.ySpeed + ", radius - " + this.radius;
    }
    public void MoveUp(){
        this.center.moveUp();
    }

    public void MoveDown(){
        this.center.moveDown();
    }

    public void MoveRight(){
        this.center.moveRight();
    }

    public void MoveLeft(){
        this.center.moveLeft();
    }
}
