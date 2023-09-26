package ru.mirea.task1.opt3;

import java.util.Scanner;

public class ArraySum{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int n = scanner.nextInt();

        // Создаем массив и инициализируем его элементы
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Введите элемент массива #" + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Считаем сумму элементов
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += array[i];
        }

        // Вычисляем среднее арифметическое элементов
        double average = (double) sum / n;

        // Выводим результаты
        System.out.println("Сумма элементов массива: " + sum);
        System.out.println("Среднее арифметическое элементов массива: " + average);

        scanner.close();
    }
}