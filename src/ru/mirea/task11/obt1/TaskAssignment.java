package ru.mirea.task11.obt1;
import java.util.Date;

public class TaskAssignment {
    public static void main(String[] args) {
        // Фамилия разработчика
        String developerName = "Сидорин";

        // Дата и время получения задания
        Date dateReceived = new Date();

        // Симулируем задержку в выполнении задания (в миллисекундах)
        try {
            Thread.sleep(2000); // Подождем 2 секунды
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Дата и время сдачи задания (после задержки)
        Date dateSubmitted = new Date();

        // Выводим информацию
        System.out.println("Фамилия разработчика: " + developerName);
        System.out.println("Дата и время получения задания: " + dateReceived);
        System.out.println("Дата и время сдачи задания: " + dateSubmitted);
    }
}
