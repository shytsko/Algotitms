package HomeWork2;

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        Integer[] array = {1, 9, 6, 4, 8, 7, 5, 3, 0, 2};
        Sorter.insertionSort(array);

        Notebook[] notebooks = new Notebook[100];
        for (int i = 0; i < notebooks.length; i++) {
            notebooks[i] = new Notebook();
        }
        printArray(notebooks);
        System.out.println("--------------------------");
        Sorter.insertionSort(notebooks);
        printArray(notebooks);
    }

    static public void printArray(Notebook[] array) {
        for (Notebook nout : array) {
            System.out.println(nout);
        }
    }
}
