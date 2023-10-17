package ru.mirea.task7.obt1;

public class MovableRectangleTest {
    public static void main(String[] args) {
        MovableRectangle rectangle = new MovableRectangle(0, 0);

        System.out.println("Initial position: (" + rectangle.getX() + ", " + rectangle.getY() + ")");

        rectangle.moveRight();
        rectangle.moveDown();

        System.out.println("New position: (" + rectangle.getX() + ", " + rectangle.getY() + ")");
    }
}
