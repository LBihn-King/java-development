package com.pluralsite;

public class Employee {
    static int employeeID;
    static String name;
    static double hoursWorked;
    static double payRate;

    public Employee(int employeeID, String name, double hoursWorked, double payRate) {
        this.employeeID = employeeID;
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }

    public static void setEmployeeID(int employeeID) {
        Employee.employeeID = employeeID;
    }
    public static void setName(String name) {
        Employee.name = name;
    }
    public static void setHoursWorked(double hoursWorked) {
        Employee.hoursWorked = hoursWorked;
    }
    public static void setPayRate(double payRate) {
        Employee.payRate = payRate;
    }

    public static int getEmployeeID() {
        return employeeID;
    }
    public static String getName() {
        return name;
    }
    public static double getHoursWorked() {
        return hoursWorked;
    }
    public static double getPayRate() {
        return payRate;
    }
    public double getGrossPay(){
        return hoursWorked*payRate;
    }

}
