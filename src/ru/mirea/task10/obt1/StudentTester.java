package ru.mirea.task10.obt1;

public class StudentTester {
    public static void main(String[] args) {
        // Создаем объекты студентов
        Student student1 = new Student("Андрей", "Сидорин", "Информатика", 2, "Группа А");
        Student student2 = new Student("Михаил", "Струев", "Математика", 1, "Группа Б");

        // Выводим информацию о студентах
        System.out.println("Студент 1:");
        System.out.println("Имя: " + student1.getFirstName());
        System.out.println("Фамилия: " + student1.getLastName());
        System.out.println("Специальность: " + student1.getSpecialty());
        System.out.println("Курс: " + student1.getCourse());
        System.out.println("Группа: " + student1.getGroup());

        System.out.println("\nСтудент 2:");
        System.out.println("Имя: " + student2.getFirstName());
        System.out.println("Фамилия: " + student2.getLastName());
        System.out.println("Специальность: " + student2.getSpecialty());
        System.out.println("Курс: " + student2.getCourse());
        System.out.println("Группа: " + student2.getGroup());

        // Изменяем значения свойств
        student1.setCourse(3);
        student2.setGroup("Группа В");

        // Выводим обновленную информацию о студентах
        System.out.println("\nОбновленная информация о студентах:");
        System.out.println("Студент 1:");
        System.out.println("Курс: " + student1.getCourse());

        System.out.println("Студент 2:");
        System.out.println("Группа: " + student2.getGroup());
    }
}
