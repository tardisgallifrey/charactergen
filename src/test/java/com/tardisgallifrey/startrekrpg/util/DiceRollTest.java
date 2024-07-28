package com.tardisgallifrey.startrekrpg.util;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class DiceRollTest {

    @Test
    void d6RollInsideBounds() {
        //method is static
        //D6 dice roll is between 1 and 6
        //Should never equal 0 or 7
        assertNotEquals(7, Dice.D6());
        assertNotEquals(0, Dice.D6());

    }

    @Test
    void d20RollInsideBounds() {
        //D20 must be between 1 and 20
        assertNotEquals(0, Dice.D20());
        assertNotEquals(21, Dice.D20());
    }



}