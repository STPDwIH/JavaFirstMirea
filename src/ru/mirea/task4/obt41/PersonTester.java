package ru.mirea.task4.obt41;

public class PersonTester {
    public static void main(String[] args) {
        // Создаем объекты класса Person с использованием обоих конструкторов
        Person person1 = new Person();
        Person person2 = new Person("Сидорин Андрей", 19);

        // Вызываем методы move() и talk() для каждого объекта
        person1.move();
        person1.talk();

        person2.move();
        person2.talk();
    }
}
