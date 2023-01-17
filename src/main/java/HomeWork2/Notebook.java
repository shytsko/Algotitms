// Класс Notebook содержит поля:
// Стоимость - price, double [100, 200, 300, 400, 500, 600, 700, 800]
// Оперативная память - ram, integer [4, 8, 16, 20, 24, 28, 32]
// Производитель - brand, enum Перечисление Brand может принимать следующие значения: Lenuvo, Asos, MacNote, Eser, Xamiou.
// Сортировать нужно в этом же порядке (т.е. Lenuvo имеет наивысший приоритет).
// Отсортировать по стоимости, по памяти, по перечислению (в таком порядке)

package HomeWork2;

import java.util.Arrays;
import java.util.Random;

public class Notebook implements Comparable<Notebook> {

    enum Brand {
        LENUVO("Lenuvo"),
        ASOS("Asos"),
        MACNOTE("MacNote"),
        ESER("Eser"),
        XAMIOU("Xamiou");

        private String title;

        Brand(String title) {
            this.title = title;
        }

        public String getTitle() {
            return this.title;
        }

        @Override
        public String toString() {
            return this.title;
        }
    };

    private static double[] PRICE_VALUES = {100, 200, 300, 400, 500, 600, 700, 800};
    private static int[] RAM_VALUES = {4, 8, 16, 20, 24, 28, 32};

    private double price;
    private int ram;
    private Brand brand;

    public Notebook() {
        Random rnd = new Random();
        price = PRICE_VALUES[rnd.nextInt(PRICE_VALUES.length)];
        ram = RAM_VALUES[rnd.nextInt(RAM_VALUES.length)];
        Brand[] brands = Brand.values();
        brand = brands[rnd.nextInt(brands.length)];
    }

    @Override
    public String toString() {
        return "Notebook{"
                + "price=" + price
                + " ram=" + ram
                + " brand=" + brand
                + '}';
    }

    @Override
    public int compareTo(Notebook o) {
        int compare = Double.compare(this.price, o.price);
        if (compare != 0)
            return compare;
        compare = Integer.compare(this.ram, o.ram);
        if (compare != 0)
            return compare;
        return Integer.compare(this.brand.ordinal(), o.brand.ordinal());
    }
}
