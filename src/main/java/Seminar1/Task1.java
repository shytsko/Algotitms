
/**
 * Найти такой индекс в массиве, что сумма элементов слева и справа равны.
 * [1, 2, 5, 7, 12, 5, 3, 7] -> 4
 */

package Seminar1;

public class Task1 {

    public static void main(String[] args) {
        System.out.println(findCenter(new int[]{1, 2, 5, 7, 12, 5, 3, 7}));
    }


    public static int findCenter(int[] array) {
        int sumRight = 0;
        for (int k : array) {
            sumRight += k;
        }

        int sumLeft = 0;
        for (int i = 0; i < array.length; i++) {
            sumRight-=array[i];
            if(sumLeft == sumRight)
                return i;
            sumLeft+=array[i];
        }
        return -1;
    }
}

//
//    /**
//     * Найти такой индекс в массиве, что сумма элементов слева и справа равны.
//     * [1, 2, 5, 7, 12, 5, 3, 7] -> 4
//     */
//    public static int findCenter(int[] array) {
//        // TODO: 12.01.2023
//        throw new UnsupportedOperationException();
//    }
