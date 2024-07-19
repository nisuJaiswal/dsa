
import java.util.*;

public class LuckyNumbers {
    public static List<Integer> getLuckyNumbers(int[][] arr) {
        List<Integer> res = new ArrayList<>();
        int[] rowMins = new int[arr.length];
        int[] colMaxes = new int[arr[0].length];

        for (int i = 0; i < arr.length; i++) {
            int rowMin = arr[i][0];
            for (int j = 0; j < arr[0].length; ++j) {
                rowMin = Math.min(rowMin, arr[i][j]);
            }
            rowMins[i] = rowMin;
        }

        for (int i = 0; i < arr[0].length; ++i) {
            int colMax = arr[0][i];
            for (int j = 0; j < arr.length; ++j) {
                colMax = Math.max(colMax, arr[j][i]);
            }
            colMaxes[i] = colMax;
        }

        for (int i = 0; i < rowMins.length; ++i) {
            for (int j = 0; j < colMaxes.length; ++j) {
                if (rowMins[i] == colMaxes[j])
                    res.add(colMaxes[j]);
            }
        }

        // System.out.println(Arrays.toString(rowMins));
        // System.out.println(Arrays.toString(colMaxes));

        return res;
    }

    public static void main(String[] args) {
        int[][] arr = {
                { 3, 7, 8 },
                { 9, 11, 13 },
                { 15, 16, 17 }
        };
        List<Integer> res = getLuckyNumbers(arr);
        System.out.println();
        for (int i : res)
            System.out.print(i + " ");
    }
}
