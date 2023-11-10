package com.jionek;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class GuessTest {

    public static final int NUM_OF_RANDOM_GENERATIONS = 90;
    private Guess game;

    @BeforeEach
    void setUp() {
        game = new Guess();
    }

    @Test
    public void simpleWinGuess(){
        int randomNum = game.getRandomNum();
        String msg = game.guess(randomNum);
        Assertions.assertEquals("You guessed in 1 try", msg);
    }

    @Test
    public void oneWrongNegativeGuess(){
        String msg = game.guess(-1);
        Assertions.assertEquals("You didn't guess", msg);
    }

    @Test
    public void oneWrongPositiveGuess(){
        int randomNum = game.getRandomNum();
        String msg = game.guess(randomNum + 1);
        Assertions.assertEquals("You didn't guess", msg);
    }

    @RepeatedTest(50)
    public void testRandomNumGeneration(){
        // 1 2 3 4 5 6 7 8 9 10
        // 1 1 1 1 0 0 1 0 1 1
        int[] rndNumCount = new int[10];
        for (int counter = 0; counter< NUM_OF_RANDOM_GENERATIONS; counter++){
            Guess localGame = new Guess();
            int localRandomNum = localGame.getRandomNum();
            rndNumCount[localRandomNum-1] = 1;
        }
        int sumOfRndNumCount = Arrays.stream(rndNumCount).sum();
        Assertions.assertEquals(10, sumOfRndNumCount);
    }

    @Test
    public void testThreeWrongGuesses(){
        game.guess(-1);
        game.guess(-1);
        String msg = game.guess(-1);
        Assertions.assertEquals("You didn't guess and you've had three guesses", msg);
    }

    @Test
    public void testTwoWrongAndOneRightGuesses(){
        game.guess(-1);
        game.guess(-1);
        int correctNum = game.getRandomNum();
        String msg = game.guess(correctNum);
        Assertions.assertEquals("You guessed in 3 tries", msg);
    }

    @Test
    public void testOneWrongAndOneRightGuesses(){
        game.guess(-1);
        int correctNum = game.getRandomNum();
        String msg = game.guess(correctNum);
        Assertions.assertEquals("You guessed in 2 tries", msg);
    }

}
