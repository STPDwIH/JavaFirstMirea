package ru.mirea.task7.obt6;

public class ProcessStrings implements StringProcessor{
    @Override
    public String process(String input) {
        // Пример обработки строки: преобразование в верхний регистр
        return input.toUpperCase();
    }
}
