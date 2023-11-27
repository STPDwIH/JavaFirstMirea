package ru.mirea.dopZadanie1;

import java.util.Scanner;

class Element {
    private String name;
    private int age;

    public Element() {
        readAttributes();
    }

    public void readAttributes() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя: ");
        this.name = scanner.nextLine();
        System.out.print("Введите возраст: ");
        this.age = scanner.nextInt();
    }

    public void displayAttributes() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
    }
}
