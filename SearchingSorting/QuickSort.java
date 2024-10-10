import java.util.Arrays;

public class QuickSort {
    public static int partition(int[] arr, int start, int end) {
        int pivot = arr[start];
        int i = start - 1;
        int j = end + 1;

        while (true) {
            do {
                i++;
            } while (arr[i] < pivot);

            do {
                j--;
            } while (arr[j] > pivot);

            if (i >= j) {
                return j;
            }

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }

        // int pivot = arr[start];
        // int i = start - 1;
        // int j = end + 1;

        // while (true) {
        // do {
        // i++;
        // } while (arr[i] < pivot);

        // do {
        // j--;
        // } while (arr[j] > pivot);
        // if (i >= j)
        // return j;

        // int temp = arr[i];
        // arr[i] = arr[j];
        // arr[j] = temp;

        // }

    }

    public static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int pivotIndex = partition(arr, start, end);
            quickSort(arr, start, pivotIndex);
            quickSort(arr, pivotIndex + 1, end);
        }
    }

    public static void main(String[] ar) {
        int[] arr = { 4, 10, 3, 5, 1 };
        quickSort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));

    }
}