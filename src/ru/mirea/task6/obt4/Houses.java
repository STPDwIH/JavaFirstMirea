package ru.mirea.task6.obt4;

public class Houses implements Priceable{
    private Double price;

    public Houses(Double price) {
        this.price = price;
    }

    @Override
    public Double getPrice() {
        return price;
    }
}
