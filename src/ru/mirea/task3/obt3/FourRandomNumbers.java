package ru.mirea.task3.obt3;

import java.util.Random;

public class FourRandomNumbers {
    public static void main(String[] args) {
        // Создаем массив из 4 случайных целых чисел в диапазоне [10; 99]
        int[] array = new int[4];
        Random random = new Random();

        for (int i = 0; i < 4; i++) {
            array[i] = random.nextInt(90) + 10; // Генерируем число от 10 до 99
        }

        // Выводим массив на экран
        System.out.print("Массив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Проверяем, является ли массив строго возрастающей последовательностью
        boolean isIncreasing = true;
        for (int i = 1; i < 4; i++) {
            if (array[i] <= array[i - 1]) {
                isIncreasing = false;
                break;
            }
        }

        if (isIncreasing) {
            System.out.println("Массив является строго возрастающей последовательностью.");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью.");
        }
    }
}
