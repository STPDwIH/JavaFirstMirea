package ru.mirea.task4.obt4;

public class Memory {
    private int size; // в ГБ
    private String type;

    public Memory(int size, String type) {
        this.size = size;
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public String getType() {
        return type;
    }
    public String toString() {
        return "Память: " + size + " ГБ, Тип: " + type;
    }
}
