package ru.mirea.task5.obt2;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;
import javax.swing.JFrame;


public class RandomShapes extends Canvas {
    //ширина и высота окна
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;

    //устанавливаем размер холста в соответствии с заданными константами
    public RandomShapes() {
        setSize(WIDTH, HEIGHT);
    }

    @Override
    public void paint(Graphics g) {
        Random random = new Random();//отображения на холсте. Внутри него создаются случайные фигуры

        for (int i = 0; i < 20; i++) { //Цикл для создания 20 случайных фигур.
            int x = random.nextInt(WIDTH);//Генерация случайных координат для позиции фигуры.
            int y = random.nextInt(HEIGHT);
            //Генерация случайных размеров фигуры
            int width = random.nextInt(100) + 20; // Ширина от 20 до 120
            int height = random.nextInt(100) + 20; // Высота от 20 до 120
            //Создание случайного цвета для фигуры
            Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));

            //Установка цвета для рисования.
            g.setColor(color);
            int shapeType = random.nextInt(2);

            //рисуем окружность или прямоугольник на холсте
            if (shapeType == 0) {
                g.fillOval(x, y, width, height); // Окружность
            } else {
                g.fillRect(x, y, width, height); // Прямоугольник
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Random Shapes (AWT)");
        RandomShapes canvas = new RandomShapes();
        frame.add(canvas);
        frame.setSize(WIDTH, HEIGHT);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);//завершаем программу при закрытии окна
            }
        });
    }

}
