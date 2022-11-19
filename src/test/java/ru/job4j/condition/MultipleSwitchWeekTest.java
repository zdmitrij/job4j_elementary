package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MultipleSwitchWeekTest {

    @Test
    public void whenMondaythen1() {
            int expected = 1;
            String name = "Понедельник";
            int out = MultipleSwitchWeek.numberOfDay(name);
            Assert.assertEquals(expected, out);
    }

    @Test
    public void whenSaturdaythen6() {
        int expected = 6;
        String name = "Saturday";
        int out = MultipleSwitchWeek.numberOfDay(name);
        Assert.assertEquals(expected, out);
    }
}