package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SwitchArrayTest {
    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSwap2to4() {
        int[] input = {4, 14, 54, 34, 44, 24, 64};
        int source = 2;
        int dest = 5;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 14, 24, 34, 44, 54, 64};
        assertThat(result).containsExactly(expected);
    }
}