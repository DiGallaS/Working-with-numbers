package WorkingWithNumbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>(Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4));
        Collections.sort(intList);
        intList.removeIf(x -> x < 1);
        intList.removeIf(x -> x % 2 != 0);
        for (int i : intList) {
            System.out.println(i);
        }
    }
}
