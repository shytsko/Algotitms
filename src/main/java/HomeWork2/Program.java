// Класс Notebook содержит поля:
// Стоимость - price, double [100, 200, 300, 400, 500, 600, 700, 800]
// Оперативная память - ram, integer [4, 8, 16, 20, 24, 28, 32]
// Производитель - brand, enum Перечисление Brand может принимать следующие значения: Lenuvo, Asos, MacNote, Eser, Xamiou.
// Сортировать нужно в этом же порядке (т.е. Lenuvo имеет наивысший приоритет).
// Отсортировать по стоимости, по памяти, по перечислению (в таком порядке)

package HomeWork2;

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
