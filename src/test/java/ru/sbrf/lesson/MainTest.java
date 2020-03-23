package ru.sbrf.lesson;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {

    Main main;

    @Test
    public void main() {
    }

    @Test
    public void calc() {
        main = new Main();

        assertEquals(11, main.calc());
    }
}