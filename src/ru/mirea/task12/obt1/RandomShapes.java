package ru.mirea.task12.obt1;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

// Абстрактный класс фигуры
abstract class Shape {
    Color color;
    int x, y;

    public Shape(Color color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    abstract void draw(Graphics g);
}

// Класс прямоугольника
class Rectangle extends Shape {
    int width, height;

    public Rectangle(Color color, int x, int y, int width, int height) {
        super(color, x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
}

// Класс круга
class Circle extends Shape {
    int diameter;

    public Circle(Color color, int x, int y, int diameter) {
        super(color, x, y);
        this.diameter = diameter;
    }

    @Override
    void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, diameter, diameter);
    }
}

public class RandomShapes {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Random Shapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Random random = new Random();
                for (int i = 0; i < 20; i++) {
                    int x = random.nextInt(400);
                    int y = random.nextInt(400);
                    int red = random.nextInt(256);
                    int green = random.nextInt(256);
                    int blue = random.nextInt(256);
                    Color color = new Color(red, green, blue);

                    if (i % 2 == 0) {
                        int width = random.nextInt(100);
                        int height = random.nextInt(100);
                        Rectangle rectangle = new Rectangle(color, x, y, width, height);
                        rectangle.draw(g);
                    } else {
                        int diameter = random.nextInt(100);
                        Circle circle = new Circle(color, x, y, diameter);
                        circle.draw(g);
                    }
                }
            }
        };

        frame.add(panel);
        frame.setVisible(true);
    }
}