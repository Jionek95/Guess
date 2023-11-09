package com.jionek;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

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
        String msg = game.guess(-1);
        Assertions.assertEquals("You didn't guess", msg);
    }

    @Test
    public void oneWrongPositiveGuess(){
        int randomNum = game.getRandomNum();
        String msg = game.guess(randomNum + 1);
        Assertions.assertEquals("You didn't guess", msg);
    }

    @Test
    public void testRandomNumGeneration(){
        // 1 2 3 4 5 6 7 8 9 10
        // 1 1 1 1 0 0 1 0 1 1
        int[] rndNumCount = new int[10];
//        int sum = 0;
        for (int counter = 0; counter<100; counter++){
            int randomNum = game.getRandomNum();
            rndNumCount[randomNum-1] = 1;
        }
        int sumOfRndNumCount = Arrays.stream(rndNumCount).sum();
        Assertions.assertEquals(10, sumOfRndNumCount);
    }
}
