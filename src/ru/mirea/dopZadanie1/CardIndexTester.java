package ru.mirea.dopZadanie1;

import java.util.Scanner;

public class CardIndexTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List list = new List();

        while (true) {
            System.out.println("\nМеню:");
            System.out.println("1. Добавить элемент");
            System.out.println("2. Удалить элемент");
            System.out.println("3. Вывести элемент");
            System.out.println("4. Очистить список");
            System.out.println("5. Проверить на пустоту");
            System.out.println("6. Выход");
            System.out.print("Выберите действие: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    list.addElement();
                    break;
                case 2:
                    System.out.print("Введите индекс элемента для удаления: ");
                    int indexToRemove = scanner.nextInt();
                    list.removeElement(indexToRemove);
                    break;
                case 3:
                    System.out.print("Введите индекс элемента для отображения: ");
                    int indexToDisplay = scanner.nextInt();
                    list.displayElement(indexToDisplay);
                    break;
                case 4:
                    list.clearList();
                    break;
                case 5:
                    if (list.isEmpty()) {
                        System.out.println("Список пуст.");
                    } else {
                        System.out.println("Список не пуст.");
                    }
                    break;
                case 6:
                    System.out.println("Выход.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }
        }
    }
}