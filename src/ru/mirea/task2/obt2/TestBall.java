package ru.mirea.task2.obt2;

public class TestBall {
    public static void main(String[] args) {
        // Создаем объект мяча с начальными координатами
        Ball ball = new Ball(1.0, 2.0);

        // Выводим координаты мяча
        System.out.println("Начальные координаты мяча: " + ball);

        // Перемещаем мяч на заданное расстояние
        ball.move(3.0, -1.0);

        // Выводим новые координаты мяча
        System.out.println("Новые координаты мяча после перемещения: " + ball);
    }
}
