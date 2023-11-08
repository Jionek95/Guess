package com.jionek;

public class Guess {
    public String guess(int randomNum) {
        return randomNum == getRandomNum() ? "You guessed right" : "You didn't guess";
    }

    public int getRandomNum() {
        return 0;
    }
}
