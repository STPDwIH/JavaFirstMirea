package ru.mirea.task10.obt3;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StudentList {
    public static void main(String[] args) {
        List<Student> list1 = new ArrayList<>();
        list1.add(new Student("Alice", 103));
        list1.add(new Student("Bob", 102));

        List<Student> list2 = new ArrayList<>();
        list2.add(new Student("Charlie", 101));
        list2.add(new Student("David", 104));

        // Объединяем оба списка в один
        List<Student> mergedList = new ArrayList<>(list1);
        mergedList.addAll(list2);

        // Сортируем объединенный список по ID студента
        mergedList = mergedList.stream()
                .sorted(Comparator.comparing(Student::getId))
                .collect(Collectors.toList());

        // Выводим отсортированный список студентов
        for (Student student : mergedList) {
            System.out.println("Name: " + student.getName() + ", ID: " + student.getId());
        }
    }
}
