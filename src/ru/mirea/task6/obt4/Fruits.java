package ru.mirea.task6.obt4;

public class Fruits implements Priceable{
    private Double price;

    public Fruits(Double price) {
        this.price = price;
    }

    @Override
    public Double getPrice() {
        return price;
    }

}
