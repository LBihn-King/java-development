package com.pluralsite;
import java.io.*;

public class PayrollCalculator {
    private static String input;
    public static void main(String[] args) {
        readFile();
    }

    public static void readFile() {
        try {
            FileReader fileReader = new FileReader("employees.csv");
            BufferedReader bufReader = new BufferedReader(fileReader);
            boolean skipHeader = false;
            while ((input = bufReader.readLine()) != null) {
                if (!skipHeader) {
                    skipHeader = true;
                    continue;
                }
                parseFile();
            }
            bufReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void parseFile() {
        String[] section = input.split("\\|");
        int id = Integer.parseInt(section[0]);
        String name = section[1];
        double hours = Double.parseDouble(section[2]);
        double rate = Double.parseDouble(section[3]);
        Employee employee = new Employee(id, name, hours, rate);
        System.out.printf("%d, %s, earns $%.02f\n", Employee.getEmployeeID(), Employee.getName(), employee.getGrossPay());

    }
}