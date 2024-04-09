package com.pluralsite;

public class PracticeOperations {
    private String string1, string2, string3;
    private double double1, double2, double3;

    public PracticeOperations(String string1, String string2, String string3, double double1, double double2, double double3) {
        this.string1 = string1;
        this.string2 = string2;
        this.string3 = string3;
        this.double1 = double1;
        this.double2 = double2;
        this.double3 = double3;
        calculate();
    }

    private void calculate() {
        String jointString = string1 + string2 + string3;
        System.out.println("Concatenated String: " + jointString);
        double addResult = (double1 + double2) + double3;
        System.out.println("Add Result: " + addResult);
        double subtResult = (double1 - double2) + double3;
        System.out.println("Subtract Result: " + subtResult);
        double multResult = (double1 * double2) + double3;
        System.out.println("Multiply Result: " + multResult);
        double divResult = (double1 / double2) / double3;
        System.out.println("Divide Result: " + divResult);

        double divResultPlusNums = (((divResult + 10) + 100) + 1000);
        System.out.println("Division Results + 10, 100, 1000: " + divResultPlusNums);

    }

    public static void main(String[] args) {
        PracticeOperations practice = new PracticeOperations("string1 ", "string2 ", "string3", 1.1, 2.2, 3.3);
    }
}