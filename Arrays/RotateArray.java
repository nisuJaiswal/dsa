// package Arrays;

import java.util.Arrays;

public class RotateArray {
    public static int[][] usingThirdArray(int[][] arr) {
        int len = arr.length;
        int[][] res = new int[len][len];

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; ++j) {
                res[i][j] = arr[len - 1 - j][i];
            }
        }

        return res;
    }

    public static void reverseRow(int[] arr, int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start += 1;
            end = -1;
        }
    }

    public static int[][] efficiantWay(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; ++j) {
                if (!(j == i)) {
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }
        }
        for (int[] row : arr)
            reverseRow(row, 0, arr.length - 1);
        return arr;
    }

    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }
        };
        System.out.println();
        // int[][] res = usingThirdArray(arr);
        int[][] res = efficiantWay(arr);

        for (int[] row : res)
            System.out.println(Arrays.toString(row));
    }
}
