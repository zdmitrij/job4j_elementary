package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleSwitchWeekTest {

    @Test
    public void whenMondaythen1() {
            int expected = 2;
            String name = "Вторник";
            int out = MultipleSwitchWeek.numberOfDay(name);
            Assert.assertEquals(expected, out);
    }

    @Test
    public void whenMondaythen6() {
        int expected = 6;
        String name = "Saturday";
        int out = MultipleSwitchWeek.numberOfDay(name);
        Assert.assertEquals(expected, out);
    }
}