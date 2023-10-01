package ru.mirea.task2.obt9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Poker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество игроков: ");
        int numPlayers = scanner.nextInt();

        if (numPlayers < 1 || numPlayers > 5) {
            System.out.println("Количество игроков должно быть от 1 до 5.");
            return;
        }

        List<String> deck = generateDeck();
        shuffleDeck(deck);

        int numCardsPerPlayer = 5;
        for (int player = 0; player < numPlayers; player++) {
            System.out.println("Игрок " + (player + 1) + ":");
            for (int card = 0; card < numCardsPerPlayer; card++) {
                String dealtCard = dealCard(deck);
                System.out.println(dealtCard);
            }
            System.out.println(); // Пустая строка для разделения игроков
        }
    }

    // Генерирует и возвращает стандартную колоду карт
    private static List<String> generateDeck() {
        List<String> deck = new ArrayList<>();
        String[] suits = {"Пики", "Черви", "Бубны", "Трефы"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз"};

        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(rank + " " + suit);
            }
        }

        return deck;
    }

    // Перетасовывает колоду карт
    private static void shuffleDeck(List<String> deck) {
        Collections.shuffle(deck);
    }

    // Раздает карту из колоды и удаляет ее
    private static String dealCard(List<String> deck) {
        if (deck.isEmpty()) {
            System.out.println("Колода пуста.");
            return "Колода пуста";
        }

        return deck.remove(0);
    }
}
