package Arrays;

import java.util.Arrays;

public class KthSmallest {
    public static int getKthSmallest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[k - 1];
    }

    public static void main(String[] args) {
        int[] arr = { 12, 3, 5, 7, 19 };
        System.out.println("\n Kth Smallest: " + getKthSmallest(arr, 3));
    }
}
