package ru.mirea.task2.obt2;

public class Ball {
    private double x;
    private double y;

    // Конструктор с параметрами
    public Ball(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Конструктор без параметров (по умолчанию)
    public Ball() {
        this.x = 0.0;
        this.y = 0.0;
    }

    // Гет для x
    public double getX() {
        return x;
    }

    // Сет для x
    public void setX(double x) {
        this.x = x;
    }

    // Гет для y
    public double getY() {
        return y;
    }

    // Сет для y
    public void setY(double y) {
        this.y = y;
    }

    // Метод для установки координат x и y
    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Метод для перемещения мяча на заданное расстояние
    public void move(double xDisp, double yDisp) {
        this.x += xDisp;
        this.y += yDisp;
    }

    // Метод для представления объекта в виде строки
    public String toString() {
        return "Мяч с координатами (" + x + ", " + y + ")";
    }
}

