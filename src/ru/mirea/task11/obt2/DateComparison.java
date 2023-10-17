package ru.mirea.task11.obt2;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;
public class DateComparison {
    public static void main(String[] args) {
        // Получение текущей даты и времени
        Date currentDate = new Date();

        // Ввод даты от пользователя
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите дату (в формате dd.MM.yyyy HH:mm:ss): ");
        String userDateStr = scanner.nextLine();
        scanner.close();

        try {
            // Преобразование введенной строки в объект Date
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
            Date userDate = dateFormat.parse(userDateStr);

            // Сравнение дат
            if (currentDate.before(userDate)) {
                System.out.println("Текущая дата меньше введенной даты.");
            } else if (currentDate.after(userDate)) {
                System.out.println("Текущая дата больше введенной даты.");
            } else {
                System.out.println("Текущая дата и введенная дата равны.");
            }
        } catch (Exception e) {
            System.out.println("Некорректный формат введенной даты.");
        }
    }
}
