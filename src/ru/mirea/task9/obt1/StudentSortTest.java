package ru.mirea.task9.obt1;

public class StudentSortTest {
    public static void main(String[] args) {
        //массив объектов student
        Student[] students = {
                new Student(3, "Alice"),
                new Student(1, "Bob"),
                new Student(4, "Charlie"),
                new Student(2, "David"),
                new Student(5, "Eve")
        };

        System.out.println("Исходный массив студентов:");
        printStudents(students);//выводим исходный массив

        sortStudentsByIDNumber(students);// Сортируем студентов по полю iDNumber

        System.out.println("\nОтсортированный массив студентов по iDNumber:");
        printStudents(students);// Выводим отсортированный массив
    }

    // Метод для сортировки массива студентов по полю iDNumber с использованием сортировки вставками
    public static void sortStudentsByIDNumber(Student[] students) {
        int n = students.length;
        for (int i = 1; i < n; i++) {
            Student currentStudent = students[i];
            int j = i - 1;
            while (j >= 0 && students[j].getIDNumber() > currentStudent.getIDNumber()) {
                students[j + 1] = students[j];
                j--;
            }
            students[j + 1] = currentStudent;
        }
    }

    // Метод для вывода массива студентов
    public static void printStudents(Student[] students) {
        for (Student student : students) {
            System.out.println("ID: " + student.getIDNumber() + ", Name: " + student.getName());
        }
    }
}
