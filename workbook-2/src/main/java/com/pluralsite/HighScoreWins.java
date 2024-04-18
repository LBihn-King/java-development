package com.pluralsite;
import java.util.Scanner;

public class HighScoreWins {
    static Scanner scanner = new Scanner(System.in);
    static String gameScore;
    static String teamOneName;
    static String teamTwoName;
    static int teamOneScore;
    static int teamTwoScore;

    private static void getScore() {
        System.out.println("Enter game score: ");
        gameScore = scanner.nextLine().trim();
    } //t1:t2|1:2

    private static void parseScore() {
        getScore();
        String[] input = gameScore.split("\\|");
        String teamNames = input[0];
        String teamScores = input[1];
        String[] nameSplit = teamNames.split(":");
        teamOneName = nameSplit[0];
        teamTwoName = nameSplit[1];
        String[] scoreSplit = teamScores.split(":");
        teamOneScore = Integer.parseInt(scoreSplit[0]);
        teamTwoScore = Integer.parseInt(scoreSplit[1]);
    }

    private static void getWinner() {
        parseScore();
        if (teamOneScore > teamTwoScore) {
            System.out.println("Winner: " + teamOneName);
        } else if (teamOneScore < teamTwoScore){
            System.out.println("Winner: " + teamTwoName);
        } else {
            System.out.println("Draw");
        }
    }

    public static void main(String[] args) {
        getWinner();
    }

}
