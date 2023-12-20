package ru.mirea.lab8.Shapes;

import java.awt.*;

public class line extends shape {
    public line() {
        super(0,0,0,0, Color.black);
    }
    public line(int x, int y, int x1, int y1, Color color) {
        super(x,y,x1,y1,color);
    }
}