package ru.mirea.task4.obt4;

public class Processor {
    private String model;
    private double clockSpeed; // в ГГц

    public Processor(String model, double clockSpeed) {
        this.model = model;
        this.clockSpeed = clockSpeed;
    }

    public String getModel() {
        return model;
    }

    public double getClockSpeed() {
        return clockSpeed;
    }
    public String toString() {
        return "Процессор: " + model + ", Частота: " + clockSpeed + " ГГц";
    }
}
