package Arrays;

public class RemoveElement {
    public static int removeElement(int[] nums, int k) {
        int i = 0, j = nums.length - 1;

        while (i <= j) {
            if (nums[i] == k) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                j--;
            } else
                i++;
        }

        return j + 1;

    }

    public static void main(String[] args) {
        int[] arr = { 3, 2, 2, 3 };
        System.out.println();
        int res = removeElement(arr, 3);
        System.out.println(res + " ");
        for (int i : arr)
            System.out.print(i + " ");
    }
}
