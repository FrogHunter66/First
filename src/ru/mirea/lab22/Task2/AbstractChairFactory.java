package ru.mirea.lab22.Task2;

public interface AbstractChairFactory {
    public VictorianChair createVictorianChair();
    public MagicChair createMagicianChair();
    public FunctionalChair createFunctionalChair();
}
