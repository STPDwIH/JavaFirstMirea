package ru.mirea.task8.obt5;
import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите натуральное число N: ");
        int N = scanner.nextInt(); // Считываем натуральное число N
        scanner.close();

        int sum = calculateSumOfDigits(N);// Вызываем метод для вычисления суммы цифр числа
        System.out.println("Сумма цифр числа N: " + sum);// Выводим результат
    }

    // Рекурсивный метод для вычисления суммы цифр числа
    public static int calculateSumOfDigits(int number) {
        if (number == 0) {
            return 0;//если число равно 0, возвращаем 0
        } else {
            int lastDigit = number % 10;// Получаем последнюю цифру числа
            int remainingDigits = number / 10;// Получаем оставшиеся цифры числа
            return lastDigit + calculateSumOfDigits(remainingDigits);// Рекурсивно вызываем метод для оставшихся цифр
        }
        }
    }

