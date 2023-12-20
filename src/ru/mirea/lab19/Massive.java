package ru.mirea.lab19;


import java.util.ArrayList;
import java.util.List;

public class Massive {
    private Object[] objects;
    public Massive() {
        objects = new Object[5];
        objects[0] = 3;
        objects[1] = 1.5;
        objects[2] = "Nikita";
        objects[3] = 'a';
        objects[4] = new Object();
    }
    public Massive(int a) {
        objects = new Object[a];
    }

    public Object[] getObjects() {
        return objects;
    }
    public Object getObject(int i) {
        return objects[i];
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < objects.length; i++) {
            result += objects[i] + "\n";
        }
        return result;
    }
}
