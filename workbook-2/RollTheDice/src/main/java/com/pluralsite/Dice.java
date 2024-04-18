package com.pluralsite;

public class Dice {
    static int roll1;
    static int roll2;
    static int twoCounter;
    static int fourCounter;
    static int sixCounter;
    static int sevenCounter;
    public static void main(String[] args) {
        Dice dice = new Dice();
        int count;
        for (count = 0; count <= 100; count++) {
            roll1 = dice.roll();
            roll2 = dice.roll();
            int sum = roll1 + roll2;
            if (sum == 2){
                twoCounter++;
            } else if (sum == 4) {
                fourCounter++;
            } else if (sum == 6) {
                sixCounter++;
            } else if (sum == 7) {
                sevenCounter++;
            }
            System.out.println("Roll "+count+": "+ roll1 + "-" + roll2 + "  Sum: " + sum);
        }
        System.out.println("Two counter = " + twoCounter);
        System.out.println("Four counter = " + fourCounter);
        System.out.println("Six counter = " + sixCounter);
        System.out.println("Seven counter = " + sevenCounter);
    }

    public int roll() {
        return (int) (Math.random() * 6) + 1;
    }

}