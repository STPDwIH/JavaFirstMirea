package ru.mirea.task10.obt1;

public class StudentTester {
    public static void main(String[] args) {
        // Создаем объект студента
        Student student = new Student("Андрей", "Сидорин", "Информатика", 2, "Группа А");

        // Выводим информацию о студенте
        System.out.println("Имя: " + student.getFirstName());
        System.out.println("Фамилия: " + student.getLastName());
        System.out.println("Специальность: " + student.getSpecialty());
        System.out.println("Курс: " + student.getCourse());
        System.out.println("Группа: " + student.getGroup());
    }

}
