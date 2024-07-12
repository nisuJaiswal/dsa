public class RotateArrayKTimes {
    public static void reverseArr(int[] nums, int left, int right) {
        while (left <= right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left += 1;
            right -= 1;
        }
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        int n = nums.length;
        int k = 3;
        reverseArr(nums, 0, n - k - 1);
        reverseArr(nums, n - k, n - 1);
        reverseArr(nums, 0, n - 1);
        System.out.println();
        for (int i : nums)
            System.out.print(i + " ");
    }
}
