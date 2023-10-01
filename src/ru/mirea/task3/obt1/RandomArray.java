package ru.mirea.task3.obt1;

import java.util.Arrays;
import java.util.Random;

public class RandomArray {
    public static void main(String[] args) {
        // Создаем массив случайных чисел с помощью Math.random()
        double[] randomArray1 = generateRandomArray(10);

        // Выводим исходный массив
        System.out.println("Исходный массив (Math.random()):");
        printArray(randomArray1);

        // Сортируем массив с помощью метода sort()
        Arrays.sort(randomArray1);

        // Выводим отсортированный массив
        System.out.println("\nОтсортированный массив (Math.random()):");
        printArray(randomArray1);

        // Создаем массив случайных чисел с помощью класса Random
        double[] randomArray2 = generateRandomArrayUsingRandom(10);

        // Выводим исходный массив
        System.out.println("\nИсходный массив (Random):");
        printArray(randomArray2);

        // Сортируем массив с помощью метода sort()
        Arrays.sort(randomArray2);

        // Выводим отсортированный массив
        System.out.println("\nОтсортированный массив (Random):");
        printArray(randomArray2);
    }

    // Метод для генерации массива случайных чисел с помощью Math.random()
    private static double[] generateRandomArray(int size) {
        double[] array = new double[size];
        for (int i = 0; i < size; i++) {
            array[i] = Math.random();
        }
        return array;
    }

    // Метод для генерации массива случайных чисел с помощью класса Random
    private static double[] generateRandomArrayUsingRandom(int size) {
        double[] array = new double[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextDouble();
        }
        return array;
    }

    // Метод для вывода массива на экран
    private static void printArray(double[] array) {
        for (double value : array) {
            System.out.printf("%.4f ", value);
        }
        System.out.println();
    }
}
