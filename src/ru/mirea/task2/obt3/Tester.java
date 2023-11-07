package ru.mirea.task2.obt3;

public class Tester {
    public static void main(String[] args) {
        // Создаем точку и окружность
        Point point = new Point(1.0, 2.0);
        Circle circle = new Circle(point, 5.0);

        // Выводим информацию о точке и окружности
        System.out.println("Центр окружности: (" + circle.getCenter().getX() + ", " + circle.getCenter().getY() + ")");
        System.out.println("Радиус окружности: " + circle.getRadius());
    }
}
