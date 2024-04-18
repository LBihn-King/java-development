package com.pluralsite;

public class ForLoop {
    public static void main(String[] args) throws InterruptedException {
        int count;

        for (count = 10; count >= 1; count--) {
            System.out.println(count);
            Thread.sleep(1000);
            if (count == 1) {
                System.out.println("Launch");
                break;
            }

        }

    }
}
