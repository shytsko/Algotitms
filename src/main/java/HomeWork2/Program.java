// Класс Notebook содержит поля:
// Стоимость - price, double [100, 200, 300, 400, 500, 600, 700, 800]
// Оперативная память - ram, integer [4, 8, 16, 20, 24, 28, 32]
// Производитель - brand, enum Перечисление Brand может принимать следующие значения: Lenuvo, Asos, MacNote, Eser, Xamiou.
// Сортировать нужно в этом же порядке (т.е. Lenuvo имеет наивысший приоритет).
// Отсортировать по стоимости, по памяти, по перечислению (в таком порядке)

package HomeWork2;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class Program {
    public static void main(String[] args) {
        Notebook[] notebooks = notebooksMaker(100);
        Sorter.quickSort(notebooks);
        printArray(notebooks);
    }

    static public void printArray(Notebook[] array) {
        for (Notebook nout : array) {
            System.out.println(nout);
        }
    }

    private static Notebook[] notebooksMaker(int count) {
        Notebook[] notebooks = new Notebook[count];
        for (int i = 0; i < notebooks.length; i++) {
            notebooks[i] = new Notebook();
        }
        return notebooks;
    }
}
