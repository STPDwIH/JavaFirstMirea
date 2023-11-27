package ru.mirea.dopZadanie1;



class List {
    private Element[] elements;
    private int size;
    private static final int MAX_SIZE = 100;

    public List() {
        elements = new Element[MAX_SIZE];
        size = 0;
    }

    public void addElement() {
        if (size < MAX_SIZE) {
            elements[size] = new Element();
            size++;
            System.out.println("Элемент добавлен.");
        } else {
            System.out.println("Список полон, невозможно добавить новый элемент.");
        }
    }

    public void removeElement(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size - 1; i++) {
                elements[i] = elements[i + 1];
            }
            size--;
            System.out.println("Элемент удален.");
        } else {
            System.out.println("Некорректный индекс для удаления.");
        }
    }

    public void displayElement(int index) {
        if (index >= 0 && index < size) {
            elements[index].displayAttributes();
        } else {
            System.out.println("Некорректный индекс для отображения.");
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clearList() {
        elements = new Element[MAX_SIZE];
        size = 0;
        System.out.println("Список очищен.");
    }
}
