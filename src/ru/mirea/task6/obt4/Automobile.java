package ru.mirea.task6.obt4;

public class Automobile implements Priceable{
    private Double price;

    public Automobile(Double price) {
        this.price = price;
    }

    @Override
    public Double getPrice() {
        return price;
    }
}
