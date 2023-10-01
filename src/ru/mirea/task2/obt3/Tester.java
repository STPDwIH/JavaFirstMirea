package ru.mirea.task2.obt3;

public class Tester {
    private Circle[] circles;
    private int count;

    public Tester(int capacity) {
        circles = new Circle[capacity];
        count = 0;
    }

    public void addCircle(Circle circle) {
        if (count < circles.length) {
            circles[count] = circle;
            count++;
        } else {
            System.out.println("Массив объектов Circle заполнен.");
        }
    }

    public void displayCircles() {
        System.out.println("Список окружностей:");
        for (int i = 0; i < count; i++) {
            System.out.println(circles[i]);
        }
    }
}
