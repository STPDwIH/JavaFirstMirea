package ru.mirea.task6.obt11;

public class TemperatureConversion {
    public static void main(String[] args) {
        Convertible converter = new TemperatureConverter();

        double celsiusTemperature = 30.0; // Пример температуры в градусах Цельсия
        converter.convert(celsiusTemperature);
    }
}
