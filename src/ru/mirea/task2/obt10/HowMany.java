package ru.mirea.task2.obt10;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        int wordCount = countWords(input);

        System.out.println("Количество слов в введенной строке: " + wordCount);

        scanner.close();
    }

    // Метод для подсчета количества слов в строке
    private static int countWords(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }

        String[] words = input.split("\\s+"); // Разделение строки по пробелам
        return words.length;
    }
}
