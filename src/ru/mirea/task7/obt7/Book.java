package ru.mirea.task7.obt7;

public class Book implements Printable {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("Выводим книгу: " + title);
    }
}
