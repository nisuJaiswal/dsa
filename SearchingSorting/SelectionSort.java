import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {

            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[min] > arr[j])
                    min = j;
            }

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 2, 3, 4, 1 };
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
