package ru.mirea.task16.obt3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

public class PasswordApplication {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Password Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        JLabel serviceLabel = new JLabel("Service:");
        JTextField serviceField = new JTextField("https://"); // Инициализируем строку "https://"

        JLabel usernameLabel = new JLabel("User name:");
        JTextField usernameField = new JTextField();

        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField();

        JLabel resultLabel = new JLabel();
        resultLabel.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 0)); // Увеличиваем отступ слева

        panel.add(serviceLabel);
        panel.add(serviceField);
        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(resultLabel);

        frame.getContentPane().add(panel, BorderLayout.CENTER);

        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String service = serviceField.getText();
                String username = usernameField.getText();
                char[] password = passwordField.getPassword();

                // Проверка названия сервиса
                if (!isValidService(service)) {
                    resultLabel.setText("Введите корректное название сервиса");
                    return;
                }

                // Проверка user name
                if (!isValidUsername(username)) {
                    resultLabel.setText("Введите корректное имя пользователя");
                    return;
                }

                // Проверка пароля
                if (!isValidPassword(password)) {
                    resultLabel.setText("Введите корректный пароль");
                    return;
                }

                // Вывод сообщения об успешном вводе
                resultLabel.setText("Успешно");

                // Очистка полей после вывода данных
                serviceField.setText("https://");
                usernameField.setText("");
                passwordField.setText("");
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(submitButton);

        frame.getContentPane().add(buttonPanel, BorderLayout.SOUTH);

        frame.setSize(500, 300);
        frame.setVisible(true);
    }

    private static boolean isValidService(String service) {
        // Проверка, что название сервиса начинается с "https://" и заканчивается на ".com" или ".ru"
        return Pattern.matches("https://.*\\.(com|ru)$", service);
    }

    private static boolean isValidUsername(String username) {
        String regex = "[a-zA-Zа-яА-Я0-9_\\-\\.]{3,20}";
        return Pattern.matches(regex, username);
    }

    private static boolean isValidPassword(char[] password) {
        String passwordStr = new String(password);

        // Проверка длины пароля
        if (passwordStr.length() < 8 || passwordStr.length() > 128) {
            return false;
        }

        // Проверка наличия хотя бы одной заглавной и одной строчной буквы
        if (!passwordStr.matches(".*[A-Z].*") || !passwordStr.matches(".*[a-z].*")) {
            return false;
        }

        // Проверка наличия хотя бы одной цифры
        if (!passwordStr.matches(".*\\d.*")) {
            return false;
        }

        // Проверка наличия только латинских или кириллических букв и арабских цифр
        if (!passwordStr.matches("[a-zA-Zа-яА-Я0-9~!@#\\$%\\^&\\*_\\-\\+\\(\\)\\[\\]\\{\\}<>\\\\/|\"'.,:]*")) {
            return false;
        }

        // Проверка отсутствия пробелов
        if (passwordStr.contains(" ")) {
            return false;
        }

        return true;
    }
}
