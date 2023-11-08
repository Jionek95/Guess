package com.jionek;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GuessTest {

    @Test
    public void simpleWinGuess(){
        Guess game = new Guess();
        int randomNum = game.getRandomNum();
        String msg = game.guess(randomNum);
        Assertions.assertEquals("You guessed right", msg);
    }

    @Test
    public void oneWrongGuess(){
        Guess game = new Guess();
        String msg = game.guess(-1);
        Assertions.assertEquals("You didn't guess", msg);
    }
}
