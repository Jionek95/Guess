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
        String tryWord = numberOfGuesses == 1 ? "try" : "tries";
        String winMsg = String.format("You guessed in %d %s", numberOfGuesses, tryWord);

        if (numberOfGuesses == 3 && guessedNumber != getRandomNum()){
            return String.format("You didn't guess and you've had %d %s", numberOfGuesses, tryWord);
        }
        return guessedNumber == getRandomNum() ? winMsg : "You didn't guess";
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
