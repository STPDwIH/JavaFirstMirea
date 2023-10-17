package ru.mirea.task8.obt1;
import java.util.Scanner;
public class TriangularSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = scanner.nextInt();//Считываем число n
        scanner.close();

        int currentNumber = 1;// Инициализируем текущее число как 1
        int count = 0;// Инициализируем счетчик количества раз, которое мы вывели текущее число

        for (int i = 1; i <= n; i++) { // от 1 до n
            if (count < currentNumber) {// Если мы еще не вывели текущее число нужное количество раз
                System.out.print(currentNumber + " ");// Выводим текущее число
                count++;
            } else {// Если текущее число уже выведено нужное количество раз
                currentNumber++;
                count = 0;
                System.out.print(currentNumber + " ");// Выводим следующее число
                count++;
            }
        }
    }
}
