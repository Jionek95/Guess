package com.jionek;

import java.util.Random;

public class Guess {
    public String guess(int randomNum) {
        return randomNum == getRandomNum() ? "You guessed right" : "You didn't guess";
    }

    public int getRandomNum() {
        Random random = new Random();
        int randomNum = random.nextInt(1,11);
        return randomNum;
    }

//    public static void main(String[] args) {
//
//        for (int count = 0; count<20; count++) {
//            System.out.println("My random number NO. " + count + " is : " + getRandomNum());
//        }
//    }
}
