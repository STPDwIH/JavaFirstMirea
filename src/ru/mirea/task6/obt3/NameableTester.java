package ru.mirea.task6.obt3;

public class NameableTester {
    public static void main(String[] args) {
        // Создаем объекты разных классов, реализующих интерфейс Nameable
        Nameable earth = new Planet("Earth");
        Nameable ford = new Car("Ford Mustang");
        Nameable lion = new Animal("Lion");

        // Выводим их имена
        System.out.println("Planet name: " + earth.getName());
        System.out.println("Car name: " + ford.getName());
        System.out.println("Animal name: " + lion.getName());
    }
}
