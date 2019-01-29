package com.namangupta;

public class Main {

    public static void main(String[] args) {

        /*int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("Your final score was " + highScore);

        highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score was " + highScore);*/

        displayHighScorePosition("Charlie", calculateHighScorePosition(1500));

        displayHighScorePosition("Alan", calculateHighScorePosition(900));

        displayHighScorePosition("Jake", calculateHighScorePosition(400));

        displayHighScorePosition("Ben", calculateHighScorePosition(50));

        displayHighScorePosition("Tim", calculateHighScorePosition(1000));

        displayHighScorePosition("Berta", calculateHighScorePosition(500));

        displayHighScorePosition("Carol", calculateHighScorePosition(100));

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String playerName, int position) {

        System.out.println(playerName + " managed to get into position " + position + " on the high score table");

    }

    public static int calculateHighScorePosition(int score) {

        if (score >= 1000) {
            return 1;
        } else if (score >= 500 && score < 1000) {
            return 2;
        } else if (score >= 100 && score < 500) {
            return 3;
        } else {
            return 4;
        }
    }

}
