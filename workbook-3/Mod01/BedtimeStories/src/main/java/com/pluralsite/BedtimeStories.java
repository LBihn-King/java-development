package com.pluralsite;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class BedtimeStories {
    static FileInputStream fis;
    static Scanner fileScanner;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        storyOptions();
    }

    public static void storyOptions() {
        System.out.println("Choose a story you would like to read:\n1 - Goldilocks\n2 - Hansel and Gretel\n3 - Mary Had a Little Lamb");
        storySelect();
    }

    public static void storySelect() {
        try {
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    storyReader("goldilocks.txt");
                    break;
                case 2:
                    storyReader("hansel_and_gretel.txt");
                    break;
                case 3:
                    storyReader("mary_had_a_little_lamb.txt");
                    break;
            }
            fileScanner.close();
        }
        catch (Exception e) {
            System.out.println("Invalid input: number must be between  1-3");
            storyOptions();
        }
        scanner.close();
    }

    public static void storyReader(String fileName) throws FileNotFoundException {
        fis = new FileInputStream(fileName);
        fileScanner = new Scanner(fis);
        String input;
        int lineNumber = 1;
        while (fileScanner.hasNextLine()) {
            input = fileScanner.nextLine();
            System.out.println(lineNumber + " " + input);
            lineNumber++;
        }
    }
}
