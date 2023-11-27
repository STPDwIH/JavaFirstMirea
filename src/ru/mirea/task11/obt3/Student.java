package ru.mirea.task11.obt3;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Student {
    private String name;
    private LocalDate dateOfBirth;

    // Конструктор класса
    public Student(String name, LocalDate dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    // Переопределение метода toString для вывода информации о студенте
    @Override
    public String toString() {
        return "Студент{" +
                "Имя='" + name + '\'' +
                ", Дата Рождения=" + dateOfBirth +
                '}';
    }

    // Метод для форматированного вывода даты рождения
    public String formatDate(String format) {
        DateTimeFormatter formatter;
        switch (format) {
            case "short":
                formatter = DateTimeFormatter.ofPattern("d/MM/yy");
                break;
            case "medium":
                formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                break;
            case "full":
                formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
                break;
            default:
                formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                break;
        }
        return dateOfBirth.format(formatter);
    }

    public static void main(String[] args) {
        Student student = new Student("Сидорин Андрей", LocalDate.of(2004, 2, 05));
        System.out.println(student); // Вывод информации о студенте

        System.out.println("Короткий формат: " + student.formatDate("short"));
        System.out.println("Средний формат: " + student.formatDate("medium"));
        System.out.println("Полный формат: " + student.formatDate("full"));
    }
}
