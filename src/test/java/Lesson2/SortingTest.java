package Lesson2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class SortingTest {

    @Test
    void testQuickSorting() {
        int[] testArray =   {2, 0, 8, 6, 3, 5, 4, 9, 1, 7, 0, 5, 3, 3, 6};
        int[] sortedArray = {0, 0, 1, 2, 3, 3, 3, 4, 5, 5, 6, 6, 7, 8, 9};
        Sorting.quickSorting(testArray);
        Assertions.assertArrayEquals(sortedArray, testArray);
        testArray = new int[10000];
        Random random = new Random();
        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = random.nextInt();
        }
        sortedArray = testArray.clone();
        Sorting.quickSorting(testArray);
        Arrays.sort(sortedArray);
        Assertions.assertArrayEquals(sortedArray, testArray);
        
    }

    @Test
    void testHeapSorting() {
        int[] testArray =   {2, 0, 8, 6, 3, 5, 4, 9, 1, 7, 0, 5, 3, 3, 6};
        int[] sortedArray = {0, 0, 1, 2, 3, 3, 3, 4, 5, 5, 6, 6, 7, 8, 9};
        Sorting.heapSorting(testArray);
        Assertions.assertArrayEquals(sortedArray, testArray);
        testArray = new int[10000];
        Random random = new Random();
        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = random.nextInt();
        }
        sortedArray = testArray.clone();
        Sorting.heapSorting(testArray);
        Arrays.sort(sortedArray);
        Assertions.assertArrayEquals(sortedArray, testArray);

    }
}