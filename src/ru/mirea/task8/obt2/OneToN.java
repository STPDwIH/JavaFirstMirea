package ru.mirea.task8.obt2;
import java.util.Scanner;
public class OneToN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = scanner.nextInt(); // Считываем число n
        scanner.close();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " "); // Выводим числа от 1 до n
        }
    }
}
