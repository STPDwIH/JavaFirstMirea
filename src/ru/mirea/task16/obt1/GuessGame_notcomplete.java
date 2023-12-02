package ru.mirea.task16.obt1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessGame_notcomplete extends JFrame {
    private int secretNumber = (int) (Math.random() * 21); // Генерация случайного числа от 0 до 20
    private int attempts = 3; // Количество попыток

    private JLabel instructions;

    public GuessGame_notcomplete() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Угадайка");
        setSize(500, 500);

        setLayout(new BorderLayout());

        instructions = new JLabel("Попробуйте угадать число от 0 до 20. Осталось попыток: " + attempts);
        add(instructions, BorderLayout.NORTH);

        JButton guessButton = new JButton("Угадать");
        guessButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (attempts > 0) {
                    int guess = getGuessNumber();
                    if (guess == secretNumber) {
                        JOptionPane.showMessageDialog(null, "Поздравляем! Вы угадали число: " + secretNumber);
                        dispose();
                    } else {
                        attempts--;
                        instructions.setText("Число " + guess + " не является правильным. Осталось попыток: " + attempts);
                        if (attempts == 0) {
                            JOptionPane.showMessageDialog(null, "Вы использовали все попытки. Правильное число было: " + secretNumber);
                            dispose();
                        }
                    }
                }
            }
        });
        add(guessButton, BorderLayout.CENTER);

        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (evt.getComponent() == guessButton) {
                    JOptionPane.showMessageDialog(null, "Добро пожаловать в ЦАО");
                } else if (evt.getComponent() == getContentPane()) {
                    JOptionPane.showMessageDialog(null, "Добро пожаловать в САО");
                }
                // Например, другие проверки для других областей интерфейса
            }
        });
    }

    private int getGuessNumber() {
        // Здесь можно реализовать логику ввода числа пользователем, например, через диалоговое окно или JTextField
        return 0; // Заглушка для примера
    }

    public static void main(String[] args) {
        GuessGame_notcomplete game = new GuessGame_notcomplete();
        game.setVisible(true);
    }
}
