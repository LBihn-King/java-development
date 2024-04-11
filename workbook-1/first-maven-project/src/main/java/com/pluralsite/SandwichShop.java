package com.pluralsite;
import java.util.Scanner;
public class SandwichShop {

    static Scanner scanner = new Scanner(System.in);
    static float regPrice = 5.45f;
    static float largePrice = 8.95f;
    static float studentDiscount = 0.9f;
    static float seniorDiscount = 0.8f;
    static float regUpcharge = 1.0f;
    static float largeUpcharge = 1.75f;

    public static int getInt(Scanner scanner) {
        int num = scanner.nextInt();
        scanner.nextLine();
        return num;
    }

    public static void main(String[] args) {
        System.out.println("Select size\n   1) Regular: base price $5.45\n   2) Large: base price $8.95");
        int size = getInt(scanner);
            if (size != 1 && size != 2){
                System.out.println("Invalid input, try again and select either 1 or 2.");
                System.exit(0);
            }
        System.out.println("Loaded?\n   1)Yes\n   2)No");
        int loaded = getInt(scanner);

        System.out.println("Enter your age: ");
        int age = getInt(scanner);

        if (loaded == 1) {
            if (size == 1) {
                if (age <= 17) {
                    System.out.printf("$%.2f + loaded upcharge - student discount = $%.2f", regPrice, (regUpcharge + regPrice) * studentDiscount);
                } else if (age >= 65) {
                    System.out.printf("$%.2f + loaded upcharge - senior discount = $%.2f", regPrice, (regUpcharge + regPrice) * seniorDiscount);
                } else {
                    System.out.println("$" + regPrice);
                }

            } else if (size == 2){
                if (age >= 65) {
                    System.out.printf("$%.2f + loaded upcharge - senior discount = $%.2f", largePrice, (largeUpcharge + largePrice) * seniorDiscount);
                } else if (age <= 17) {
                    System.out.printf("$%.2f + loaded upcharge - student discount = $%.2f", largePrice, (largeUpcharge + largePrice) * studentDiscount);
                } else {
                    System.out.println("$" + largePrice);
                }

            }
        }

        if (loaded == 2) {
            if (size == 1) {
                if (age <= 17) {
                    System.out.printf("$%.2f - student discount = $%.2f", regPrice, regPrice * studentDiscount);
                } else if (age >= 65) {
                    System.out.printf("$%.2f - senior discount = $%.2f", regPrice, regPrice * seniorDiscount);
                } else {
                    System.out.println("$" + regPrice);
                }

            } else if (size == 2){
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
}

