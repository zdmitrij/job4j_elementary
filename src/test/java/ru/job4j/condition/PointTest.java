package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when18to75then6dot7() {
        double expected = 6.7;
        Point a = new Point(1, 8);
        Point b = new Point(7, 5);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when42to90then13dot15() {
        double expected = 13.15;
        Point a = new Point(4, 2);
        Point b = new Point(-9, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when55to89then5() {
        double expected = 5;
        Point a = new Point(5, 5);
        Point b = new Point(8, 9);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}