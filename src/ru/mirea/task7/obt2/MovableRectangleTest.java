package ru.mirea.task7.obt2;

public class MovableRectangleTest {
    public static void main(String[] args) {
        MovableRectangle rectangle = new MovableRectangle(0, 0, 5, 5);

        System.out.println("Initial position:");
        System.out.println("Top Left: (" + rectangle.getTopLeft().getX() + ", " + rectangle.getTopLeft().getY() + ")");
        System.out.println("Bottom Right: (" + rectangle.getBottomRight().getX() + ", " + rectangle.getBottomRight().getY() + ")");

        rectangle.moveRight();
        rectangle.moveDown();

        System.out.println("New position:");
        System.out.println("Top Left: (" + rectangle.getTopLeft().getX() + ", " + rectangle.getTopLeft().getY() + ")");
        System.out.println("Bottom Right: (" + rectangle.getBottomRight().getX() + ", " + rectangle.getBottomRight().getY() + ")");
    }
}
