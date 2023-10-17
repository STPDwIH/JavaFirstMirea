package ru.mirea.task4.obt41;

class Person {
    private String fullName;
    private int age;

    // Конструктор без параметров
    public Person() {
        fullName = "Такой-то ";
        age = 0;
    }

    // Конструктор с параметрами
    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move() {
        System.out.println(fullName + " двигается");
    }

    public void talk() {
        System.out.println(fullName + " говорит");
    }
}