// Найти простые числа до n

package Seminar1;

import java.util.ArrayList;
import java.util.List;

public class Task2 {

    public static void main(String[] args) {
        System.out.println(printSimpleNumbers2(100));
    }

    static public List<Integer> printSimpleNumbers(int n) {
        List<Integer> simpleList = new ArrayList<>();
        if (n < 2)
            return simpleList;
        simpleList.add(2);
        for (int i = 3; i < n; i += 2) {
            boolean simple = true;
            for (int j = 2; j < Math.sqrt(i) + 1; j++) {
                if (i % j == 0) {
                    simple = false;
                    break;
                }
            }
            if (simple)
                simpleList.add(i);
        }
        return simpleList;
    }

    static public List<Integer> printSimpleNumbers2(int n) {
        List<Integer> simpleList = new ArrayList<>();
        boolean[] used = new boolean[n + 1];

        int currentNumber = 2;
        while (currentNumber <= n) {
            if (!used[currentNumber]) {
                simpleList.add(currentNumber);

                int usedIndex = currentNumber;
                while (usedIndex <= n) {
                    used[usedIndex] = true;
                    usedIndex += currentNumber;
                }
            }
            currentNumber++;
        }
        return simpleList;
    }
}
