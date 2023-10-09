package ru.mirea.task3.obt8;

public class CurrencyConverter {
    private double exchangeRateUSDtoRUB; // Обменный курс: 1 USD = X RUB

    public CurrencyConverter(double exchangeRateUSDtoRUB) {
        if (exchangeRateUSDtoRUB <= 0) {
            throw new IllegalArgumentException("Обменный курс должен быть положительным числом.");
        }
        this.exchangeRateUSDtoRUB = exchangeRateUSDtoRUB;
    }

    // Метод для конвертации суммы из USD в RUB
    public double usdToRub(double amountInUSD) {
        if (amountInUSD < 0) {
            throw new IllegalArgumentException("Сумма не может быть отрицательной.");
        }
        return amountInUSD * exchangeRateUSDtoRUB;
    }

    // Метод для конвертации суммы из RUB в USD
    public double rubToUsd(double amountInRUB) {
        if (amountInRUB < 0) {
            throw new IllegalArgumentException("Сумма не может быть отрицательной.");
        }
        return amountInRUB / exchangeRateUSDtoRUB;
    }

    // Установить новый обменный курс
    public void setExchangeRateUSDtoRUB(double exchangeRateUSDtoRUB) {
        if (exchangeRateUSDtoRUB <= 0) {
            throw new IllegalArgumentException("Обменный курс должен быть положительным числом.");
        }
        this.exchangeRateUSDtoRUB = exchangeRateUSDtoRUB;
    }

    // Получить текущий обменный курс
    public double getExchangeRateUSDtoRUB() {
        return exchangeRateUSDtoRUB;
    }
}
