package ru.mirea.task13.obt2;

public class PersonTester {
    public static void main(String[] args) {
        Person person1 = new Person("Сидорин", "Андрей", "Михайлович");
        System.out.println(person1.getFullName()); // Выводит "Иванов И.И."

        Person person2 = new Person("Сидорин", "Андрей", "");
        System.out.println(person2.getFullName()); // Выводит "Петров П."

        Person person3 = new Person("Сидорин", "", "");
        System.out.println(person3.getFullName()); // Выводит "Сидоров"
    }
}
