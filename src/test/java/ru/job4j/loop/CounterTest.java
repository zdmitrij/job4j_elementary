package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenSumEvenNumbersFromTventyFiveToThirtyNineThenThirty() {
        int start = 25;
        int finish = 39;
        int result = Counter.sumByEven(start, finish);
        int expected = 224;
        assertThat(result).isEqualTo(expected);
    }
}