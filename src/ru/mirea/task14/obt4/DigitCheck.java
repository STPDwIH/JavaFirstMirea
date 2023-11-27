package ru.mirea.task14.obt4;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class DigitCheck {
    public static void main(String[] args) {
        String text = "(1 + 8) - 9 / 4"; // Ваш текст для проверки

        Pattern pattern = Pattern.compile("\\b\\d+(?!\\+)\\b");
        Matcher matcher = pattern.matcher(text);

        System.out.println("Цифры без знака «+» в тексте:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
