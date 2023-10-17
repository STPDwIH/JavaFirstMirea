package ru.mirea.task7.obt2;

public class MovablePoint implements Movable{
    private int x;
    private int y;

    public MovablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void moveUp() {
        y--;
    }

    @Override
    public void moveDown() {
        y++;
    }

    @Override
    public void moveLeft() {
        x--;
    }

    @Override
    public void moveRight() {
        x++;
    }

    // Геттеры для получения координат x и y
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
