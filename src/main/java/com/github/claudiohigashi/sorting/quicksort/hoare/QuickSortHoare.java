package com.github.claudiohigashi.sorting.quicksort.hoare;

/**
 * Reference:
 * https://en.wikipedia.org/wiki/Quicksort
 * Hoare partition scheme
 */
public class QuickSortHoare {
    public static void sort(int[] a) {
        quicksort(a, 0, a.length - 1);
    }

    private static void quicksort(int[] a, int lo, int hi) {
        if (lo >= 0 && hi >= 0 && lo < hi) {
            int p = partition(a, lo, hi);
            quicksort(a, lo, p); // Note: the pivot is now included
            quicksort(a, p + 1, hi);
        }
    }

    private static int partition(int[] a, int lo, int hi) {
        // Pivot value
        int pivot = a[(int) Math.floor((hi + lo) / 2)]; // The value in the middle of the array

        // Left index
        int i = lo - 1;

        // Right index
        int j = hi + 1;

        while (true) {
            // Move the left index to the right at least once and while the element at
            // the left index is less than the pivot
            do {
                i = i + 1;
            } while (a[i] < pivot);

            // Move the right index to the left at least once and while the element at
            // the right index is greater than the pivot
            do {
                j = j - 1;
            } while (a[j] > pivot);

            // If the indices crossed, return
            if (i >= j) {
                return j;
            }

            // Swap the elements at the left and right indices
            swap(a, i, j);
        }
    }

    private static void swap(int[] a, int i, int j) {
        int array_i = a[i];
        a[i] = a[j];
        a[j] = array_i;
    }


}
