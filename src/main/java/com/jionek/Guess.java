package com.jionek;

import java.util.Random;

public class Guess {
    private final int randomNum;

    public Guess() {
        this.randomNum = new Random().nextInt(1,11);
    }

    public String guess(int guessedNumber) {
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
