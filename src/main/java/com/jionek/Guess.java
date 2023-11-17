package com.jionek;

import java.util.Random;

public class Guess {
    private final int randomNum;
    private int numberOfGuesses;

    public Guess() {
        this.randomNum = new Random().nextInt(1,11);
        this.numberOfGuesses = 0;
    }

    public String guess(int guessedNumber) {
        numberOfGuesses++;

        String endMsg;
        String tryWord = numberOfGuesses == 1 ? "try" : "tries";
        String winMsg = String.format("You guessed in %d %s", numberOfGuesses, tryWord);
        String loseMsg = String.format("You didn't guess and you've had %d %s", numberOfGuesses, tryWord);

        if (numberOfGuesses > 3){
            endMsg = "There's limit of 3 tries. Your game is over";
        } else if (numberOfGuesses == 3 && guessedNumber != getRandomNum()) {
            endMsg = loseMsg + " GAME OVER!!!";
        } else if (guessedNumber != getRandomNum()) {
            String lowHighMsg = null;
            if (guessedNumber < getRandomNum()){
                lowHighMsg = ". You're too low";
            } else if (guessedNumber > getRandomNum()) {
                lowHighMsg = ". You're too high";
            }
            endMsg = loseMsg + lowHighMsg;
        } else endMsg = winMsg;

        return endMsg;
    }

    public int getRandomNum() {
        return randomNum;
    }

    public static void main(String[] args) {

        Guess game = new Guess();
        boolean shouldContinue = true;
        System.out.println("Welcome to Guessing_Game!");

        do {
            String input = System.console().readLine("Enter a number: ");
            if (input.contains("q")){
                return;
            }
            String output = game.guess(Integer.parseInt(input));
            System.out.println(output);
            if (output.contains("guessed") || output.toLowerCase().contains("over")){
                shouldContinue = false;
            }
        } while (shouldContinue);

    }
}
