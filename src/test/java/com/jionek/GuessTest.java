package com.jionek;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GuessTest {

    private Guess game;

    @BeforeEach
    void setUp() {
        game = new Guess();
    }

    @Test
    public void simpleWinGuess(){
        int randomNum = game.getRandomNum();
        String msg = game.guess(randomNum);
        Assertions.assertEquals("You guessed right", msg);
    }

    @Test
    public void oneWrongNegativeGuess(){
        Guess game = new Guess();
        String msg = game.guess(-1);
        Assertions.assertEquals("You didn't guess", msg);
    }
    @Test
    public void oneWrongPositiveGuess(){
        Guess game = new Guess();
        int randomNum = game.getRandomNum();
        String msg = game.guess(randomNum + 1);
        Assertions.assertEquals("You didn't guess", msg);
    }
}
