package ru.mirea.task6.obt11;

public class TemperatureConverter implements Convertible{
    @Override
    public double convert(double celsiusTemperature) {
        // Конвертация в Кельвины
        double kelvin = celsiusTemperature + 273.15;

        // Конвертация в Фаренгейты
        double fahrenheit = (celsiusTemperature * 9/5) + 32;

        System.out.println(celsiusTemperature + "°C равно " + kelvin + " K");
        System.out.println(celsiusTemperature + "°C равно " + fahrenheit + "°F");

        return kelvin;
    }
}
