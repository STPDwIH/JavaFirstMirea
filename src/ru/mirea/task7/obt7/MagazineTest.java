package ru.mirea.task7.obt7;

public class MagazineTest {
    public static void main(String[] args) {
        Magazine magazine1 = new Magazine("Ловкий и быстрый ");
        Magazine magazine2 = new Magazine("Умный и сильный");
        Book book1 = new Book("Черновик ");
        Book book2 = new Book("Чистовик");

        Printable[] printableItems = {magazine1, magazine2, book1, book2};

        System.out.println("Все печатаемые издания:");
        for (Printable item : printableItems) {
            item.print();
        }

        System.out.println("\nТолько журналы:");
        Magazine.printMagazines(printableItems);
    }
}
