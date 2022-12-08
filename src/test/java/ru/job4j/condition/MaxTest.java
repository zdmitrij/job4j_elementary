package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {
    @Test
    public void whenMax8To9Then9() {
        int left = 8;
        int right = 9;
        int result = Max.max(left, right);
        int expected = 9;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax5To1Then5() {
        int left = 5;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax4To4Then4() {
        int left = 4;
        int right = 4;
        int result = Max.max(left, right);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax15To1Plus3Then15() {
        int left = 15;
        int right = 1;
        int middle = 3;
        int result = Max.max(left, right, middle);
        int expected = 15;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void when7Plus8Plus9Minus4Then20() {
        int left = 7;
        int right = 8;
        int middle = 9;
        int maximal = 4;
        int result = Max.max(left, right, middle, maximal);
        int expected = 20;
        assertThat(result).isEqualTo(expected);
    }
}