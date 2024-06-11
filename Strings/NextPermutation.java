import java.util.ArrayList;
import java.util.List;

public class NextPermutation {
    public static List<Integer> nextPermutation(int N, int[] arr) {
        // Find the breaking point in array (index)

        int breakingIndex = -1;
        for (int i = N - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                breakingIndex = i;
                break;
            }

        }
        if (breakingIndex == -1) {
            reverse(arr, 0, N - 1);
        } else {
            // Find the point to swap breakingPoint with
            int another = N - 1;
            while (arr[another] <= arr[breakingIndex])
                another--;

            swap(arr, breakingIndex, another);
            reverse(arr, breakingIndex + 1, N - 1);
        }

        return intoList(arr);
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    public static List<Integer> intoList(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int i : arr)
            list.add(i);
        return list;
    }

    public static void main(String[] args) {
        int[] ques = { 1, 2, 1 };
        System.out.println();
        List<Integer> res = nextPermutation(ques.length, ques);

        for (int i : res) {
            System.out.print(i);
        }
    }
}
