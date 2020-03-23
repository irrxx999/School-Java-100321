package ru.sbrf.lesson;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalcTest {

    @Test
    public void add() {
        Calc calc = new Calc();

        assertEquals(5, calc.add(2, 3));
    }
}