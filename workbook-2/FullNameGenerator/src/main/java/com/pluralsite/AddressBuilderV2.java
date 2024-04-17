package com.pluralsite;
import java.util.Scanner;

public class AddressBuilderV2 {
    static Scanner scanner = new Scanner(System.in);
    static String name;
    static String billingAddress;
    static String shippingAddress;
    private static void getName() {
        System.out.println("Enter your name: ");
        name = scanner.nextLine().trim();
    }
    public static void getBilling() {
        System.out.println("Enter billing address");
        System.out.println("Street: ");
        String billingStreet = scanner.nextLine().trim();
        System.out.println("City: ");
        String billingCity = scanner.nextLine().trim();
        System.out.println("State: ");
        String billingState = scanner.nextLine().trim();
        System.out.println("Zip code: ");
        int billingZip = scanner.nextInt();
        scanner.nextLine();
        billingAddress = "Billing address:\n"+billingStreet+"\n"+billingCity+", "+billingState+" "+billingZip;
    }

    public static void getShipping() {
        System.out.println("Is your shipping address the same as your billing address? Y/N ");
        char doesMatch = scanner.next().charAt(0);
        if (doesMatch == 'Y' || doesMatch == 'y') {
            shippingAddress = String.valueOf(billingAddress);
        } else {
            System.out.println("Enter shipping address");
            System.out.println("Street: ");
            String shippingStreet = scanner.nextLine().trim();
            System.out.println("City: ");
            String shippingCity = scanner.nextLine().trim();
            System.out.println("State: ");
            String shippingState = scanner.nextLine().trim();
            System.out.println("Zip code: ");
            int shippingZip = scanner.nextInt();
            scanner.nextLine();
            shippingAddress = "Shipping address:\n" + shippingStreet + "\n" + shippingCity + ", " + shippingState + " " + shippingZip;
        }
    }

    public static void createAddress() {
        System.out.println("Please enter the following information:");
        getName();
        getBilling();
        getShipping();
        System.out.println(name+"\n\n"+billingAddress+"\n\n"+shippingAddress);
    }

    public static void main(String[] args) {
        createAddress();
    }
}
