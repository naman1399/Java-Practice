package com.namangupta;

public class Main {

    public static void main(String[] args) {

        /*int newScore = calculateScore("Time", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();*/

        System.out.println("13 feet 1 inch = " + calcFeetAndInchesToCentimeters(13,1) + " cm");
        System.out.println("157 inch = " + calcFeetAndInchesToCentimeters(157) + " cm");

    }

    public static double calcFeetAndInchesToCentimeters(int feet, int inch) {
        if (feet >= 0 && inch >=0 && inch <=12) {
            double cm = feet * 12d * 2.54d;
            cm += inch * 2.54d;
            return cm;
        }
        return -1;
    }

    public static double calcFeetAndInchesToCentimeters(int inch) {
        if (inch >= 0) {
            int feet = inch/12;
            int inches = inch%12;
            System.out.println(inch + " inches = " + feet + " feet and " + inches + " inch");
            double cm = calcFeetAndInchesToCentimeters(feet, inches);
            return cm;
        }
        return -1;
    }

    /*public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }


    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score");
        return 0;
    }*/

}
