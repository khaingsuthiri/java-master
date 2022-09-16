package com.kstr;

public class Main {

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get the position " + highScorePosition + " on the high score table.");
    }

    public static int calculateHighScorePosition(int score) {
        if(score>=1000) {
            return 1;
        } else if(score >= 500) {
            return 2;
        } else if(score >= 100) {
            return 3;
        } else {
            return 4;
        }
    }
    public static void main(String[] args) {

	    int score = calculateHighScorePosition(1500);
        displayHighScorePosition("Kyaw Kyaw", score);

        score = calculateHighScorePosition(900);
        displayHighScorePosition("Aung Aung", score);

        score = calculateHighScorePosition(400);
        displayHighScorePosition("Tun Tun", score);

        score = calculateHighScorePosition(50);
        displayHighScorePosition("Mg Mg", score);

        score = calculateHighScorePosition(1000);
        displayHighScorePosition("Ko Ko", score);
    }
}
