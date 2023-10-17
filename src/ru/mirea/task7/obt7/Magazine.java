package ru.mirea.task7.obt7;

public class Magazine implements Printable {
    private String title;

    public Magazine(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("Выводим журнал: " + title);
    }

    // Статический метод для вывода названий журналов
    public static void printMagazines(Printable[] printable) {
        for (Printable item : printable) {
            if (item instanceof Magazine) {
                ((Magazine) item).print();
            }
        }
    }
}
