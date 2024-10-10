import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {

    public static void merge(int[] arr, int start, int mid, int end) {
        // int[] temp = new int[end - start + 1];
        ArrayList<Integer> list = new ArrayList<>();

        int i = start, j = mid + 1;

        while (i <= mid && j <= end) {
            if (arr[i] < arr[j])
                list.add(arr[i++]);
            else
                list.add(arr[j++]);
        }

        while (i <= mid)
            list.add(arr[i++]);
        while (j <= end)
            list.add(arr[j++]);

        for (int x = 0, y = start; x < list.size(); x++, y++) {
            arr[y] = list.get(x);
        }

    }

    public static void mergeSort(int[] arr, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;

            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);

            merge(arr, start, mid, end);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 4, 2, 1, 3 };
        mergeSort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }
}
