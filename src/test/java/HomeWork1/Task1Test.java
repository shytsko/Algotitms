package HomeWork1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class Task1Test {

    @Test
    void testFibonacciRecursion() {
        Assertions.assertEquals(0, Task1.fibonacciRecursion(0));
        Assertions.assertEquals(1, Task1.fibonacciRecursion(1));
        Assertions.assertEquals(55, Task1.fibonacciRecursion(10));
        Assertions.assertEquals(6765, Task1.fibonacciRecursion(20));
        Assertions.assertThrows(IllegalArgumentException.class, () -> Task1.fibonacciRecursion(-3));
    }

    @Test
    void testFibonacciLinear() {
        Assertions.assertEquals(0, Task1.fibonacciLinear(0));
        Assertions.assertEquals(1, Task1.fibonacciLinear(1));
        Assertions.assertEquals(55, Task1.fibonacciLinear(10));
        Assertions.assertEquals(6765, Task1.fibonacciLinear(20));
        Assertions.assertThrows(IllegalArgumentException.class, () -> Task1.fibonacciLinear(-3));
    }

    @Test
    void testSumDiagonal() {
        int[][] matrix3 = {{1, 2, 3},
                {4, 5, 6},
                {1, 1, 1}};

        int[][] matrix5 = {{0, 1, 2, 3, 4},
                {5, 6, 7, 8, 9},
                {9, 8, 7, 6, 5},
                {4, 3, 2, 1, 0},
                {1, 2, 3, 4, 5}};

        int[][] illegalMatrix = {{1, 2, 3},
                {4, 6},
                {7, 8, 9}};

        Assertions.assertEquals(7, Task1.sumMainDiagonal(matrix3));
        Assertions.assertEquals(9, Task1.sumSecondaryDiagonal(matrix3));
        Assertions.assertEquals(19, Task1.sumMainDiagonal(matrix5));
        Assertions.assertEquals(23, Task1.sumSecondaryDiagonal(matrix5));
        Assertions.assertThrows(IllegalArgumentException.class, () -> Task1.sumMainDiagonal(illegalMatrix));
        Assertions.assertThrows(IllegalArgumentException.class, () -> Task1.sumSecondaryDiagonal(illegalMatrix));
    }

    @Test
    void testShiftArray() {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arrayShiftRight1 = {9, 0, 1, 2, 3, 4, 5, 6, 7, 8};
        int[] arrayShiftRight4 = {6, 7, 8, 9, 0, 1, 2, 3, 4, 5};
        int[] arrayShiftLeft7 = {7, 8, 9, 0, 1, 2, 3, 4, 5, 6};

        int[] testArray = array.clone();
        Task1.shiftArray(testArray, 1);
        Assertions.assertArrayEquals(arrayShiftRight1, testArray);
        Task1.shiftArray(testArray, -1);
        Assertions.assertArrayEquals(array, testArray);
        Task1.shiftArray(testArray, 4);
        Assertions.assertArrayEquals(arrayShiftRight4, testArray);
        Task1.shiftArray(testArray, -4);
        Assertions.assertArrayEquals(array, testArray);
        Task1.shiftArray(testArray, -7);
        Assertions.assertArrayEquals(arrayShiftLeft7, testArray);
        Task1.shiftArray(testArray, 7);
        Assertions.assertArrayEquals(array, testArray);
        Task1.shiftArray(testArray, 44);
        Assertions.assertArrayEquals(arrayShiftRight4, testArray);
        Task1.shiftArray(testArray, -64);
        Assertions.assertArrayEquals(array, testArray);
    }

}