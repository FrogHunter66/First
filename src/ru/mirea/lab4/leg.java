package ru.mirea.lab4;

public class leg {
    private boolean status_of_run = false;

    leg(boolean status_of_run){
        this.status_of_run = status_of_run;
    }

    public void switch_status(){
        this.status_of_run = !status_of_run;
        System.out.println("Now status of run is " + this.status_of_run);
    }
}
