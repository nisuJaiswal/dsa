
public class MaxProdSubarray {
    public static int getRes(int[] nums) {
        int res = nums[0];
        int minProd = nums[0], maxProd = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                int temp = maxProd;
                maxProd = minProd;
                minProd = temp;
            }
            maxProd = Math.max(nums[i], maxProd * nums[i]);
            minProd = Math.min(nums[i], maxProd * nums[i]);

            res = Math.max(res, maxProd);
        }

        return res;
    }

    public static void main(String[] args) {
        int arr[] = { -1, 0, -1 };
        System.out.println("\n Result: " + getRes(arr));
    }
}