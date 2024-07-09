
import java.util.ArrayList;
import java.util.List;

public class FindCommonInThree {
    public static List<Integer> usingList(List<Integer> ar1, List<Integer> ar2, List<Integer> ar3) {
        List<Integer> ref = new ArrayList<>();
        List<Integer> finalList = new ArrayList<>();

        for (int i : ar1) {
            if (ar2.contains(i))
                ref.add(i);
        }

        for (int i : ref) {
            if (ar3.contains(i))
                finalList.add(i);
        }

        return finalList;
    }

    public static void usingArray(int[] ar1, int[] ar2, int[] ar3) {
        int i = 0, j = 0, k = 0;

        while (i < ar1.length && j < ar2.length && k < ar3.length) {
            // System.out.println(ar1[i] + " " + ar2[j] + " " + ar3[k] + " ");
            if (ar1[i] == ar2[j] && ar2[j] == ar3[k]) {
                System.out.print(ar1[i] + " ");
                i++;
                j++;
                k++;
            } else if (ar1[i] < ar2[j])
                i++;
            else if (ar2[j] < ar3[k])
                j++;
            else
                k++;
        }
    }

    public static void main(String[] args) {
        // List<Integer> ar1 = List.of(1, 5, 10, 20, 40, 80);
        // List<Integer> ar2 = List.of(6, 7, 20, 80, 100);
        // List<Integer> ar3 = List.of(3, 4, 15, 20, 30, 70, 80, 120);

        // List<Integer> finalList = usingList(ar1, ar2, ar3);

        // for (int num : finalList) {
        // System.out.print(num + " ");
        // }
        // System.out.println();

        System.out.println();

        int ar1[] = { 1, 5, 10, 20, 40, 80 };
        int ar2[] = { 6, 7, 20, 80, 100 };
        int ar3[] = { 3, 4, 15, 20, 30, 70, 80, 120 };

        usingArray(ar1, ar2, ar3);
    }
}
