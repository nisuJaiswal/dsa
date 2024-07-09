
public class MaxSubArray {
    public static int maxSubArray(int[] arr) {
        int currentSum = 0, maxSum = Integer.MIN_VALUE;

        for (int el : arr) {
            currentSum += el;
            if (currentSum > maxSum)
                maxSum = currentSum;

            if (currentSum < 0)
                currentSum = 0;
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int arr[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println("\nMaximum Sub Array: " + maxSubArray(arr));

    }
}
