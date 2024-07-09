
import java.util.Arrays;

public class MInDiffBetweenMinMaxInThreeMoves {
    public static int giveDiff(int[] arr) {
        if (arr.length <= 4)
            return 0;

        Arrays.sort(arr);
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < 4; i++) {
            System.out.println(res + " " + arr[arr.length - 4 + i] + " " + arr[i]);
            res = Math.min(res, arr[arr.length - 4 + i] - arr[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 5, 0, 10, 14 };
        // 0 1 5 10 14
        System.out.println();
        System.out.println(giveDiff(arr));
    }
}
