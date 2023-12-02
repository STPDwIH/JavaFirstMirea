package ru.mirea.task19.obt2;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;
public class LabClassUI {
    public static void main(String[] args) {
        LabClass labClass = new LabClass();

        LocalDate birthDate1 = LocalDate.of(2003, 5, 15);
        labClass.addStudent(new Student("Сидорин", "Андрей", 12345, 1.0, "Группа 1", "2 год", "Computer Science", birthDate1));

        LocalDate birthDate2 = LocalDate.of(2002, 7, 21);
        labClass.addStudent(new Student("Размаринов", "Фарадей", 56789, 3.5, "Группа 2", "3rd Year", "Engineering", birthDate2));

        LocalDate birthDate3 = LocalDate.of(2004, 3, 10);
        labClass.addStudent(new Student("Умников", "Сергей", 23456, 4.2, "Группа 1", "2nd Year", "Computer Science", birthDate3));

        Scanner scanner = new Scanner(System.in);
        Scanner choiceScan = new Scanner(System.in);

        while (true) {
            System.out.println("""
                    Меню выбора:
                    1) Сортировка студентов по среднему баллу
                    2) Поиск студента по имени
                    3) Выход""");
            int choice = Integer.parseInt(choiceScan.nextLine());

            switch (choice) {
                case 1:
                    selectionSortByGPA(labClass.getStudents()); // Сортировка по среднему баллу
                    List<Student> sortedStudents = labClass.getStudents();
                    System.out.println("Сортировка по среднему баллу (GPA)");
                    for (Student student : sortedStudents) {
                        System.out.println(student);
                    }
                    break;

                case 2:
                    System.out.print("Введите имя студента: ");
                    String fullName = scanner.nextLine();
                    try {
                        // Поиск студента по ФИО
                        Student student = labClass.findStudentByFullName(fullName);
                        System.out.println("Найден студент " + student);
                    } catch (StudentNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    return;
            }
        }
    }

    public static void selectionSortByGPA(List<Student> students) {
        int n = students.size();

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (students.get(j).getGPA() < students.get(minIndex).getGPA()) {
                    minIndex = j;
                }
            }

            Student temp = students.get(i);
            students.set(i, students.get(minIndex));
            students.set(minIndex, temp);
        }
    }
}
