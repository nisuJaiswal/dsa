import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int curr = arr[i];

            int j = i - 1;

            while (j >= 0 && arr[j] > curr) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[++j] = curr;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 3, 1, 2, 4 };
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
