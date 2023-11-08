package com.jionek;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GuessTest {

    @Test
    public void simpleWinGuess(){
        Guess game = new Guess();
        int randomNum = game.getRandomNum();
        String msg = game.guess(randomNum);
        Assertions.assertEquals("You won", msg);
    }

//    @Test
//    public void simpleWinGuess(){
//        Guess game = new Guess();
//        String msg = game.guess();
//        Assertions.assertEquals("You won", msg);
//    }
}
