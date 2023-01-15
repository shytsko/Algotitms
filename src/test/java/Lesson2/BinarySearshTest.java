package Lesson2;

import HomeWork1.Task1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearshTest {

    @Test
    void testBinarySearsh() {
        int[] array = {-100, -68, -55, -16, 0, 10, 16, 34, 41, 58, 61, 79, 88, 100};

        Assertions.assertEquals(5, BinarySearsh.binarySearsh(array, 10));
        Assertions.assertEquals(0, BinarySearsh.binarySearsh(array, -100));
        Assertions.assertEquals(13, BinarySearsh.binarySearsh(array, 100));
        Assertions.assertEquals(10, BinarySearsh.binarySearsh(array, 61));
        Assertions.assertEquals(-1, BinarySearsh.binarySearsh(array, 11));
    }
}