package ru.mirea.lab1;

public class Ball {
    String material, color;
    int radius;
    boolean is_ready_to_play;
    public Ball(String material, String color, int radius, boolean is_ready_to_play){
        this.material = material;
        this.color = color;
        this.radius = radius;
        this.is_ready_to_play = is_ready_to_play;

    }

    public void punch(){
        System.out.println("АЙ, меня ударили");
    }


    public void switch_status(){
        System.out.println("Status of ball swithced from " + is_ready_to_play + " to " + !is_ready_to_play);
        this.is_ready_to_play = false;
    }

    @Override
    public String toString() {
        return ("Full info about ball: material - " + material + ", color - " + color + ", radius - " + radius + ", ready to play - " + is_ready_to_play  );
    }
}
