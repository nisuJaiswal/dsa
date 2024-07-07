package Arrays;

public class MergeSortedArray {
    public static void mergeArrays(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = nums2.length - 1;
        int k = m + n - 1;

        while (j >= 0) {
            if (i >= 0 && nums1[i] < nums2[j]) {
                nums1[k--] = nums2[j--];
            } else {
                nums1[k--] = nums1[i--];
            }
        }

    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int[] nums2 = { 2, 5, 6 };
        mergeArrays(nums1, 3, nums2, 3);
        System.out.println();
        for (int i : nums1)
            System.out.print(i + " ");
    }
}
