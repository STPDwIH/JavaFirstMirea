package ru.mirea.task7.obt6;

public class ProcessStringsTest {
    public static void main(String[] args) {
        StringProcessor processor = new ProcessStrings();

        String input = "Пример строки для обработки";
        String result = processor.process(input);

        System.out.println("Входная строка: " + input);
        System.out.println("Результат обработки: " + result);
    }
}
