package ru.mirea.task7.obt1;

public class MovableRectangle implements Movable{
    private int x;
    private int y;

    public MovableRectangle(int x, int y) {
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
    // Дополнительные методы для доступа к координатам и размерам прямоугольника
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

