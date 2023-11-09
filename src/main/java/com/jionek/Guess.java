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
        if (numberOfGuesses == 3){
            return "You didn't guess and you've had three guesses";
        }
        return guessedNumber == getRandomNum() ? "You guessed right" : "You didn't guess";
    }

    public int getRandomNum() {
        return randomNum;
    }

//    public static void main(String[] args) {
//
//        for (int count = 0; count<20; count++) {
//            System.out.println("My random number NO. " + count + " is : " + getRandomNum());
//        }
//    }
}
