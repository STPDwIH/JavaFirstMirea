package ru.mirea.task2.obt1;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Andrew", "bokapower@yandex.ru", 'M');

        // Вывод информации об авторе
        System.out.println("Author's name: " + author.getName());
        System.out.println("Author's email: " + author.getEmail());
        System.out.println("Author's gender: " + author.getGender());

        // Изменение email автора
        author.setEmail("sidorin.m.a@mirea.ru");
        System.out.println("Updated email: " + author.getEmail());

        // Вывод информации об авторе с использованием метода toString
        System.out.println(author.toString());
    }
}
