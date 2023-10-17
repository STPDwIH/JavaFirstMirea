package ru.mirea.task3.obt8;

public class CurrencyConverterApp {
    public static void main(String[] args) {
        //актуальный курс USD/RUB
        double exchangeRateUSDtoRUB = 93.50; //курс на текущий момент

        // Создайте экземпляр класса CurrencyConverter с заданным обменным курсом
        CurrencyConverter converter = new CurrencyConverter(exchangeRateUSDtoRUB);

        // Конвертация суммы из USD в RUB
        double amountInUSD = 100.0;
        double amountInRUB = converter.usdToRub(amountInUSD);
        System.out.println(amountInUSD + " USD = " + amountInRUB + " RUB");

        // Конвертация суммы из RUB в USD
        double anotherAmountInRUB = 5000.0;
        double anotherAmountInUSD = converter.rubToUsd(anotherAmountInRUB);
        System.out.println(anotherAmountInRUB + " RUB = " + anotherAmountInUSD + " USD");
    }
}
