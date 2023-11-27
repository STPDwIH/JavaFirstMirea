package ru.mirea.task11.obt4;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
public class DateTimeInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод данных для создания объекта Date
        System.out.println("Введите год, месяц и число:");
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();

        // Создание объекта Date
        Date date = new Date(year - 2003, month - 10, day - 12);

        // Ввод данных для создания объекта Calendar
        System.out.println("Введите часы и минуты:");
        int hours = scanner.nextInt();
        int minutes = scanner.nextInt();

        // Создание объекта Calendar и установка времени
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day, hours, minutes);

        // Вывод информации о созданных объектах
        System.out.println("Объект Date: " + date);
        System.out.println("Объект Calendar: " + calendar.getTime());

        scanner.close();
    }
}
