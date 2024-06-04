package Arrays;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KthLargestElement {
    public static int usingSorting(int[] arr, int k) {
        Arrays.sort(arr);
        return arr[arr.length - k];
    }

    public static int usingHeap(int[] arr, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for (int i = 0; i < k; i++) {
            heap.add(arr[i]);
        }

        for (int i = k; i < arr.length; i++) {
            if (arr[i] > heap.peek()) {
                heap.remove();
                heap.add(arr[i]);
            }
        }
        return heap.peek();
    }

    public static void main(String[] args) {
        int[] arr = { 3, 2, 1, 5, 6, 4 };
        System.out.println("\n Using Sorting approach: " + usingSorting(arr, 5));
        System.out.println("\n Using Heap approach: " + usingHeap(arr, 5));
    }
}