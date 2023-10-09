package ru.mirea.task4.obt4;

public class Monitor {
    private String model;
    private double screenSize; // в дюймах

    public Monitor(String model, double screenSize) {
        this.model = model;
        this.screenSize = screenSize;
    }

    public String getModel() {
        return model;
    }

    public double getScreenSize() {
        return screenSize;
    }

    @Override
    public String toString() {
        return "Монитор: " + model + ", Размер экрана: " + screenSize + " дюймов";
    }
}
