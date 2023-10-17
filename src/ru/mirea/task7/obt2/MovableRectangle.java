package ru.mirea.task7.obt2;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;     // Верхняя левая точка
    private MovablePoint bottomRight; // Нижняя правая точка

    public MovableRectangle(int x1, int y1, int x2, int y2) {
        topLeft = new MovablePoint(x1, y1);
        bottomRight = new MovablePoint(x2, y2);
    }

    @Override
    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    @Override
    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    @Override
    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    // Геттеры для получения верхней левой и нижней правой точек
    public MovablePoint getTopLeft() {
        return topLeft;
    }

    public MovablePoint getBottomRight() {
        return bottomRight;
    }
}
