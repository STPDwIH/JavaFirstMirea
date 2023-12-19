package ru.mirea.task16.obt2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JTextAreaExample extends JFrame {
    private JTextArea textArea;
//инициализирует главное окно, устанавливает его размеры и заголовок,
//добавляет текстовую область с возможностью прокрутки (чтобы обрабатывать большой объем текста)
//и создает меню с двумя подменю: "Цвет" и "Шрифт".

    public JTextAreaExample() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Изменение цвета и шрифта JTextArea");
        setSize(400, 300);

        textArea = new JTextArea();
        add(new JScrollPane(textArea), BorderLayout.CENTER);

        JMenuBar menuBar = new JMenuBar();

        JMenu colorMenu = new JMenu("Цвет");
        JMenuItem blueItem = new JMenuItem("Синий");
        blueItem.addActionListener(new ColorActionListener(Color.BLUE));
        JMenuItem redItem = new JMenuItem("Красный");
        redItem.addActionListener(new ColorActionListener(Color.RED));
        JMenuItem blackItem = new JMenuItem("Черный");
        blackItem.addActionListener(new ColorActionListener(Color.BLACK));

        colorMenu.add(blueItem);
        colorMenu.add(redItem);
        colorMenu.add(blackItem);
        menuBar.add(colorMenu);

        JMenu fontMenu = new JMenu("Шрифт");
        JMenuItem timesNewRomanItem = new JMenuItem("Times New Roman");
        timesNewRomanItem.addActionListener(new FontActionListener("Times New Roman"));
        JMenuItem msSansSerifItem = new JMenuItem("MS Sans Serif");
        msSansSerifItem.addActionListener(new FontActionListener("MS Sans Serif"));
        JMenuItem courierNewItem = new JMenuItem("Courier New");
        courierNewItem.addActionListener(new FontActionListener("Courier New"));

        fontMenu.add(timesNewRomanItem);
        fontMenu.add(msSansSerifItem);
        fontMenu.add(courierNewItem);
        menuBar.add(fontMenu);

        setJMenuBar(menuBar);
    }

    private class ColorActionListener implements ActionListener {

        //Отвечает за изменение цвета текста в текстовой области при выборе определенного цвета в меню.
        private Color color;

        public ColorActionListener(Color color) {
            this.color = color;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            textArea.setForeground(color);
        }
    }

    private class FontActionListener implements ActionListener {

        //Отвечает за изменение шрифта текста в текстовой области при выборе определенного шрифта в меню.
        private String fontName;

        public FontActionListener(String fontName) {
            this.fontName = fontName;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            Font font = new Font(fontName, Font.PLAIN, 12);
            textArea.setFont(font);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JTextAreaExample example = new JTextAreaExample();
                example.setVisible(true);
            }
        });
    }
}