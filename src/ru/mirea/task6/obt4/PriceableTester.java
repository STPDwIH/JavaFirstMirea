package ru.mirea.task6.obt4;

import ru.mirea.task6.obt3.Animal;
import ru.mirea.task6.obt3.Car;
import ru.mirea.task6.obt3.Nameable;
import ru.mirea.task6.obt3.Planet;

public class PriceableTester {
    public static void main(String[] args) {
        // Создаем объекты разных классов, реализующих интерфейс Priceable
        Priceable auto = new Automobile(1000.0);
        Priceable fruit = new Fruits(2.99);
        Priceable house = new Houses(99999.99);

        // Выводим их цены
        System.out.println("Automobiles price: $" + auto.getPrice());
        System.out.println("Fruits price: $" + fruit.getPrice());
        System.out.println("Houses price: $" + house.getPrice());
    }
}
