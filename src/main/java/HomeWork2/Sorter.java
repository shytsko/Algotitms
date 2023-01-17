package HomeWork2;

public class Sorter {
    public static <T extends Comparable<T>> void bubbleSort(T[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    swap(array, j, j + 1);
                }
            }
        }
    }

    public static <T extends Comparable<T>> void insertionSort(T[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(array[i - 1]) < 0) {
                int j = i - 1;
                T temp = array[i];
                while (j >= 0 && temp.compareTo(array[j]) < 0) {
                    array[j + 1] = array[j];
                    j--;
                }
                array[j + 1] = temp;
            }
        }
    }

    public static <T extends Comparable<T>> void quickSort(T[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private static <T extends Comparable<T>> void quickSort(T[] array, int leftIndex, int rightIndex) {
        if (rightIndex <= leftIndex)
            return;

        int pivotIndex = partitionArray(array, leftIndex, rightIndex);
        quickSort(array, leftIndex, pivotIndex - 1);
        quickSort(array, pivotIndex + 1, rightIndex);
    }

    private static <T extends Comparable<T>> int partitionArray(T[] array, int leftIndex, int rightIndex) {
        int pivotIndex = choosePivot(array, leftIndex, rightIndex);
        swap(array, leftIndex, pivotIndex);
        T pivot = array[leftIndex];
        int partIndex = leftIndex + 1;
        for (int i = leftIndex + 1; i <= rightIndex; i++) {
            if (array[i].compareTo(pivot) < 0) {
                swap(array, i, partIndex);
                partIndex++;
            }
        }
        swap(array, leftIndex, partIndex - 1);
        return partIndex - 1;
    }

    private static <T> int choosePivot(T[] array, int leftIndex, int rightIndex) {
        return (leftIndex + rightIndex) / 2;
    }


    private static <T> void swap(T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
