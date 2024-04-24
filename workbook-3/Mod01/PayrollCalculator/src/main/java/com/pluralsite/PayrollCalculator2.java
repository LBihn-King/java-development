package com.pluralsite;

import java.util.Scanner;
import java.io.*;

public class PayrollCalculator2 {
    static Scanner scanner = new Scanner(System.in);
    static String input;
    static String output;
    static String inputFile;
    static String outputFile;
    public static void main(String[] args) {
        fileEditor();
    }

    public static void fileEditor() {
        getFileNames();
        try {
            BufferedReader bufReader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter bufWriter = new BufferedWriter(new FileWriter(outputFile));
            boolean skipHeader = false;
            while ((input = bufReader.readLine()) != null) {
                if (!skipHeader) {
                    skipHeader = true;
                    continue;
                }
                parseFile();
                bufWriter.write(output);
            }
            bufReader.close();
            bufWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void parseFile() {
        String[] section = input.split("\\|");
        int id = Integer.parseInt(section[0]);
        String name = section[1];
        double hoursWorked = Double.parseDouble(section[2]);
        double payRate = Double.parseDouble(section[3]);
        Employee employee = new Employee(id, name, hoursWorked, payRate);
        output = String.format("%d, %s, earns $%.02f\n", id, name, employee.getGrossPay());
    }


    public static void getFileNames() {
        System.out.println("Enter the name of the file employee file to process: ");
        inputFile = scanner.nextLine();
        System.out.println("Enter the name of the payroll file to create: ");
        outputFile = scanner.nextLine();
        scanner.close();
    }
}