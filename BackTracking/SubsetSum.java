package BackTracking;
// Intution:

// Step 1: If the sum of all the elements in the array is odd then it is not possible to devide array in subarrays, so return false immediately
// Step 2: Create a boolean array dp that contains first value true and rest of them are false
// Step 3: Size of this dp is half of the sum + 1;
// Step 4: Store the first element to true in dp as 0 can be devided into 2 sub arrays
// Step 5: Iterate through the each number in input array
// Step 6: Strting from last element i.e. target to the given number in array, set dp value
// Step 7: dp[j] = dp[j] || dp[j - num]
// Step 8: After all the iterations, return the value of target index of the dp array.

public class SubsetSum {
    public static int isPossible(int[] arr) {
        int total = 0;
        for (int i : arr)
            total += i;

        if (total % 2 == 1)
            return 0;

        int target = total / 2;
        boolean[] dp = new boolean[target + 1];
        dp[0] = true;

        for (int num : arr) {
            for (int j = target; j >= num; j--)
                dp[j] = dp[j] || dp[j - num];

            // for (boolean x : dp)
            // System.out.print(x + " ");

            // System.out.println();
        }

        return dp[target] ? 1 : 0;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 5, 11 };
        int res = isPossible(arr);
        if (res == 1)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
