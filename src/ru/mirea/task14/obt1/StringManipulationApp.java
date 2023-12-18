package ru.mirea.task14.obt1;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringManipulationApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        while (true) {
            System.out.println("\nМеню:");
            System.out.println("1. Извлечь все числа");
            System.out.println("2. Извлечь все слова");
            System.out.println("3. Заменить пробелы на дефисы");
            System.out.println("4. Выход");
            System.out.print("Выберите действие: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Очистить буфер после ввода числа

            switch (choice) {
                case 1:
                    extractNumbers(input);
                    break;
                case 2:
                    extractWords(input);
                    break;
                case 3:
                    replaceSpacesWithHyphens(input);
                    break;
                case 4:
                    System.out.println("Выход.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }
        }
    }

    public static void extractNumbers(String input) {
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(input);

        System.out.println("Все числа в строке:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    public static void extractWords(String input) {
        Pattern pattern = Pattern.compile("\\b[\\p{L}&&[^\\d]]+\\b", Pattern.UNICODE_CHARACTER_CLASS);
        Matcher matcher = pattern.matcher(input);

        System.out.println("Все слова в строке:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }


    public static void replaceSpacesWithHyphens(String input) {
        String result = input.replaceAll(" ", "-");
        System.out.println("Строка с пробелами, замененными на дефисы:");
        System.out.println(result);
    }
}