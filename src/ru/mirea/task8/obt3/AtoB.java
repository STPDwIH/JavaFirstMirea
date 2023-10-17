package ru.mirea.task8.obt3;
import java.util.Scanner;
public class AtoB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число A: ");
        int A = scanner.nextInt(); // Считываем число A
        System.out.print("Введите число B: ");
        int B = scanner.nextInt(); // Считываем число B
        scanner.close();

        if (A < B) {
            for (int i = A; i <= B; i++) {
                System.out.print(i + " "); // Выводим числа от A до B в порядке возрастания
            }
        } else {
            for (int i = A; i >= B; i--) {
                System.out.print(i + " "); // Выводим числа от A до B в порядке убывания
            }
        }
    }
}
