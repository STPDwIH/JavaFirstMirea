package ru.mirea.task1.opt4;

import java.util.Scanner;

public class ShowArgs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int n = scanner.nextInt();

        // Создаем массив
        int[] array = new int[n];

        // Заполняем массив данными, введенными пользователем
        for (int i = 0; i < n; i++) {
            System.out.print("Введите элемент массива #" + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Считаем сумму элементов с использованием цикла do-while
        int sumDoWhile = 0;
        int i = 0;
        do {
            sumDoWhile += array[i];
            i++;
        } while (i < n);

        // Считаем сумму элементов с использованием цикла while
        int sumWhile = 0;
        i = 0;
        while (i < n) {
            sumWhile += array[i];
            i++;
        }

        // Находим максимальный и минимальный элементы массива
        int max = array[0];
        int min = array[0];
        for (int j = 1; j < n; j++) {
            if (array[j] > max) {
                max = array[j];
            }
            if (array[j] < min) {
                min = array[j];
            }
        }

        // Выводим результаты
        System.out.println("Сумма элементов массива (do-while): " + sumDoWhile);
        System.out.println("Сумма элементов массива (while): " + sumWhile);
        System.out.println("Максимальный элемент массива: " + max);
        System.out.println("Минимальный элемент массива: " + min);

        scanner.close();
    }
}
