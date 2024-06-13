package SearchingSorting;

import java.util.*;

public class TwoArraySumGreaterThanK {
    public static boolean isGreater(Integer[] a, int[] b, int k) {
        Arrays.sort(a, Collections.reverseOrder());
        Arrays.sort(b);

        for (int i = 0; i < a.length; i++) {
            if (a[i] + b[i] < k)
                return false;
        }

        return true;

    }

    public static void main(String[] args) {
        System.out.println();
        Integer a[] = { 2, 1, 3 };
        int b[] = { 7, 8, 9 };
        int k = 10;

        if (isGreater(a, b, k))
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}
