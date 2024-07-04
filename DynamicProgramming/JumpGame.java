package DynamicProgramming;

public class JumpGame {
    public static boolean canJump(int[] arr) {
        if (arr.length <= 1)
            return true;
        boolean[] dp = new boolean[arr.length];
        dp[arr.length - 1] = true;
        // System.out.println("hello");

        for (int i = dp.length - 1; i >= 0; i--) {
            if (dp[i]) {
                for (int j = 0; j < i; j++) {
                    if (arr[j] >= i - j) {
                        dp[j] = true;
                        if (dp[0] == true)
                            return true;
                    }
                }
            }
            // System.out.println();
            // for (boolean x : dp)
            // System.out.print(x + " ");
        }
        return dp[0];

    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 1, 1, 4 };
        System.out.println();
        System.out.println(canJump(arr));
    }
}
