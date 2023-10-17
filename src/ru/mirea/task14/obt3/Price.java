package ru.mirea.task14.obt3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Price {
    public static void main(String[] args) {
        String text = "Список цен: 25.98 USD, 500 RUB, 12.50 EUR, 44 ERR, 0.004 EU.";

        // Создаем регулярное выражение для поиска цен в USD, RUB и EUR
        String regex = "(\\d+\\.\\d{2}) (USD|RUB|EUR)";//поиск для двух цифр после точек и юсд руб еур

        // Компилируем регулярное выражение
        Pattern pattern = Pattern.compile(regex);
        //Компилируем регулярное выражение, который будет использоваться для поиска соответствий.

        // Создаем Matcher для текста
        Matcher matcher = pattern.matcher(text); //выполняет поиск в соответствии с нужным выражением

        // Ищем и выводим найденные цены
        while (matcher.find()) {
            String price = matcher.group(1);//первая группа - число с двумя знаками после .
            String currency = matcher.group(2);//вторая группа - юсд руб еур
            System.out.println("Цена: " + price + " " + currency);
        }
    }
}
