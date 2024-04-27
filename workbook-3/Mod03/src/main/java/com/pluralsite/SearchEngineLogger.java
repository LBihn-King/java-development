package com.pluralsite;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class SearchEngineLogger {
    public static void main(String[] args) {
        search();
    }

    public static void search(){
        Scanner scanner = new Scanner(System.in);
        logAction("launch");

        do {
            System.out.println("Enter a search term (X to exit): ");
            String item = scanner.nextLine();
            if (item.equalsIgnoreCase("x")){
                return;
            } else {
                logAction("search : "+item);
            }

        } while (true);
    }
    public static void logAction(String action){
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("logs.txt", true));
            bufferedWriter.write(getCurrentDateTime()+" "+action+"\n");
            bufferedWriter.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getCurrentDateTime() {
        LocalDateTime time = LocalDateTime.now();
        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return timeFormat.format(time);
    }

}
