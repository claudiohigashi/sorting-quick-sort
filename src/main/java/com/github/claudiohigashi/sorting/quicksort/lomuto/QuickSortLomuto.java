package com.github.claudiohigashi.sorting.quicksort.lomuto;

/**
 * Reference:
 * https://en.wikipedia.org/wiki/Quicksort
 * Lomuto partition scheme
 */
public class QuickSortLomuto {

    public static void sort(int[] a) {
        sort(a, 0, a.length - 1);
    }

    private static void sort(int[] a, int lo, int hi) {
        // Ensure indices are in correct order
        if (lo >= hi || lo < 0) {
            return;
        }

        // Partition array and get the pivot index
        int p = partition(a, lo, hi);

        // Sort the two partitions
        sort(a, lo, p - 1); // Left side of pivot
        sort(a, p + 1, hi); // Right side of pivot
    }

    private static int partition(int[] a, int lo, int hi) {
        int pivot = a[hi]; // Choose the last element as the pivot

        // Temporary pivot index
        int i = lo - 1;

        for (int j = lo; j <= hi - 1; j++) {
            // If the current element is less than or equal to the pivot
            if (a[j] <= pivot) {
                // Move the temporary pivot index forward
                i++;
                // Swap the current element with the element at the temporary pivot index
                swap(a, i, j);
            }
        }
        // Move the pivot element to the correct pivot position (between the smaller and larger elements)
        i++;
        swap(a, i, hi);

        return i; // the pivot index
    }

    private static void swap(int[] a, int i, int j) {
        int array_i = a[i];
        a[i] = a[j];
        a[j] = array_i;
    }


}
