package ru.mirea.task3.obt6;

public class DoubleConversion {
    public static void main(String[] args) {
        // Создание объектов класса Double с использованием методов valueOf()
        Double doubleObject1 = Double.valueOf(3.14);
        Double doubleObject2 = Double.valueOf(42.0);

        // Преобразование значения типа String в тип double
        String stringValue = "123.45";
        double doubleValue = Double.parseDouble(stringValue);

        // Преобразование объекта Double ко всем примитивным типам
        Double doubleObject = Double.valueOf(5.67);
        double prDouble = doubleObject.doubleValue();
        float prFloat = doubleObject.floatValue();
        long prLong = doubleObject.longValue();
        int prInt = doubleObject.intValue();
        short prShort = doubleObject.shortValue();
        byte prByte = doubleObject.byteValue();

        // Вывод значения объекта Double на консоль
        System.out.println("Значение doubleObject: " + doubleObject);

        // Преобразование литерала типа double к строке
        String d = Double.toString(3.14);

        // Вывод результатов
        System.out.println("объект1 double : " + doubleObject1);
        System.out.println("объект2 double: " + doubleObject2);
        System.out.println("doubleValue: " + doubleValue);
        System.out.println("Примитивные типы:");
        System.out.println("примитивный double: " + prDouble);
        System.out.println("примитивный float: " + prFloat);
        System.out.println("примитивный long: " + prLong);
        System.out.println("примитивный int: " + prInt);
        System.out.println("примитивный short: " + prShort);
        System.out.println("примитивный byte: " + prByte);
        System.out.println("d: " + d);
    }
}
