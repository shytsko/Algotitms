package Lesson2;

public class Sorting {
    public static void quickSorting(int[] array) {
        quickSorting(array, 0, array.length - 1);
    }

    private static void quickSorting(int[] array, int leftIndex, int rightIndex) {
        if (rightIndex <= leftIndex)
            return;

        int pivotIndex = partitionArray(array, leftIndex, rightIndex);
        quickSorting(array, leftIndex, pivotIndex - 1);
        quickSorting(array, pivotIndex + 1, rightIndex);
    }

    private static int partitionArray(int[] array, int leftIndex, int rightIndex) {
        int pivotIndex = choosePivot(array, leftIndex, rightIndex);
        swap(array, leftIndex, pivotIndex);
        int pivot = array[leftIndex];
        int partIndex = leftIndex + 1;
        for (int i = leftIndex + 1; i <= rightIndex; i++) {
            if (array[i] < pivot) {
                swap(array, i, partIndex);
                partIndex++;
            }
        }
        swap(array, leftIndex, partIndex - 1);
        return partIndex - 1;
    }

    private static int choosePivot(int[] array, int leftIndex, int rightIndex) {
        return (leftIndex + rightIndex) / 2;
    }

    private static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}