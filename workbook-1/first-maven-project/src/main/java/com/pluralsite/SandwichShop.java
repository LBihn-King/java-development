package com.pluralsite;
import java.util.Scanner;
public class SandwichShop {

    static Scanner scanner = new Scanner(System.in);
    static float regPrice = 5.45f;
    static float largePrice = 8.95f;
    static float studentDiscount = 0.9f;
    static float seniorDiscount = 0.8f;

    public static int getInt(Scanner scanner) {
        int num = scanner.nextInt();
        scanner.nextLine();
        return num;
    }

    public static void main(String[] args) {
        System.out.println("Select size\n   1) Regular: base price $5.45\n   2) Large: base price $8.95");
        int size = getInt(scanner);
        System.out.println("Enter your age: ");
        int age = getInt(scanner);

        if (size == 1) {
            if (age <= 17) {
                System.out.printf("$%.2f - student discount = $%.2f", regPrice, regPrice * studentDiscount);
            } else if (age >= 65) {
                System.out.printf("$%.2f - senior discount = $%.2f", regPrice, regPrice * seniorDiscount);
            } else {
                System.out.println("$" + regPrice);
            }
        } else if (size == 2) {
            if (age >= 65) {
                System.out.printf("$%.2f - senior discount = $%.2f", largePrice, largePrice * seniorDiscount);
            } else if (age <= 17) {
                System.out.printf("$%.2f - student discount = $%.2f", largePrice, largePrice * studentDiscount);
            } else {
                System.out.println("$" + largePrice);
            }

        }
    }
}

