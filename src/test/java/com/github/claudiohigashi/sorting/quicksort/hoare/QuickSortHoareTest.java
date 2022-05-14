package com.github.claudiohigashi.sorting.quicksort.hoare;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class QuickSortHoareTest {
    @Test
    void sort() {
        int[] array = new int[]{3, 7, 8, 5, 2, 1, 9, 5, 4};
        QuickSortHoare.sort(array);
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 5, 7, 8, 9}, array);
    }
}