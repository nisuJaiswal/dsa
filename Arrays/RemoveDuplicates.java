package Arrays;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        int i = 0;
        int j;

        for (j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                nums[i + 1] = nums[j];
                i++;
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        System.out.println();
        int res = removeDuplicates(nums);
        for (int i = 0; i < res; i++)
            System.out.print(nums[i] + " ");
    }
}
