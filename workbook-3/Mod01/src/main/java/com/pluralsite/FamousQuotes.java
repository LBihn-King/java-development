package com.java;
import java.util.Scanner;
public class FamousQuotes {
    static Scanner scanner = new Scanner(System.in);
    static String[] quotes = {"quote1", "quote2", "quote3", "quote4", "quote5", "quote6", "quote7", "quote8", "quote9", "quote10"};

    public static void main(String[] args) {
        home();
    }

    public static void home() {
        System.out.println("1) Choose quote\n2) Random quote\n3) Exit");
        int choice = scanner.nextInt();
        if (choice == 1) {
            quoteSelect();
        } else if (choice == 2) {
            randomQuote();
        } else {
            System.out.println("Goodbye");
            System.exit(0);
        }
    }

    public static void quoteSelect() {
        try {
            System.out.println("pick quote (#1-#10): ");
            int index = scanner.nextInt();
            index--;
            System.out.println(quotes[index]);
            anotherQuote();
        } catch (Exception e) {
            System.out.println("Number out of range");
            quoteSelect();
        }
    }

    public static void anotherQuote() {
        System.out.println("Would you like another?\n1) Yes\n21) No");
        int choice = scanner.nextInt();
        if (choice == 1) {
            home();
        } else {
            System.out.println("Goodbye");
            System.exit(0);
        }
    }
    public static void randomQuote() {
        int index = (int)(Math.random() * 11);
        System.out.println(quotes[index]);
        anotherQuote();
    }
}