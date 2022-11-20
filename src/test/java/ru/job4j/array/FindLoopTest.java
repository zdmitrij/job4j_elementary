package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class FindLoopTest {
    @Test
    public void whenArrayHas5Then0() {
        int[] data = new int[] {5, 10, 3};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenArrayHas33Then5() {
        int[] data = new int[] {7, 19, 58, 798, 5, 33, 116};
        int el = 33;
        int result = FindLoop.indexOf(data, el);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenArrayHasNot11ThenMinus1() {
        int[] data = new int[] {17, 11, 4, 24, 111};
        int el = 10;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }
}