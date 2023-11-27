package ru.mirea.task12.obt3;
import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ImageAnimation {
    private static int currentIndex = 0;
    private static final String[] imagePaths = {
            "C:/Users/BokaP/frame1.jpg",
            "C:/Users/BokaP/frame2.jpg",
            "C:/Users/BokaP/frame3.jpg",
            "C:/Users/BokaP/frame4.jpg"
            // Добавьте здесь пути к вашим изображениям
    };
    private static final JLabel imageLabel = new JLabel();

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ImageAnimation::createAndShowGUI);
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Slideshow");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Установка начального изображения
        ImageIcon initialImage = new ImageIcon(new ImageIcon(imagePaths[currentIndex]).getImage().getScaledInstance(500, 400, Image.SCALE_SMOOTH));
        imageLabel.setIcon(initialImage);

        // Таймер для переключения изображений
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentIndex = (currentIndex + 1) % imagePaths.length;
                ImageIcon imageIcon = new ImageIcon(new ImageIcon(imagePaths[currentIndex]).getImage().getScaledInstance(500, 400, Image.SCALE_SMOOTH));
                imageLabel.setIcon(imageIcon);
            }
        });

        timer.start();

        // Добавление метки с изображением на форму
        frame.add(imageLabel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
