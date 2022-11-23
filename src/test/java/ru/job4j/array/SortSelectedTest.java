package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort3() {
        int[] data = new int[]{14, 187, 2};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{2, 14, 187};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort5() {
        int[] data = new int[]{68, 12, 1, 7, 787};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 7, 12, 68, 787};
        assertThat(result).containsExactly(expected);
    }
}